
public class Test3 {
    public static void main(String[] args){
        //final int _size = 10;
        int[] array = {1,2,3,4,5,6,7,8,9};

        //print normal
        displayNormal(array,"Normal Display");

        System.out.println();

        //print reverse
        displayReverse(array, "Reverse Display");


    }

    //method to displayNormal
    public static void displayNormal(int[] lists, String title){
        System.out.printf("%s%n", title);

        for (int list : lists
            ) {
            System.out.printf("%d", list);
        }
    }

        //method to display Reverse
        public static void displayReverse(int[] lists, String title){
            System.out.printf("%s%n", title);

            for (int i = lists.length -1; i >= 0; i--){
                System.out.printf("%d ", lists[i]);
            }
        }
}
