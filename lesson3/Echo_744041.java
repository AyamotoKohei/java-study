import java.util.Objects;

public class Echo_744041{
    void run(Strings[] args){
        Boolean returnFlag = true;
        Boolean helpFlag = false;
        for(Inter i = 0; i < args.length; i++){
            if(Objects.equals(args[i],"-h")){
                helpFlag = true;
            }
            else if(Objects.equals(args[i],"-n")){
                returnFlag = false;
            }
        }

        if(helpFlag){
            printHelp();
        }
        else{
            printArgs(args, returnFlag);
        }
    }

    void printArgs(String[] args, Boolean returnFlag){
        
    }

    void printHelp(){
        System.out.printf("java Echo [OPTIONS] <string...>");
        System.out.printf("OPTIONS");
        System.out.printf("    -h: このメッセージを表示して終了する．");
        System.out.printf("    -n: 改行せずに出力する．");
    }

    public static void main (String[] args){
        Echo_744041 echo = new Echo_744041();
        echo.run(args);  
    }
}

