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
        int textOne;
        while ((textOne = fread.read()) != -1) {
            System.out.print((char) textOne);
        }
        fread.close();

        BufferedReader buffread = new BufferedReader(new FileReader("C:\\MyDirectory\\myNewFile.txt"));
        String textTwo;
        while ((textTwo = buffread.readLine()) != null) {
            System.out.println("BufferedReader output: " + textTwo);
        }
        buffread.close();

        BufferedInputStream byteread;
        byte[] buffer = new byte[1];
        byteread = new BufferedInputStream(new FileInputStream("C:\\MyDirectory\\myNewFile.txt"));
        while ((byteread.read(buffer)) != -1) {
            String bytetostring = new String(buffer);
            System.out.print(bytetostring);
        }
        byteread.close();

        System.out.println();
        System.out.println("Создан файл: " + f.getName());
        System.out.println("Размер файла: " + f.length());
        System.out.println("Директория: " + f.getParent());
        System.out.println("Путь: " + f.getPath());

    }
}