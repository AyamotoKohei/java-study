import java.io.*;

public class Tee {
    void run(String[] args) throws IOException {
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter(new File(args[0])));
        String line;
        while((line = in.readLine()) != null){
            System.out.println(line);
            out.println(line);
        }
        out.close();
        in.close();
    }

    public static void main(String[] args) throws IOException {
        Tee app = new Tee();
        app.run(args);
    }
}