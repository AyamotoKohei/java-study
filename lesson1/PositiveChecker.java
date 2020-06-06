public class PositiveChecker{
    public static void main(String[] args){
        Integer value = 5;
        if(value == 5){
            System.out.printf("与えられた数値は正の値です: %d%n", value);
        }
        else if(value == 0){
            System.out.printf("与えられた数値は0です: %d%n", value);
        }
        else{
            System.out.printf("与えられた数値は負の値です: %d%n", value);
        }
    }
}