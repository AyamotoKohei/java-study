import java.awt.geom.AffineTransform;
import java.util.Arrays;

import javax.print.DocFlavor.STRING;

import org.omg.IOP.CodecPackage.InvalidTypeForEncoding;

public class QuadraticEquation{
    void run(String[] args){
        Double a = new Double(args[0]);
        Double b = new Double(args[1]);
        Double c = new Double(args[2]);

        this.solve(a, b, c);
    }

    void solve(Double a, Double b, Double c){
        Double d = this.discriminant(a, b, c);
        if(d > 0){
            Double ans1 = -1 * b / (2 * a);
            Double ans2 = Math.sqrt(d) / (2 * a);
            System.out.printf("answer = %g, %g%n", ans1 + ans2, ans1 - ans2);
        } else if(d < 0) {
            Double ans1 = -1 * b / (2 * a);
            Double ans2 = Math.sqrt(-1 * d) / (2 * a);
            System.out.printf("answer = %g + %g i, %g - %g i%n", ans1, ans2, ans1, ans2);
        } else {
            System.out.printf("answer = %g%n", -1 * b / (2 * a));
        }
    }

    Double discriminant (Double a, Double b, Double c){
        return b * b - 4 * a * c;
    }

    public static void main (String[] args){
        QuadraticEquation edit = new QuadraticEquation();
        edit.run(args);  
    }
}