import java.util.*;

public class Bubble {

    //method to swap
    static void swapping(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

    }
    //method for display
    static void display(int[] arr){
        for (int j : arr) {
            System.out.printf("%d", j);
        }
    }
    //method for bubble-sort
    static void sort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            int swaps = 0;
            for (int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swapping(arr[j], arr[j+1] );
                    swaps = 1;
                }
            }
            if( swaps != 0){
                break;
            }
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //array size
        System.out.print("Enter array size:\n");
        int _size = sc.nextInt();
        //array
        int[] array = new int[_size];

        //enter elements in array
        System.out.print("Enter array element: \n");
        for (int i = 0; i < array.length; i++){

            array[i] = sc.nextInt();
        }

        //display previous array elements
        display(array);

        //invoke sort function
        sort(array);

        //display array after sort
        display(array);
    }
}
