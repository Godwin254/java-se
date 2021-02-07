import java.util.*;

public class ComputeAreaWithInput {
    public static void main(String[] args){
        //define scanner object
        Scanner input = new Scanner(System.in);

        //declare variables
        double radius, area;

        //prompt user for input
        System.out.print("Enter some value: ");
        radius = input.nextDouble();

        //compute area
        area = Math.pow(radius,2) * 3.14159;

        //display area
        System.out.println("The area is  " + area);

        input.close();
    }
}
