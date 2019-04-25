package uk.ac.open.fast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public final class App {

    private Map<String, Set<String>> identifierTerms = new HashMap<String, Set<String>>();

    public Map<String, Set<String>> getIdentifierTerms(List<File> files) {
        identifierTerms.clear();
        try {
            callFast(files, true);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return identifierTerms;
    }

    private Map<String, Set<String>> commentTerms = new HashMap<String, Set<String>>();

    public Map<String, Set<String>> getCommentTerms(List<File> files) {
        commentTerms.clear();
        try {
            callFast(files, false);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return commentTerms;
    }

    public App() {
    }

    /**
     * Interface to the fast utility.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App app = new App();
        Map<String, Set<String>> terms;
        ArrayList<File> files = new ArrayList<File>();
        files.add(new File(args[0]));
        terms = app.getIdentifierTerms(files);
        for (String k : terms.keySet()) {
            for (String t : terms.get(k)) {
                System.out.println(k + ": " + t);
            }
        }
        terms = app.getCommentTerms(files);
        for (String k : terms.keySet()) {
            for (String t : terms.get(k)) {
                System.out.println(k + ": //" + t);
            }
        }
    }

    public void callFast(List<File> sources, boolean id_or_comment) throws Exception {
        File id_file = null;
        File comment_file = null;
        if (id_or_comment)
            id_file = File.createTempFile("tmpIds", ".txt", new File("/tmp"));
        else
            comment_file = File.createTempFile("tmpComments", ".txt", new File("/tmp"));
        File sh_file = File.createTempFile("tmp", ".sh", new File("/tmp"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(sh_file, true));
        if (id_or_comment)
            writer.append("echo > " + id_file.getAbsolutePath()+ "\n");
        else
            writer.append("echo > " + comment_file.getAbsolutePath()+ "\n");
        File xml_file = File.createTempFile("tmp", ".xml", new File("/tmp"));
        File pb_file = File.createTempFile("tmp", ".pb", new File("/tmp"));
        for (File source : sources) {
            writer.append("fast " + source.getAbsolutePath() + " " + xml_file.getAbsolutePath() + "\n");
            if (id_or_comment) {
                writer.append("fast -i 1 " + xml_file.getAbsolutePath() + " " + pb_file.getAbsolutePath() + " >> "
                        + id_file.getAbsolutePath() + "\n");
            } else {
                writer.append("fast -i 2 " + xml_file.getAbsolutePath() + " " + pb_file.getAbsolutePath() + " >> "
                        + comment_file.getAbsolutePath() + "\n");
            }
        }
        writer.close();
        String[] cmd;
        cmd = new String[] { "sh", sh_file.getAbsolutePath() };
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        xml_file.delete();
        pb_file.delete();
        sh_file.delete();
        InputStreamReader isr;
        if (id_or_comment)
            isr = new InputStreamReader(new FileInputStream(id_file));
        else
            isr = new InputStreamReader(new FileInputStream(comment_file));
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] file_content = line.split(";");
            if (file_content.length>1) {
                String filename = file_content[0];
                String content = file_content[1];
                String[] terms = content.split(" ");
                Set<String> termSet = new TreeSet<String>();
                for (String t : terms) {
                    String val = t.split("\\(")[0];
                    if (val.length() > 0)
                        termSet.add(val);
                }
                if (id_or_comment)
                    identifierTerms.put(filename, termSet);
                else
                    commentTerms.put(filename, termSet);    
            }
        }
        isr.close();
        if (id_or_comment)
            id_file.delete();
        else
            comment_file.delete();
    }

}
