import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;

public class FibonacciList_744041 {
  void run(String[] args) {
    Integer maxIndex = Integer.valueOf(args[0]);
    ArrayList<Integer> list = getFibonacciList(maxIndex);
    System.out.println(list);
  }

  ArrayList<Integer> getFibonacciList(Integer maxIndex) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Integer n = 1;
    for (Integer i = 0; i < maxIndex; i++) {
      if (n == 1) {
        list.add(1);
      } else if (n == 2) {
        list.add(1);
      } else if (n % 2 != 0) {
        // System.out.printf("%d", n);
        list.add(list.get(n - 3) + list.get(n - 2));
      } else {
        list.add(list.get(n - 2) + list.get(n - 3));
      }
      n++;
    }
    return list;
  }

  public static void main(String[] args) {
    FibonacciList_744041 app = new FibonacciList_744041();
    app.run(args);
  }
}