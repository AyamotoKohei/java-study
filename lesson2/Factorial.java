public class Factorial{
    void run(String[] args){
        Integer number = Integer.valueOf(args[0]);
        Integer factorial = 1;
        for(Integer i = 0; i < number; i++){
            factorial = (number - i) * factorial;
        }
		System.out.printf("%d! = %d%n", number, factorial);
    }
    public static void main(String[] args){
        Factorial application = new Factorial();
        application.run(args);
    }
}