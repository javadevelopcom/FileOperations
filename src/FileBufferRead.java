import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferRead {
    static void readTextFile() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("C:\\myTextFile.txt"));
        String text;
        while ((text = buffer.readLine()) != null) {
            System.out.println(text);
        }
        buffer.close();
    }
}
