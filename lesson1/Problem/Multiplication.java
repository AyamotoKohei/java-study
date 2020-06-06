public class Multiplication{
    public static void main (String[] args){
        
        System.out.printf(" ");

        for(Integer i = 1; i < 10; i++){
            System.out.printf("%2d ",i);
        }

        System.out.printf("%n");

        for(Integer j = 1; j < 10; j++){
            System.out.printf("%d", j);
            for(Integer n = 1; n < 10; n++){
                System.out.printf("%2d ", j * n); 
            }
        System.out.printf("%n");
        }

    }
}