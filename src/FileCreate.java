import java.io.*;

public class FileCreate {
    static void fileSystemOperations() throws IOException {
        File dir = new File("C:\\MyDirectory");
        dir.mkdir();

        File f = new File("C:\\MyDirectory", "myNewFile.txt");
        f.createNewFile();
        if (f.canWrite())
            System.out.println("Файл доступен для записи");
        else
            System.out.println("Файл не доступен для записи");

        Writer fwrite = new FileWriter("C:\\MyDirectory\\myNewFile.txt");
        fwrite.write("<<<< Работа с файлами >>>>" + "\n");
        fwrite.flush();
        fwrite.close();

        Reader fread = new FileReader("C:\\MyDirectory\\myNewFile.txt");
        int text;
        while ((text = fread.read()) != -1) {
            System.out.print((char) text);
        }
        fread.close();

        System.out.println("Создан файл: " + f.getName());
        System.out.println("Размер файла: " + f.length());
        System.out.println("Директория: " + f.getParent());
        System.out.println("Путь: " + f.getPath());

    }
}
