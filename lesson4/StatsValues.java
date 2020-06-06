import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;

public class StatsValues {
  void run() {
    ArrayList<Integer> list = this.random();
    this.search(list);
  }

  ArrayList<Integer> random() {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    for (Integer i = 0; i < 100; i++) {
      Integer randomValue = random.nextInt(1000);
      list.add(randomValue);
      //System.out.printf("%3d%n", list.get(i));
    }
    return list;
  }

  void search(ArrayList<Integer> list) {
    Integer Max = 0;
    Integer min = 999;
    Integer add = 0;
    Double ave;
    for (Integer i = 0; i < 100; i++) {
      add += list.get(i);
      if (list.get(i) > Max) {
        Max = list.get(i);
      }
      if (list.get(i) < min) {
        min = list.get(i);
      }
    }
    ave = (double) add / 100;
    this.print(list, Max, min, add, ave);
  }

  void print(ArrayList<Integer> list, Integer Max, Integer min, Integer add, Double ave) {
    System.out.printf("合計: %d, 最大値: %d, 最小値: %d, 平均: %f%n", add, Max, min, ave);
    for (Integer i = 0; i < 10; i++) {
      for (Integer j = 0; j < 10; j++) {
        System.out.printf("%3d ", list.get(j + (i * 10)));
      }
      System.out.printf("%n");
    }
  }

  public static void main(String[] args) {
    StatsValues app = new StatsValues();
    app.run();
  }
}