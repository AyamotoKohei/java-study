public class Fibonacci2 {
    void run(String[] args) {   
        if (args.length == 0) {
            Integer number = 10;
            Integer result = this.fibonacci(number);
            System.out.printf("%d%n",result);
        } else {
            for (Integer i = 0; i < args.length; i++) {
                Integer number = Integer.valueOf(args[i]);
                this.print(number, this.fibonacci(number));
            }
        }
    }

    Integer fibonacci(Integer number) {
        if (number == 0) {
            return number = 0;
        } else if (number == 1) {
            return number = 1;
        } else {
            return this.fibonacci(number - 2) + this.fibonacci(number - 1);
        }
    }

    void print(Integer number, Integer result) {
        System.out.printf("fibonacci(%d) = %d%n", number, result);
    }

    public static void main(String[] args) {
        Fibonacci2 app = new Fibonacci2();
        app.run(args);
    }
}