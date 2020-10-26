//program to convert celsius value to fahrenheits

import java.util.*;

public class ChangeToFahrenheit {
    //main method
    //static methods
    //method 1: convert to fahrenheits
    public static double toFahrenheits(double celsius) {
        return (double) (9 / 5) * (celsius + 32);
    }
    //method 2: convert to celsius
    public static double toCelsius(double fahrenheits) {
        return ((fahrenheits - 32) * (double)(5/9));
    }
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for input in celsius
        System.out.print("Enter temperature : ");
        double temperature = input.nextDouble();

        //compute temperature in fahrenheit
        //double fahrenheit = (double)(9/5) * celsius_value + 32;

        //display the value of celsius in fahrenheit
        System.out.printf("Celsius: %.2f Degrees %n", toCelsius(temperature));

        System.out.printf("Fahrenheits: %.2f F %n", toFahrenheits(temperature));

    }
}
