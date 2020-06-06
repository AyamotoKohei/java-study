import java.awt.Color;
import java.awt.datatransfer.StringSelection;

public class KochCurve {
    void run(String[] args) {
        EZ.initialize(400, 400);
        for (Integer i = 0; i < args.length; i++){
            Integer dimension = Integer.valueOf(args[i]);
            Integer x1 = 0;
            Integer y1 = 100;
            Integer x5 = 400;
            Integer y5 = 100;
            Double angle = 0.0;
            drawKoch(x1, y1, x5, y5, dimension, angle);
        }
    }

    void drawKoch(Integer x1, Integer y1, Integer x5, Integer y5, Integer dimension, Double angle) {
        Double x2 = 0.0;
        Double y2 = 0.0;
        Double x3 = 0.0;
        Double y3 = 0.0;
        Double x4 = 0.0;
        Double y4 = 0.0;
        if (dimension == 0) {
            EZLine line1 = EZ.addLine(x1, y1, x5, y5, Color.BLACK);
        } else {
            double length = 0.0;
            // (x1, y1), (x5, y5) 間の長さの 1/3
            length = Math.sqrt(((x5-x1)*(x5-x1))+((y5-y1)*(y5-y1))) / 3.0;
            Double delta = Math.PI / 3.0;
            // (x2, y2) を求める．
            x2 = (double)x1 + length * Math.cos(angle);
            y2 = (double)y1 + length * Math.sin(angle);
            // (x1, y1)から(x2, y2)まで線を引く．
            EZLine line2 = EZ.addLine(x1, y1, x2.intValue(), y2.intValue(), Color.BLACK);
            // (x3, y3) を求める（θ は angle + delta）．
      
            x3 = x2 + length * Math.cos(angle + delta);
            y3 = y2 + length * Math.sin(angle + delta);
            this.drawKoch(x2.intValue(), y2.intValue(), x3.intValue(), y3.intValue(), dimension - 1, angle + delta);
            // (x4, y4) を求める（θ は angle - delta）．
           
            x4 = x3 + length * Math.cos(angle - delta);
            y4 = y3 + length * Math.sin(angle - delta);
            this.drawKoch(x3.intValue(), y3.intValue(), x4.intValue(), y4.intValue(), dimension - 1, angle - delta);
            // (x4, y4)から(x5, y5)まで線を引く．
            EZLine line3 = EZ.addLine(x4.intValue(), y4.intValue(), x5, y5, Color.BLACK);
        }
    }

    public static void main(String[] args) {
        KochCurve app = new KochCurve();
        app.run(args);
    }
}