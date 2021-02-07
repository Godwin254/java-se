//program to find maximum value
/*
* define a method
* method with three arguments
*
* */
import java.util.*;

public class MaximumFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three double values: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("maximum number is " + result);

        input.close();
    }

    //method to determine maximum number

    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        if (y > maximumValue)
            maximumValue = y;


        if (z > maximumValue)
            maximumValue = z;


        return maximumValue;
    }
}
