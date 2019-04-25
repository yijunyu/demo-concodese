package uk.ac.open.fast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
            for (File f : files)
                callFast(f, true);
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
            for (File f : files)
                callFast(f, false);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return commentTerms;
    }

    private boolean docker_exists;
    private App() {
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("docker version");
            proc.waitFor();
            int exitVal = proc.exitValue();
            docker_exists = (exitVal == 0);
        } catch (InterruptedException ex) {
            docker_exists = false;
        } catch (IOException ex) {
            docker_exists = false;
        }
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

    public void callFast(File source, boolean id_or_comment) throws Exception {

        File xml_file = File.createTempFile("tmp", ".xml", new File("/tmp"));
        File pb_file = File.createTempFile("tmp", ".pb", new File("/tmp"));
        String pn = "$(pwd)";
        if (source.getParentFile() != null)
            pn = source.getParentFile().getAbsolutePath();
        String[] cmd;
        if (docker_exists) {
            cmd = new String[] { "docker", "run", "--rm", "-v", pn + ":" + pn, "-v",
                    xml_file.getParentFile().getAbsolutePath() + ":" + xml_file.getParentFile().getAbsolutePath(), "-i",
                    "yijun/fast:latest", pn, xml_file.getAbsolutePath() };
        } else {
            cmd = new String[] { "fast", pn, xml_file.getAbsolutePath() };
        }
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        if (id_or_comment) {
            if (docker_exists)
                cmd = new String[] { "docker", "run", "--rm", "-v",
                        xml_file.getParentFile().getAbsolutePath() + ":" + xml_file.getParentFile().getAbsolutePath(),
                        "-v",
                        pb_file.getParentFile().getAbsolutePath() + ":" + pb_file.getParentFile().getAbsolutePath(),
                        "-i", "yijun/fast:latest", "-i", "1", xml_file.getAbsolutePath(), pb_file.getAbsolutePath() };
            else
                cmd = new String[] { "fast", "-i", "1", xml_file.getAbsolutePath(), pb_file.getAbsolutePath() };
        } else {
            if (docker_exists) {
                cmd = new String[] { "docker", "run", "--rm", "-v",
                        xml_file.getParentFile().getAbsolutePath() + ":" + xml_file.getParentFile().getAbsolutePath(),
                        "-v",
                        pb_file.getParentFile().getAbsolutePath() + ":" + pb_file.getParentFile().getAbsolutePath(),
                        "-i", "yijun/fast:latest", "-i", "2", xml_file.getAbsolutePath(), pb_file.getAbsolutePath() };
            } else
                cmd = new String[] { "fast", "-i", "2", xml_file.getAbsolutePath(), pb_file.getAbsolutePath() };
        }
        // System.out.println(String.join(" ", cmd));
        p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        xml_file.delete();
        pb_file.delete();
        InputStream stdin = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(stdin);
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] file_content = line.split(";");
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

}