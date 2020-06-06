public class Fibonacci{
    void run(String[] args){
        Integer number;
        Integer num1 = 1;
        Integer num2 = 1;
        
        if(args.length == 0){
            number = 20;
        }else{
            number = Integer.valueOf(args[0]);
        }

        for(Integer i = 1; i <= number; i ++){
            if(i == 1){
                System.out.printf("%d ", num1);
            }else if(i == 2){
                System.out.printf("%d ", num2); 
            }else if(i % 2 != 0){
                num1 = num1 + num2;
                System.out.printf("%d ", num1);
            }else{
                num2 = num1 + num2;
                System.out.printf("%d ", num2);
            }
        }

        System.out.printf("%n");
    }
    public static void main(String[] args){
        Fibonacci application = new Fibonacci();
        application.run(args);
    }
}