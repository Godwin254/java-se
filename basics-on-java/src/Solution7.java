import java.util.*;

public class Solution7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Books books;
        //input array size
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.print("Enter string items: ");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;

            System.out.printf("%d", arr[i]);
        }
        
        for (int value : arr
             ) {
            System.out.printf("%d", value);
        }



        scanner.close();
    }
}
