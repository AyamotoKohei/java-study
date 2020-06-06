public class GrandTotal{
    public static void main(String[] args){
		Integer resalt = 0;
        Boolean leapYear = false;
        // ここに判定処理を書いていく．
        for(Integer i = 1; i <= 100; i ++){
            resalt = resalt + i; 
        }
        System.out.printf("0から100までの総和は%dです．%n", resalt);
    }
}