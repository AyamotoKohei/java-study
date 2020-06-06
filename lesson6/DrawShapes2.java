import java.awt.Color;

public class DrawShapes2{
  void run(){
    EZ.initialize(400, 400); // 画面の大きさを決める．
    // 四角形を描く.
    EZRectangle box1 = EZ.addRectangle(200, 200, 200, 200, Color.BLUE, true);
    // 円を描く．(中心座標x, y, 幅，高さ，色，塗りつぶし)
    EZCircle circle1 = EZ.addCircle(200, 200, 200, 200, Color.WHITE, true);
    // 線を描
    EZLine line1 = EZ.addLine(50, 200, 200, 350, Color.GREEN);
    EZLine line2 = EZ.addLine(200, 350, 350, 200, Color.BLACK);
    EZLine line3 = EZ.addLine(50, 200, 200, 50, Color.RED);
    EZLine line4 = EZ.addLine(200, 50, 350, 200, Color.YELLOW);
  }
  public static void main(String[] args) {
    DrawShapes2 app = new DrawShapes2();
    app.run();
  }
}