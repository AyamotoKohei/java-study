import java.util.zip.GZIPOutputStream;
import java.io.*;
import java.util.*;

public class GZip {
    void run(String[] args) throws IOException {
        for (Integer i = 0; i < args.length; i++) {
            Integer fsize = 0;
            Integer gfsize = 0;
            String name = args[i] + ".gz";
            File file = new File(args[i]);
            File gfile = new File(name);
            BufferedReader in = new BufferedReader(new FileReader(file));
            GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(gfile));
            Integer read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            out.close();
            in.close();
            Long fl = file.length();
            // System.out.printf("%dbyte%n",fl);
            Long gfl = gfile.length();
            fsize = Integer.valueOf(fl.toString());
            gfsize = Integer.valueOf(gfl.toString());
            double per = (Double.valueOf(gfsize) / Double.valueOf(fsize)) * 100;
            System.out.printf("%s: %d bytes -> %d bytes (%f%%)%n", args[i], fsize, gfsize, per);
        }
    }

    public static void main(String[] args) throws IOException {
        GZip app = new GZip();
        app.run(args);
    }
}