public class BigAndSmall{
    public static void main(String[] args){
        Double value = Math.random();
        // valueには0から1の乱数が代入されている．
        //System.out.printf("value: %f: ", value);
        if(value <= 0.5){
            System.out.printf("vlaue : %f: Small %n", value);
        }else{
            System.out.printf("vlaue : %f: Big %n", value);
        }
    }
}