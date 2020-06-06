import java.util.Date;
import java.util.Objects;
public class HelloWorld3{
    void run(String[] args){
	    if(args.length==0){
        String string = "Hello, World%n";
            System.out.printf(string);
        }else if(Objects.equals(args[0], "World")==true){
            System.out.printf("Hi, %s%n", args[0]);   
        }else{
            System.out.printf("Hello, %s%n", args[0]); 
        }
    }
    public static void main(String[] args){
      HelloWorld3 application = new HelloWorld3();
      application.run(args);
    }
  }