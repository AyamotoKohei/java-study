public class HelloWorld2{
    void run(String[] args){
	if(args.length==0){
        String string = "Hello, World%n";
		System.out.printf(string);
      }else{
        System.out.printf("Hello, %s%n", args[0]); 
      }
    }
    public static void main(String[] args){
      HelloWorld2 application = new HelloWorld2();
      application.run(args);
    }
  }