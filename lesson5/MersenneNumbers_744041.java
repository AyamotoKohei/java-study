import java.math.BigInteger;

public class MersenneNumbers_744041{
    void run(String[] args){
        Integer n = Integer.valueOf(args[0]);
        BigInteger num = BigInteger.valueOf(n);
        BigInteger ans = BigInteger.valueOf(0);
        BigInteger j = BigInteger.valueOf(2);
        BigInteger a = BigInteger.valueOf(1);
        
        for(BigInteger i = BigInteger.valueOf(0); i.compareTo(num) < 0; i.add(a)){
            j.subtract(BigInteger.valueOf(1));
            ans = j;
            System.out.printf("2^ %d - 1 = %d (%d)%n",i,ans,i);
            j.multiply(BigInteger.valueOf(2));
        }

    }
    
    public static void main(String[] args) {
        MersenneNumbers_744041 app = new MersenneNumbers_744041();
        app.run(args);
    }
}