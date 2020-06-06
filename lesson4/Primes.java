import java.util.ArrayList;

public class Primes {
  void run(String[] args) {
    Integer max;
    if (args.length != 0) {
      max = Integer.valueOf(args[0]);
    }else{
      max = 200;
    }
    ArrayList<Integer> returnList = this.generatePrimes(max);
    this.primelist(returnList);
  }

  ArrayList<Integer> generatePrimes(Integer max) {
    ArrayList<Boolean> primes = new ArrayList<>();
    for (Integer i = 0; i <= max; i++) {
      primes.add(true); // 仮に全てのiが素数であるとする．
    }
    primes.set(0, false); // 0は素数ではない．
    primes.set(1, false); // 1は素数ではない．

    for (Integer i = 2; i < primes.size(); i++) {
      // 最小の値である2から始める．
      if (!primes.get(i)) { // iが素数ではなかったら何も行わない．
        continue;
      }
      // j = i * 2 から始めて j += i のインデックスを false にする．
      for (Integer j = i * 2; j < primes.size(); j += i) {
        primes.set(j, false);
      }
    }
    return primesList(primes);
  }

  ArrayList<Integer> primesList(ArrayList<Boolean> primes) {
    ArrayList<Integer> returnList = new ArrayList<>();
    for (Integer i = 2; i < primes.size(); i++) {
      if (primes.get(i)) { // 素数なら returnList に追加する．
        returnList.add(i);
      }
    }
    return returnList;
  }

  void primelist(ArrayList<Integer> list) {
    Integer count = 0;
    for (Integer i = 0; i < list.size(); i++) {
      System.out.printf("%3d ", list.get(i));
      count++;
      if(count == 10){
        System.out.printf("%n");
        count = 0;
      }
    }
    System.out.printf("%n");
  }

  public static void main(String[] args) {
    Primes app = new Primes();
    app.run(args);
  }
}