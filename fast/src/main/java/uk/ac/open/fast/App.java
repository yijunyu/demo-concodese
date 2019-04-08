package uk.ac.open.fast;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import fast_.Data;
import fast_.Element;

import uk.ac.open.crc.intt.IdentifierNameTokeniser;
import uk.ac.open.crc.intt.IdentifierNameTokeniserFactory;
// import uk.org.facetus.jim.core.FileData;

public final class App {
    private static IdentifierNameTokeniserFactory factory = new IdentifierNameTokeniserFactory();
    private static IdentifierNameTokeniser tokeniser = factory.create();
    static {
        factory.setSeparatorCharacters("._$");
    }
    private Map<String, Set<String>> identifierTerms = new HashMap<String, Set<String>>();
    private Map<String, Set<String>> commentTerms = new HashMap<String, Set<String>>();

    public Map<String, Set<String>> getIdentifierTerms() {
        return identifierTerms;
    }

    public Map<String, Set<String>> getCommentTerms() {
        return commentTerms;
    }        

    private App(String source) {
        try {
            callFast(source);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Interface to the fast utility.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App app = new App(args[0]);
    }

    private static String unit = "";

    private static void tree(App app, int parent, fast_.Element element) {
        int type = element.type().srcmlKind();
        if (type == 0) {
            unit = "/" + element.extra().unit().filename();
        }
        String text = element.text();
        if (type == fast_.SrcmlKind.NAME && text != null && !text.equals("")) { // NAME
            if (!(parent == fast_.SrcmlKind.IMPORT || parent == fast_.SrcmlKind.PACKAGE
                    || parent == fast_.SrcmlKind.TYPE || parent == fast_.SrcmlKind.OPERATOR
                    || parent == fast_.SrcmlKind.ARGUMENT || parent == fast_.SrcmlKind.PSEUDO_PARAMETER_LIST
                    || parent == fast_.SrcmlKind.NAME || parent == fast_.SrcmlKind.SPECIFIER)) {
                Set<String> set = app.identifierTerms.get(unit);
                if (set == null) {
                    set = new TreeSet<String>();
                }
                set.add(text);
                app.identifierTerms.put(unit, set);
            }
        } else if (type == fast_.SrcmlKind.COMMENT) {
            // text = text.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",
            // "$1");
            text = text.replaceAll("/\\*+", "");
            text = text.replaceAll("\\*+/", "");
            text = text.replaceAll("//+", "");
            text = text.replaceAll("@", "");
            text = text.replaceAll(",", "");
            text = text.replaceAll("=", "");
            text = text.replaceAll("\\.", "");
            text = text.replaceAll("\n", "");
            text = text.replaceAll("\\*", "");
            text = text.replaceAll("\t", "");
            text = text.replaceAll("\\(", "");
            text = text.replaceAll("\\)", "");
            text = text.replaceAll("\\+", "");
            text = text.replaceAll("-", "");
            text = text.replaceAll("/", "");
            String[] toks = text.split(" ");
            for (int k = 0; k < toks.length; k++) {
                if (!toks[k].equals("")) {
                    Set<String> set = app.commentTerms.get(unit);
                    if (set == null)
                        set = new TreeSet<String>();
                    set.add(toks[k]);
                    app.commentTerms.put(unit, set);
                }
            }
        }
        if (element.childLength() > 0) {
            for (int i = 0; i < element.childLength(); i++)
                tree(app, type, element.child(i));
        }
    }

    public void callFast(String source) {
        String fbs_filename = "/tmp/t.fbs";
        if (!source.endsWith(".fbs")) {
            String cmd = "fast " + source + " /tmp/t.fbs";
            Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();    
        }
        File file = new File(fbs_filename);
        byte[] data = null;
        RandomAccessFile f = null;
        f = new RandomAccessFile(file, "r");
        data = new byte[(int) f.length()];
        f.readFully(data);
        f.close();
        ByteBuffer bb = ByteBuffer.wrap(data);
        Data record = Data.getRootAsData(bb);
        Element element = record.RecordType().element();
        if (element.childLength() > 0 && element.child(0).type().srcmlKind() == 0) {
            for (int i = 0; i < element.childLength(); i++) {
                tree(this, fast_.SrcmlKind.UNIT, element.child(i));
            }
        } else {
            tree(this, fast_.SrcmlKind.UNIT, element); // singleton
        }        
    }

}