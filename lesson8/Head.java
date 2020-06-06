import java.io.*;

public class Head {
    void run(String[] args) throws IOException {
        if (args.length == 1) {
            Integer n = 1;
            head(n, new File(args[0]));
        } else {
            Integer n = Integer.valueOf(args[0]);
            head(n, new File(args[1]));
        }
    }

    void head(Integer n, File file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        for (Integer i = 0; i < n; i++) {
            if((line = in.readLine()) != null){
                System.out.println(line);
            }
        }    
        in.close();
    }

    public static void main(String[] args) throws IOException {
        Head app = new Head();
        app.run(args);
    }
}