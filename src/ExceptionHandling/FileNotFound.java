package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("FileNotFound.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
