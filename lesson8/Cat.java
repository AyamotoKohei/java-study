import java.io.*;

public class Cat{
    void run(String[] args) throws IOException{
        cat(new File(args[0]));
    }
    void cat(File file) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(file));
        PrintWriter out = new PrintWriter(new FileWriter(new File(args[0])));
        String line;
        while((line = in.readLine()) != null){
            System.out.println(line);
        }
        in.close();
    }
    public static void main(String[] args) throws IOException{
        Cat cat = new Cat();
        cat.run(args);
    }
}