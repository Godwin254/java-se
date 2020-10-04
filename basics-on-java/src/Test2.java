import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        //array initializer
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        //collection and arrayList
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("34");
        numbers.add("12"); //adds/appends 12 in the arrayList to the end
        numbers.add(1,"hello"); //adds "hello" at index position 1
        numbers.remove(2); //removes element in index 2

        //
        for (int i = 0; i < numbers.size(); i++){ //size() used to estimate size of the ArrayList
            System.out.printf("%s::: ",numbers.get(i)); //get() used to retrieve an element with its index;
        }

        //method to display elements
        display1(numbers,"Array list");

        int[] arrayCopy = new int[array.length];

        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        display(array, "Normal array");
        display(arrayCopy,"Copied Array");
        //sort array
        Arrays.sort(array);
        for (int value : array
        ) {
            System.out.println(value);
        }

        int[] fillArray = new int[5];

        //fill array
        Arrays.fill(fillArray, 45);

        display(fillArray,"Filled array");
        /*
        for (int value : fillArray
        ) {
            System.out.println(value);
        }

         */

        //use Array.equal(array1,array2) -- compares the two array content
        //Arrays.binarySearch(arrayName, value)

    }


    //method to display info
    public static void  display(int[] list,String description){
        System.out.printf("%n%s: %n", description);

        for (int value : list) {
                System.out.printf("%d ", value);
        }

    }

    //method to display info
    public static void  display1(ArrayList<String> list,String description){
        System.out.printf("%n%s: %n", description);

        for (String value : list) {
            System.out.printf("%s ", value);
        }

    }



}
