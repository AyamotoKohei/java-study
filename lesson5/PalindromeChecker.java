import com.sun.org.apache.xpath.internal.operations.Bool;

public class PalindromeChecker {
    void run(String[] args){
        for (Integer i = 0; i < args.length; i++){
            Boolean result = this.isPalindrome(args[i]);
            System.out.printf("%s: %b%n",args[i], result);
        }
    }
    
    Boolean isPalindrome(String args){
        Boolean answer = false;
        Integer max = args.length();
        if(args.length() <= 1){
            return answer = true;
        }
        for(Integer i = 0; i < max / 2; i++){
            Character c1 = args.charAt(0);
            Character c2 = args.charAt(args.length() - 1);
            if(c1.equals(c2) != true){
                return answer;
            }
            args = args.substring(1, args.length() - 1);
        }
        return answer = true;
    }

    public static void main(String[] args) {
        PalindromeChecker app = new PalindromeChecker();
        app.run(args);
    }
}
