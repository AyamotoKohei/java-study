import java.awt.Color;

import org.omg.CORBA.portable.Delegate;
public class Animation{
  
    void run() throws InterruptedException{
        EZ.initialize(400, 400);
        EZCircle circle1 = EZ.addCircle(100, 100, 15, 15, Color.BLUE, true);
        EZCircle circle2 = EZ.addCircle(200, 200, 20, 20, Color.RED, true);
        EZCircle circle3 = EZ.addCircle(0, 200, 10, 10, Color.ORANGE, true);
        this.roundTrip(circle1, circle2, circle3);
    }
  
    void roundTrip(EZCircle circle1, EZCircle circle2, EZCircle circle3) throws InterruptedException{
        Integer deltaX = 5;
        Integer deltaY = 10;
        Integer sineX = 0;
        double sineY = 0;
        double delta = (2 * Math.PI) / 400;
        double s = 400 / (2 * Math.PI);
        
        while(true){ // 無限ループ
            Integer newX = circle1.getXCenter() + deltaX;
            Integer newY = circle2.getYCenter() + deltaY;

            sineY = Math.sin((double)sineX * delta) * s;
            sineX++;
            
            circle1.translateTo(newX, circle1.getYCenter());
            circle2.translateTo(circle2.getXCenter(), newY);
            circle3.translateTo(sineX, (int)sineY+200);
            
            if(newX >= 400 || newX <= 0){
                deltaX = deltaX * -1;
            }
            
            if(newY >= 400 || newY <= 0){
                deltaY = deltaY * -1;
            }

            if(sineX > 400){
                sineX = 0;
            }
       
            EZ.refreshScreen();
        
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Animation app = new Animation();
        app.run();
    }
}