import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadRandom {

    private String textFile;
    private ArrayList<Integer> readList = new ArrayList<Integer>();
    private PrintWriter writer;

    ReadRandom(String textFile) throws FileNotFoundException {
        this.textFile = textFile;
        this.writer = new PrintWriter("sorted_" + textFile);
        ReadAndSort();
    }

    private void ReadAndSort() {

        File txtFile = new File(textFile);
        Scanner scanner = null;
        try {
            scanner = new Scanner(txtFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (scanner.hasNextInt()) {
            readList.add(scanner.nextInt());
        }

        Collections.sort(readList);

        for (int i : readList) {
            writer.println(i);
        }
        writer.close();
    }
}

