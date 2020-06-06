import java.math.BigInteger;

public class BigFibonacci {
    void run(String[] args) {
        if (args.length == 0) {
            Integer Number = 10;
            BigInteger number = BigInteger.valueOf(10);
            this.print(number, this.fibonacci(Number,number));
        } else {
            for (Integer i = 0; i < args.length; i++) {
                Integer Number = Integer.valueOf(args[i]);
                BigInteger number = BigInteger.valueOf(Number);
                this.print(number, this.fibonacci(Number,number));
            }
        }
    }

    BigInteger fibonacci(Integer Number,BigInteger number) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(0);
        BigInteger ans = BigInteger.valueOf(0);;
        
        for(Integer i = 1; i <= Number; i++){
            if(i == 1){
                num1 = BigInteger.valueOf(1);
                ans = num1;
                //System.out.printf("%d%n",ans);
            } else if(i == 2){
                num2 = BigInteger.valueOf(1);
                ans = num2;
                //System.out.printf("%d%n",ans);
            } else if(i % 2 != 0){
                num1 = num1.add(num2);
                ans = num1;
                //System.out.printf("%d%n",ans);
            } else {
                num2 = num2.add(num1);
                ans = num2;
                //System.out.printf("%d%n",ans);
            }
        }
        return ans;
    }

    void print(BigInteger number, BigInteger result) {
        System.out.printf("fibonacci(%d) = %d%n", number, result);
    }

    public static void main(String[] args) {
        BigFibonacci app = new BigFibonacci();
        app.run(args);
    }
}