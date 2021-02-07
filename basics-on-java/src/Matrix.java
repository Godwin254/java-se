import java.util.*;

public class Matrix {
  //fields
  private final static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
 
    //enter value of rows and columns
    System.out.println("Enter size of row: ");
    int _ROW = sc.nextInt();
    System.out.println("Enter size of column: ");
    int _COL = sc.nextInt();
    
    //initialize multidimensional array
    int[][] matrix = new int[_ROW][_COL];
    
    //input array elements
    input(matrix);
    //sum array items;
    System.out.println(sumArray(matrix) + "\n");
    //reverse array items;
   // System.out.println(reverse(matrix) "\n");
    //larges array items;
    System.out.println(arrLargest(matrix) + "\n");
    //smallest array items;
    System.out.println(arrSmallest(matrix) + "\n");
    
    
  }//end main
  
  //input array elements
  static void input(int[][] arr){
     System.out.println("Enter array elements\n");
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        	arr[i][j] = sc.nextInt();
      }
    }
    
  }//end input
  
  //method to sum array elems
  static int sumArray(int[][] arr){
    int sum = 0;
    System.out.println("Sum of elemnts\n");
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        	sum += arr[i][j];
      }
    }
    return sum;
  }//end sum
  
  //print reverse
  static void reverse(int[][] arr){
     System.out.println("Reversed elements\n");
    for (int i = arr.length; i = 0; i--){
      for (int j = arr[i].length; j = 0; j--){
        System.out.printf("%n%d", arr[i][j]);
      }
    }
    
  }//end reverse
  
  //method to return largest element
  static int arrLargest(int[][] arr){
    int largest = arr[0][0];
    System.out.println("largest element\n");
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        	if(arr[i][j] > largest){
            largest = arr[i][j];
          }
      }
    }
    return largest;
  }//end largest
  
  //method to return smallest element
  static int arrSmallest(int[][] arr){
    int smallest = arr[0][0];
    System.out.println("smallest element\n");
    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr[i].length; j++){
        	if(arr[i][j] < smallest){
            smallest = arr[i][j];
          }
      }
    }
    return smallest;
  }//end smallest
  
}//end of class


