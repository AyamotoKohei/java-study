import java.awt.geom.AffineTransform;
import java.util.Arrays;

import javax.print.DocFlavor.STRING;

import org.omg.IOP.CodecPackage.InvalidTypeForEncoding;

public class StudentIdValidator{
    void run(String[] args){
        Integer num  = 0;
        validate(args, num);
    }
    
    void validate(String[] args, Integer num){
        for(Integer i = 0; i < args.length; i++){ 
            if(args[i].length() != 6){
                System.out.printf("%s: not student id%n", args[i]);
            }
            else{
                num = Integer.parseInt(args[0]);
                this.validateId(num, args, i); 
            }
        }
    }

    void validateId (Integer num, String[] args, Integer i){
        Integer add = 0;
        Integer dib = num;
        for(Integer j = 0; j < args.length; j++){
                add += dib % 10;
                dib = dib / 10;
        }
        if(add % 10 == 0){
                System.out.printf("%s : valid%n", args[i]); 
        }
        else{
                System.out.printf("%s : invalid%n", args[i]); 
        }
    }

    public static void main (String[] args){
        StudentIdValidator student = new StudentIdValidator();
        student.run(args);  
    }
}