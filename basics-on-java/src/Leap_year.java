//program to determine leap year

import java.util.*;

public class Leap_year {
    //main method
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //return message whether a leap or not
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
            System.out.printf("leap year %3d%n", year);
        else
            System.out.println(year + " is not a leap year");


    }
}
