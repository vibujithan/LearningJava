import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteRandom {

    private int length;
    private String fileName;

    WriteRandom(int length, String fileName) throws FileNotFoundException {
        this.length = length;
        this.fileName = fileName;
        CreateFile();
    }

    WriteRandom(String fileName) throws FileNotFoundException {
        this(10000, fileName);
    }

    WriteRandom(int length) throws FileNotFoundException {
        this(length, "random.txt");
    }

    WriteRandom() throws FileNotFoundException {
        this(10000, "random.txt");
    }

    private void CreateFile() throws FileNotFoundException {

        int random;
        PrintWriter writer = new PrintWriter(fileName);

        for (int i = 0; i < length; i++) {
            random = (int) (Math.random() * 100000);
            writer.println(random);
        }
        writer.close();
    }
}
