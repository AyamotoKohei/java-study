import java.util.ArrayList;
import java.io.*;

public class tac {
    void run (String[] args) throws IOException {
        for(Integer i = 0; i < args.length; i++){
            BufferedReader in = new BufferedReader(new FileReader(args[i]));
            ArrayList<String>list = new ArrayList<String>();
            String line = "";
            while((line = in.readLine()) != null){
                list.add(line);
            }
            in.close();
            for(Integer n = list.size() - 1; n > -1; n--){
                System.out.printf("%s%n", list.get(n));
            }
        }    
    }

    public static void main (String[] args) throws IOException {
        tac app = new tac();
        app.run(args);
    }
}