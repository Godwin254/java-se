//program to compute random subtraction
import java.util.*;

public class SubtractionQuiz {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);

        //generate two random numbers
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        //swap numbers
        if (number1 < number2){

            int temporaryNumber = number1;
            number2 = number1;
            number1 = temporaryNumber;

        }

        //prompt user to perform subtraction
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        //alert user of the correct answer
        if (number1 - number2 == answer){
            System.out.println("yey! Correct answer");
        }
        else{
            System.out.println("Oops! Incorrect answer");
            System.out.println( number1 + " - " + number2 + " = " + (number1 - number2));
        }

        input.close();
    }
}
