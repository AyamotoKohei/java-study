public class Fibonacci{
    void run(String[] args){
        Integer number;
        
        if(args.length == 0){
            number = 15;
        }else{
            number = Integer.valueOf(args[0]);
        }

        for(Integer i = 1; i <= number; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.printf("FizzBuzz%n");
            }else if(i % 3 == 0){
                System.out.printf("Fizz%n"); 
            }else if(i % 5 == 0){
                System.out.printf("Buzz%n");
            }else{
                System.out.printf("%d%n",i);
            }
        }

    }
    public static void main(String[] args){
        Fibonacci application = new Fibonacci();
        application.run(args);
    }
}