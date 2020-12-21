import java.util.*;

public class Arithmetics {
    //multiplication
    public static int multiply(int num1, int num2) throws InputMismatchException{

        return (num1 * num2);
    }
    //division
    static int quotient(int num1, int num2) throws ArithmeticException , InputMismatchException{

        if (num2 > num1){
            //swap numbers
            int temp;
            temp = num2;
            num2 = num1;
            num1 = temp;

        }
        return num1 / num2;
    }
    //addition
    static int sum(int num1, int num2)throws InputMismatchException{

        return  (num1 + num2);
    }
    //subtraction
    static int subtract(int num1, int num2) throws InputMismatchException{

        if (num2 > num1){
            //swap numbers
            int temp;
            temp = num2;
            num2 = num1;
            num1 = temp;

        }
        return  num1 - num2;
    }

    /* swapping
    static int swap(int num1, int num2){

        return num1;

    }

     */

    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean loopTest = true;

        do{

            try{
                System.out.print("Enter the first number");
                int num1 = sc.nextInt();
                System.out.print("Enter the first number");
                int num2 = sc.nextInt();

                int multiply = multiply(num1, num2);
                int divide = quotient(num1,num2);
                int sum = sum(num1,num2);
                int subtract = subtract(num1,num2);

                System.out.printf("%-10s%-10s%-10s%-10s%n0", "Multiply", "quotient", "sum", "subtract");
                System.out.printf("%-10d%-10d%-10d%-10d%n", multiply, divide, sum, subtract);

                loopTest = false;
            }
            catch (ArithmeticException | InputMismatchException error){

                System.err.printf("%nException: %s", error);
                System.out.printf("%s%n","Cannot divide by zero");

                System.out.print("Try and enter a correct value");
                sc.nextInt();
            }
        }while(loopTest);

    }
}
