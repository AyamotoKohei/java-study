import java.io.*;

public class Copier_744041 {
    void run(String[] args) throws IOException {
        File file = new File(args[0]);
        PrintWriter out = new PrintWriter(new FileWriter(new File(args[1])));
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            out.println(line);
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Copier_744041 cat = new Copier_744041();
        cat.run(args);
    }
}