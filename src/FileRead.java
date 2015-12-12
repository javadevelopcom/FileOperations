import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    static void readMyFile() throws IOException {
        FileReader symbol = new FileReader("C:\\myTextFile.txt");
        int text;
        while ((text = symbol.read()) != -1) {
            System.out.println((char) text);
        }
        symbol.close();
    }
}
