import java.util.ArrayList;

public class LinearCongruentialGenerator {
    void run(String[] args){
        Integer max;
        if (args.length != 0) {
            max = Integer.valueOf(args[0]);
        }else{
            max = 10;
        }
        ArrayList<Double> returnList = this.random(max);
        System.out.println(returnList);
    }

    ArrayList<Double> random(Integer max){
        ArrayList<Double> results = new ArrayList<Double>();// 結果を格納するリストを作成する．
        Integer a, xn, b, m;
        xn = 20; // X0（自分の年齢）
        // a, b, m にも初期値を代入する．
        a = 104;
        b = 1;
        m = 65535;
        // 以下の2行を指定回数繰り返す．
        for(Integer i = 0; i < max; i++){
            xn = ((a * xn) + b ) % m; // 線形合同法の計算式に従い，X_n+1 を求める．
            results.add(1.0 * xn / m); 
            // xnを0.0〜1.0の範囲に変換してリストに追加する．
        }
        return results;
    }

    public static void main(String[] args) {
        LinearCongruentialGenerator app = new LinearCongruentialGenerator();
        app.run(args);
    }
}
