import java.util.ArrayList;

public class Factorizer {
    void run(String[] args) {
        for(Integer i = 0; i < args.length; i++){
        Integer n = Integer.valueOf(args[i]);
        Primes primes = new Primes();
        ArrayList<Integer> list = primes.generatePrimes(n);
        facotriz(list, n);
        }
    }

    void facotriz(ArrayList<Integer> list, Integer n) {
        ArrayList<Integer> Anslist = new ArrayList<Integer>();
        System.out.printf("%d: ", n);
        Integer l = 0;
        for (;;) {
            if (n % list.get(l) == 0) {
                Anslist.add(list.get(l));
                n = n / list.get(l);
                l = 0;
            } else {
                l++;
            }
            if(n == 1)
            break;
        }
        for(Integer i = 0; i < Anslist.size(); i++){
            System.out.printf("%d ",Anslist.get(i));
            if (i < Anslist.size() - 1)
            System.out.printf("× ");
        }
        System.out.printf("%n");
    }

    public static void main(String[] args) {
        Factorizer app = new Factorizer();
        app.run(args);
    }
}