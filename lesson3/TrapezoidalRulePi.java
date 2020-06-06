public class TrapezoidalRulePi{
    void run(String[] args){
        Double width = this.getWidth(args);
        Double pi = this.computePi(width);
        System.out.printf("pi = %f%n",pi);
    }

    Double computePi(Double width){
        Double sum = 0.0;
        for(Double i = width; i < 1.0; i += width){
            Double left = Math.sqrt(1 - (i- width) * (i- width));
            Double right = Math.sqrt(1 - i * i);
            Double area = (left + right) * width / 2;
            sum = sum + area;
        }
        return sum * 4;
    }

    Double getWidth(String[] args){
        Double width = 0.0001;
        if(args.length > 0){
            width = new Double(args[0]);
        }
        return width;
    }

    public static void main(String[] args){
        TrapezoidalRulePi pi = new TrapezoidalRulePi();
        pi.run(args);
    }
}
