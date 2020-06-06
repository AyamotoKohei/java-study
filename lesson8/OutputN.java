import java.io.*;

public class OutputN{
    void run(String[] args) throws IOException{
        Integer max = new Integer(args[0]);
        PrintWriter out = new PrintWriter(new FileWriter(new File(args[1])));
        for(Integer i = 1; i <= max; i++){
            out.println(i);
        }
        out.close();
    }
    public static void main(String[] args) throws IOException{
        OutputN output = new OutputN();
        output.run(args);
    }
}