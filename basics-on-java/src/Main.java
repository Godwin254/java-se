import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Input file path");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        readFile(path);
        // write your code here

        s.close();
    }

    public static void readFile(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        int i = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt(i));
        }
        add(numbers);
        average(numbers);
        highest(numbers);


    }

    public static void add(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.size(); i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void average(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.size(); i++) {
            sum += i;
        }
        int avg = sum / numbers.size();
        System.out.println("Average: " + avg);
    }

    public static void highest(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i <= numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

        }
    }

}


