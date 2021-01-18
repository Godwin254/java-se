//import java.util.*;

public class Handler1{

    //main function
    public static void main(String[] args){

        final int _arrSize = 4;

        int[] arr = new int[_arrSize];

        try{
            System.out.println("Trying to access non-existing element\n");
            System.out.println("Access element 5 " + arr[3]);

        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.printf("Exception: %s%n", e.getMessage());
            System.err.printf("The element does not exist in the array%n");
        }
        finally{

            arr[0] = 16;
            System.out.printf("First value is: %d%n", arr[0]);
            System.out.println("Code in \"finally block\" executed!!");
        }
    }
}