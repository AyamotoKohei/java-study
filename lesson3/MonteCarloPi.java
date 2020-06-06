
public class MonteCarloPi{
    void run(String[] args){
        Integer n = 1000;
        Double pi;
        if(args.length != 0){
            n = Integer.valueOf(args[0]);
        }
        Integer hit = this.number(n);
        
        pi = hit * 4 / (double)n;
        System.out.printf("%g%n", pi);
    }

    Integer number(Integer n){
        Integer hit = 0;
        for(Integer j = 0; j < n; j++){
            Double x = Math.random();
            Double y = Math.random();
            if(Math.sqrt(x*x+y*y) < 1){
                hit = hit + 1;
            }
        }
        return hit;
    }

    public static void main (String[] args){
        MonteCarloPi edit = new MonteCarloPi();
        edit.run(args);  
    }
}