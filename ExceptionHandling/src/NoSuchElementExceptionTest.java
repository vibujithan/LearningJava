import java.io.File;
import java.util.Scanner;

public class NoSuchElementExceptionTest {

    public static void main(String[] args) {

        File txtFile = new File("random.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(txtFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println(scanner.nextInt());
        }
    }
}
