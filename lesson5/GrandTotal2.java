public class GrandTotal2 {
    void run(String[] args) {
        if (args.length == 0) {
            Integer number = 10;
            this.print(number, this.factorial(number));
        } else {
            for (Integer i = 0; i < args.length; i++) {
                Integer number = Integer.valueOf(args[i]);
                this.print(number, this.factorial(number));
            }
        }
    }

    Integer factorial(Integer number) {
        if (number == 1) {
            return 1;
        }
        return number + this.factorial(number - 1);
    }

    void print(Integer number, Integer result) {
        System.out.printf("1から%dまでの総和は%dです。%n", number, result);
    }

    public static void main(String[] args) {
        GrandTotal2 app = new GrandTotal2();
        app.run(args);
    }
}