import java.awt.geom.AffineTransform;
import java.util.Arrays;

import org.omg.IOP.CodecPackage.InvalidTypeForEncoding;

public class ArgsSorter{
  Boolean afterFlag = false;
    void run(String[] args){
      // ここで，printArray を呼び出し，"before"の一行を出力する．
      printArray(args);
      // argsの内容をソートするため，Arrays.sortメソッドを呼び出す．
      Arrays.sort(args); // <= args がソート済みになる．
      afterFlag = true;
      // ここで，printArray を呼び出し，"after"の一行を出力する．
      printArray(args);
    }
    // printArrayメソッドをここに書く．
    void printArray(String[] args){
      if(afterFlag){
        System.out.printf("after: ");
      }else{
        System.out.printf("before: ");
      }
      for(Integer i = 0; i < args.length; i++){
        System.out.printf("%s, ", args[i]);
      }
      System.out.printf("%n");
    }

    public static void main (String[] args){
        ArgsSorter sorter = new ArgsSorter();
        sorter.run(args);  
    }
  }