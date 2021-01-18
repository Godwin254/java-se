import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {

    //fields
    public static final Scanner sc = new Scanner(System.in);

    //function  to perform area of square
    public static double areaOfSquare(double length)throws InputMismatchException{

        //area = length * length
        return (length * length);
    }
    //area of rectangle
    public static double areaOfRectangle(double length, double width) throws ArithmeticException, InputMismatchException {

        //area = length * width
        return (length * width);
    }
    //area of triangle
    public static double areaOfTriangle(double base , double height)throws ArithmeticException, InputMismatchException {

        //area = 1/2 * base * height
        return ((double) 1/2 * base * height );
    }
    //main function
    public static void main(String[] args){

        //add code here
        try {


            System.out.print("Enter length(base): ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            double _square = areaOfSquare(length);
            double _rectangle = areaOfRectangle(length, width);
            double _triangle = areaOfTriangle(length, height);

            System.out.printf("%-10s%-10s%-10s%n", "Square", "Rectangle", "Triangle");

            System.out.printf("%-10.2f%-10.2f%-10.2f%n", _square, _rectangle, _triangle);
        }
        catch (InputMismatchException e){
            System.err.printf("%s%n", e.getMessage());
            System.out.println("Enter a integer value");
            sc.nextDouble();
        }finally {
            sc.close();
        }

    }
}
