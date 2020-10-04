import java.util.*;
/*reversing array
* Variable length argument
* Command line argument*/
public class Test1 {
    //main method
    public static void main(String[] args){
        //array initializer
        int[] array = {1,2,3,4,5,6,7};

        //
        Scanner scan = new Scanner(System.in);
        int count = 0;
        double mark = 0;
        System.out.println("\nEnter marks\n");
        while (count < array.length){
            count++;
            mark = scan.nextDouble();
        }

        System.out.println(average(mark));

        //reversed array
        int[] array2 = reverse(array);

        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(Arrays.toString(array2));

    }
    //reverse method
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0, j = result.length - 1; i < list.length; i++, j--){

            result[j] = list[i];
        }

        return result;
    }

    //average
    public static double average(double... results){
        double total = 0.0;
        for (double result : results
             ) {
            total += result;
        }
        return total / results.length;
    }
}
