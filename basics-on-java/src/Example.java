import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //declarations
        int[] numbers = new int[5];

        //input values into the array
        System.out.println("Enter values in the array: ");
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();
        }

        int maxVal = getMax(numbers);
        int minVal = getMin(numbers);


        //display items
        System.out.printf("%nLargest number: %d%n", maxVal);
        System.out.printf("%nSmallest number: %d%n", minVal);

        input.close();
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }

        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];

        for (int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
