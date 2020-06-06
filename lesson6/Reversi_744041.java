import java.awt.Color;

public class Reversi_744041 {
  void run() {
    EZ.initialize(420, 420);

    EZRectangle back = EZ.addRectangle(210, 210, 420, 420, Color.GREEN, true);
    EZRectangle box = EZ.addRectangle(210, 210, 400, 400, Color.BLACK, false);

    for (Integer x = 60; x < 420; x += 50) {
      EZ.addLine(x, 10, x, 410, Color.BLACK);
    }
    for (Integer y = 60; y < 420; y += 50) {
      EZ.addLine(10, y, 410, y, Color.BLACK);
    }

    EZCircle circleb1 = EZ.addCircle(235, 185, 50, 50, Color.BLACK, true);
    EZCircle circlew1 = EZ.addCircle(235, 235, 50, 50, Color.WHITE, true);
    EZCircle circleb2 = EZ.addCircle(185, 235, 50, 50, Color.BLACK, true);
    EZCircle circlew2 = EZ.addCircle(185, 185, 50, 50, Color.WHITE, true);
  }

  public static void main(String[] args) {
    Reversi_744041 app = new Reversi_744041();
    app.run();
  }
}