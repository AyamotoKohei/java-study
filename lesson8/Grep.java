import java.io.*;

public class Grep{
    void run(String[] args) throws IOException{
        for(Integer i = 0; i < args.length - 1; i++){
            // System.out.printf("i = %d%n", i);
            // System.out.printf("i + 1 = %d%n", i + 1);
            String grepname = args[0];
            String filename = args[i + 1];
            cat(grepname, filename, new File(args[i + 1]));
        }
    }
    void cat(String grepname, String filename, File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while((line = in.readLine()) != null){
            if(line.contains(grepname)){
                System.out.printf("%s:", filename);
                System.out.println(line);
            }
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Grep app = new Grep();
        app.run(args);
    }
}