import java.util.Date;
import java.util.Objects;
public class SeirekiToWarekiConverter_744041{
    void run(String[] args){
        Integer year;
        if(args.length==0){
            Date date = new Date();
            year = date.getYear() + 1900;
        }else{
            year = Integer.valueOf(args[0]);
        }

        if(year < 1868){
            System.out.printf("西暦 %d: 明治より前であるため判定できません.%n", year);
        }else if(1868 < year && year < 1912){
            System.out.printf("西暦 %d: 明治%d%n",year, year - 1867);  
        }else if(year == 1868){
            System.out.printf("西暦 %d: 明治元年%n", year); 
        }else if(year == 1912){
            System.out.printf("西暦 %d: 明治45年（大正元年）%n", year);
        }else if(1912 < year && year < 1926){
            System.out.printf("西暦 %d: 大正%d%n",year, year - 1911);
        }else if(year == 1926){
            System.out.printf("西暦 %d: 大正15年（昭和元年%n", year);
        }else if(1926 < year && year < 1989){
            System.out.printf("西暦 %d: 昭和%d%n",year, year - 1925);
        }else if(year == 1989){
            System.out.printf("西暦 %d: 昭和64年（平成元年）%n", year);
        }else{
            System.out.printf("西暦 %d: 平成%d年 %n", year, year - 1988);
        }
    }
    public static void main(String[] args){
        SeirekiToWarekiConverter_744041 application = new SeirekiToWarekiConverter_744041();
      application.run(args);
    }
  }