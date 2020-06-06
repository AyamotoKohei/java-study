import java.io.File;

public class FileCounter_744041{
    Integer directoryCount = 0;
    Integer fileCount = 0;

    void run(String[] args) {
        traverse(new File(args[0]), 0);
        System.out.printf("file: %d, dir: %d%n", fileCount, directoryCount);
    }

    void traverse(File file, Integer indent) {
        System.out.printf("%s%n", file.getName());
        if (file.isDirectory()) { // ディレクトリであれば，中身を確認する．
            File[] files = file.listFiles();
            Integer newIndent = indent + 1;
            for (File f : files) {
                this.traverse(f, newIndent);
            }
            directoryCount++;
        } else {
            fileCount++;
        }
    }

    public static void main(String[] args) {
        FileCounter_744041 app = new FileCounter_744041();
        app.run(args);
    }
}