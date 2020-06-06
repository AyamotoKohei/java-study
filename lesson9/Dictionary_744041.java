import java.util.HashMap;

public class Dictionary_744041{
    HashMap<String, String> dictionary;

    void run(String[] args){
        this.initialize();
        for(String arg: args){
            this.searchAndPrint(arg);
        }
    }
    
    void searchAndPrint(String English){
        String dic = this.dictionary.get(English);
        if(dic == null){
            System.out.printf("%s: 見つかりませんでした%n", English);
        }
        else{
            System.out.printf("%s: %s%n", English, dic);
        }
    }
    
    void initialize(){
        this.dictionary = new HashMap<>();
        dictionary.put("desk", "机");
        dictionary.put("watch", "時計");
        dictionary.put("sun", "太陽");
        dictionary.put("moon", "月");
        dictionary.put("book", "本");
        dictionary.put("phone", "電話");
        dictionary.put("price", "値段");
        dictionary.put("lunch", "お昼御飯");
        dictionary.put("dinner", "晩御飯");
        dictionary.put("map", "地図");
    }
    
    public static void main(String[] args){
        Dictionary_744041 app = new Dictionary_744041();
        app.run(args);
    }
}