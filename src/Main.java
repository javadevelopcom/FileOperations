import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWrite.createTextFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileBufferRead.readTextFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileRead.readMyFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
