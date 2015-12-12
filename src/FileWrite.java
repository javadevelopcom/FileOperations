import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {
     static void createTextFile() throws IOException {
        Writer file = new FileWriter("C:\\myNewFile.txt", true);
        file.write("Запись и Чтение файлов. " + "\n");
        file.write("Класс FileWriter является производным от класса Writer и используется для записи текстовых файлов. ");
         file.append('\n');
         file.append("Класс FileReader наследуется от абстрактного класса Reader и предоставляет функциональность для чтения текстовых файлов.\n" +
                 "\n");
        file.flush();
        file.close();
    }
}
