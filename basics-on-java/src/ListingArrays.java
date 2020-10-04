
/*ARRAYS AND ARRAY LIST*/

public class ListingArrays {
    public static void main(String[] args) {
        /*
        //using array object
        int[] array = new int[5];
        array[0] = 12;
        array[4] = 500;
         */

        //using array initializer
        int[] array = {200,400,30,24,55,70};

        //summing up values of an array
        int total = 0;

        //iterate through array
        System.out.printf("%8s%8s%n", "Index", "Count");
        for (int count = 0; count < array.length; count++) {

            total += array[count];
            System.out.printf("%5d%8d%n", count, array[count]);

            //array distribution
            System.out.printf("%d - %d: ", count * 6, count * 6 + 6);

        }

        System.out.printf("%nTotal is: %d%n", total);

        int[] numberList = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int num : numberList) {
            System.out.printf("%d%n", num);
            sum += num;
        }

        System.out.printf("Sum: %d%n", sum);

    }
}
