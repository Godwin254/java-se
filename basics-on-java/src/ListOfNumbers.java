import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private final List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public Object writeList() throws IOException {
        // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for (int i = 0; i < SIZE; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
        return out;
    }

    public static void main(String[] args) throws IOException {

        ListOfNumbers number = new ListOfNumbers();

        System.out.printf("Numbers: %s%n", number.writeList());
    }
}