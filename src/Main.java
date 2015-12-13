import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWrite.createTextFile();
            FileBufferRead.readTextFile();
            FileRead.readMyFile();
            FileCreate.fileSystemOperations();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// http://metanit.com/java/tutorial/6.11.php