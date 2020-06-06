import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;

public class ZipCode {
    HashMap<Integer, String> address;
    void run(String[] args) throws IOException {
        this.initialize();
        for (Integer i = 0; i < args.length; i++) { 
            this.searchAndPrint(Integer.valueOf(args[i])); 
        }
    }

    void searchAndPrint(Integer addressNumber) throws IOException { 
        String name = this.address.get(addressNumber); 
        if (name == null) {
            System.out.printf("%s: 見つかりませんでした%n", addressNumber); 
        } else {
            System.out.printf("%d: %s%n", addressNumber, name);
        } 
    }

    void initialize() throws IOException {
        this.address = new HashMap<>();
        BufferedReader in = new BufferedReader(new FileReader("zipcode.csv"));
        ArrayList<String> list = new ArrayList<String>();
        String line;
        String item;
        Integer n;
        String ad;
        while ((line = in.readLine()) != null) {
            String[] word = line.split(",");
            for (Integer i = 0; i < word.length; i++) {
                list.add(this.stripQuote(word[i]));
            }
            n = Integer.valueOf(list.get(2));
            ad = list.get(7) + list.get(8);
            address.put(n, ad);
            while(!list.isEmpty()){ // listが空じゃない間繰り返す．
                list.remove(0);     // 一番最初の要素を削除する．
            }
        }
    }

    String stripQuote(String item) throws IOException {
        if (item.matches("\".*\"")) {
            return item.substring(1, item.length() - 1);
        }
        return item;
    }

    public static void main(String[] args) throws IOException {
        ZipCode app = new ZipCode();
        app.run(args);
    }
}