import java.awt.Color;

public class SineCurve{
    void run() {
        EZ.initialize(400, 400); // 画面の大きさを決める．

        EZLine lineX = EZ.addLine(0, 200, 400, 200, Color.BLACK);
        EZLine lineY = EZ.addLine(200, 0, 200, 400, Color.BLACK);

        int x = 0;
        int y = 0;
        double delta = (2 * Math.PI) / 400;
        double s = 400 / (2 * Math.PI);
        double v = 0;

        for (int i = 0; i < 400; i++) {
            v = Math.sin(i * delta) * s;
            EZLine lineSin = EZ.addLine(x, y + 200, i, (int) v + 200, Color.RED);
            x = i;
            y = (int) v;
        }
    }

    public static void main(String[] args) {
        SineCurve app = new SineCurve();
        app.run();
    }
}