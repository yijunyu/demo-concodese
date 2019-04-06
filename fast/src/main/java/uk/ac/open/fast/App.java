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
// Use INTT for tokenization of identifier names
// import uk.ac.open.crc.intt.IdentifierNameTokeniser;
// import uk.ac.open.crc.intt.IdentifierNameTokeniserFactory;

public final class App {
    // private static IdentifierNameTokeniserFactory factory = new IdentifierNameTokeniserFactory();
    // private static IdentifierNameTokeniser tokeniser = factory.create();
    // static {
    //     factory.setSeparatorCharacters("._$");
    // }

    private App() {
    }
    /**
     * Interface to the fast utility.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        callFast(args);
    }

    private static Map<String, Set<String>> identifierTerms = new HashMap<String, Set<String>>();
    private static Map<String, Set<String>> commentTerms = new HashMap<String, Set<String>>();

    public static Map<String, Set<String>> getIdentifierTerms() {
        return identifierTerms;
    }

    public static Map<String, Set<String>> getCommentTerms() {
        return commentTerms;
    }

    private static String unit = "";

    private static void tree(int parent, fast_.Element element) {
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
                Set<String> set = identifierTerms.get(unit);
                if (set == null) {
                    set = new TreeSet<String>();
                }
                set.add(text);
                identifierTerms.put(unit, set);
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
                    Set<String> set = commentTerms.get(unit);
                    if (set == null)
                        set = new TreeSet<String>();
                    set.add(toks[k]);
                    commentTerms.put(unit, set);
                }
            }
        }
        if (element.childLength() > 0) {
            for (int i = 0; i < element.childLength(); i++)
                tree(type, element.child(i));
        }
    }

    public static void callFast(String[] args) {
        if (args.length < 1) {
            // System.err.println("Usage: java -cp
            // /usr/lib/fast-1.0-SNAPSHOT.jar:/usr/lib/flatbuffers-java-1.10.0.jar:/usr/lib/intt.jar
            // uk.ac.open.fast.App <folder|flatbuffers> [ids|comments]");
            System.err.println(
                    "Usage: java -cp /usr/lib/fast-1.0-SNAPSHOT.jar:/usr/lib/flatbuffers-java-1.10.0.jar uk.ac.open.fast.App <folder|flatbuffers> [ids|comments]");
        }
        try {
            String flatbuffers_filename = "/tmp/t.fbs";
            if (!args[0].endsWith(".fbs")) {
                String cmd = "fast " + args[0] + " " + flatbuffers_filename;
                // System.out.println(cmd);
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } else {
                flatbuffers_filename = args[0];
            }
            File file = new File(flatbuffers_filename);
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
                    tree(fast_.SrcmlKind.UNIT, element.child(i));
                }
            } else {
                tree(fast_.SrcmlKind.UNIT, element); // singleton
            }
            if (args.length > 1 && args[1].equals("ids")) {
                System.out.println(getIdentifierTerms());
            } else if (args.length > 1 && args[1].equals("comments")) {
                System.out.println(getCommentTerms());
            } else if (args.length > 1) {
                System.out.println(getIdentifierTerms());
                System.out.println(getCommentTerms());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}