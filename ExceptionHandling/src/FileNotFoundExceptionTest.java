import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionTest {

    public static void main(String[] args) {

        File txtFile = new File("abc.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(txtFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
