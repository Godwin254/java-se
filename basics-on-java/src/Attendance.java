import java.util.*;

public class Attendance {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        //variables
        int totalAttendance = 0;
        int averageAttendance;
       // int highestAttendance = 0;

      //prompt user to enter number of input slots
        System.out.print("Enter number of input slots: ");
        int _inputSlot = input.nextInt();

        int[] arrayItems = new int[_inputSlot];

        //enter
        System.out.print("Enter attendance records:");
        for (int i = 0; i < _inputSlot; i++){

            arrayItems[i] = input.nextInt();
        }

        //total attendance
        for (int arrayItem : arrayItems) {

            totalAttendance += arrayItem;
        }

        //highest attendance
        for (int arrayItem : arrayItems) {
            int highestValue = arrayItems[0];

            if (arrayItem > highestValue) {

                highestValue = arrayItem;
            }

            System.out.printf("Highest value: ", highestValue);
        }

        //average attendance
       averageAttendance = totalAttendance / _inputSlot;

        //display outputs
        System.out.printf("%nTotal Attendance: %d%n", totalAttendance);
        System.out.printf("%nAverage Attendance: %d%n", averageAttendance);
    }
}
