import java.util.Objects;

public class ComparingString {
    void run (String[] args) {
        String word = "KSU_AP";
        for(Integer i = 0; i < args.length; i++){
            if(Objects.equals(args[i], word)){
                System.out.printf("渡された文字列は \"KSU_AP\" です．%n");
            } else {
                System.out.printf("渡された文字列は \"KSU_AP\"ではなく\"%s\"です．%n", args[i]);
            }
        }
    }

    public static void main (String[] args) {
        ComparingString app = new ComparingString();
        app.run(args);
    }
}