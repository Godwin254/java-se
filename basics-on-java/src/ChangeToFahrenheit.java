//program to convert celsius value to farenheits

import java.util.*;

public class ChangeToFahrenheit {
    //main method
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for input in celsius
        System.out.print("Enter temperature value in Celsius eg. 50.34 : ");
        double celsius_value = input.nextDouble();

        //compute temperature in fahrenheit
        double fahrenheit = (9/5) * celsius_value + 32;

        //display the value of celsius in fahrenheit
        System.out.println(celsius_value + "Celsius is equivalent to " + fahrenheit + "fahrenheit");

    }
}
