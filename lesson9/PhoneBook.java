import java.util.HashMap;
import java.util.Date;
import java.util.Objects;
import java.io.*;
import com.sun.javafx.collections.MappingChange.Map;
import java.io.IOException;

public class PhoneBook {
    HashMap<String, String> phonebank = new HashMap<>();

    void run() throws IOException {
        for (;;) {
            SimpleConsole console = new SimpleConsole();
            String line = console.readLine();
            String[] array = line.split(" ");
            if (Objects.equals(array[0], "add")) {
                phonebank.put(array[1], array[2]);
            } else if (Objects.equals(array[0], "list")) {
                this.printMap(phonebank);
            } else if (Objects.equals(array[0], "find")) {
                this.searchAndPrint(array[1]);
            } else if (Objects.equals(array[0], "remove")) {
                this.searchAndRemove(array[1]);
            } else {
                break;
            }
        }
    }

    void printMap(HashMap<String, String> map) throws IOException {
        System.out.println(map);
    }

    void searchAndPrint(String name) throws IOException {
        String phone = this.phonebank.get(name);
        if (name == null) {
            System.out.printf("%s: 見つかりませんでした%n", name);
        } else {
            System.out.printf("%s %s%n", name, phone);
        }
    }

    void searchAndRemove(String name) throws IOException {
        String phone = this.phonebank.get(name);
        if (name == null) {
            System.out.printf("%s: 見つかりませんでした%n", name);
        } else {
            phonebank.remove(name);
        }
    }

    public static void main(String[] args) throws IOException {
        PhoneBook app = new PhoneBook();
        app.run();
    }
}