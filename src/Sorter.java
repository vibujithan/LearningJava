import java.io.FileNotFoundException;

public class Sorter {

    public static void main(String[] args) throws FileNotFoundException {
        WriteRandom writeRandom = new WriteRandom();
        ReadRandom readRandom = new ReadRandom("random.txt");
    }
}
