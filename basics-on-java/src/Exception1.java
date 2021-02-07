import java.util.*;

//handling arithmeticException and inputMismatchException

public class Exception1 {

    //method to perform division
    public static int quotient(int numerator, int denominator) throws ArithmeticException{

        return numerator / denominator;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean continueLoop = true;

        do {
            try {
                System.out.print("Enter numerator: ");
                int numerator = sc.nextInt();
                System.out.print("Enter denominator: ");
                int denominator = sc.nextInt();

                int result = quotient(numerator,denominator);
                System.out.printf("%nResult: %d / %d = %d", numerator, denominator, result);
                continueLoop = false;
            }catch (InputMismatchException error1){
                System.err.printf("%nException: %s%n", error1);
                sc.nextLine(); //discards input so that user can try again
                System.out.printf("Ensure to enter integers%n%n");
            }catch (ArithmeticException error2){
                System.err.printf("%Exception: %s%n", error2);
                System.out.print("Zero is an invalid denominator");
            }
        }while (continueLoop);

        sc.close();
    }
}
