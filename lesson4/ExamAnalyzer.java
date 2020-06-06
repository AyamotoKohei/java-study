import java.util.Random;
import java.util.ArrayList;

public class ExamAnalyzer {
    void run() {
        ArrayList<ExamScore> list = new ArrayList<ExamScore>();
        for (Integer i = 0; i < 10; i++) {
            String name = i.toString();
            ExamScore score = this.createRandomScore(name);
            // System.out.println(score);
            list.add(score);
        }
        
        Double avemath = this.averagemath(list);
        Double avepyh = this.averagephy(list);
        Double aveeng = this.averageeng(list);

        ArrayList<Double> avelist = this.avetotal(list);

        printout(list, avemath, avepyh, aveeng, avelist);
    }

    ExamScore createRandomScore(String name) {
        Random random = new Random();
        Integer math = random.nextInt(101);
        Integer physics = random.nextInt(101);
        Integer english = random.nextInt(101);
        return this.createExamScore(math, physics, english, name);
    }

    ExamScore createExamScore(Integer math, Integer physics, Integer english, String name) {
        ExamScore score = new ExamScore();
        score.math = math;
        score.physics = physics;
        score.english = english;
        score.name = name;
        return score;
    }

    Double averagemath(ArrayList<ExamScore> list) {
        Integer total = 0;
        Double ave;
        for (Integer i = 0; i < 10; i++) {
            total += list.get(i).math;
        }
        return ave = (double)total / 10.0;
    }

    Double averagephy(ArrayList<ExamScore> list) {
        Integer total = 0;
        Double ave;
        for (Integer i = 0; i < 10; i++) {
            total += list.get(i).physics;
        }
        return ave = (double) total / 10.0;
    }

    Double averageeng(ArrayList<ExamScore> list) {
        Integer total = 0;
        Double ave;
        for (Integer i = 0; i < 10; i++) {
            total += list.get(i).english;
        }
        return ave = (double) total / 10.0;
    }

    ArrayList<Double> avetotal(ArrayList<ExamScore> list) {
        ArrayList<Double> avelist = new ArrayList<Double>();
        Integer total = 0;
        Double ave;
        for (Integer i = 0; i < 10; i++) {
            total = list.get(i).math + list.get(i).physics + list.get(i).english;
            ave = (double) total / 3;
            avelist.add(ave);
        }
        return avelist;
    }

    void printout(ArrayList<ExamScore> list, Double mat, Double phy, Double eng, ArrayList<Double> avelist){
        System.out.printf("       math   phys   eng    ave%n");
        System.out.printf("ave %6.3f %6.3f %6.3f%n", mat, phy, eng);
        for(Integer i = 0; i < 10; i++){
            System.out.printf("%3s %6d %6d %6d %6.3f%n", list.get(i).name, list.get(i).math, list.get(i).physics, list.get(i).english, avelist.get(i));
        }
    }

    public static void main(String[] args) {
        ExamAnalyzer app = new ExamAnalyzer();
        app.run();
    }
}