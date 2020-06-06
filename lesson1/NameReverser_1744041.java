public class NameReverser_1744041 {
    public static void main(String[] args){
        String name = "Kohei Ayamoto";
        String format = "%s%n";
        System.out.printf(format,name);
        
        int j = 1;
		for(Integer i = name.length() - j; i >= 0; i--){
            Character n = name.charAt(i);
            System.out.printf("%c",n);
        }
        
        String string = "%n";
		System.out.printf(string);
    }
}
