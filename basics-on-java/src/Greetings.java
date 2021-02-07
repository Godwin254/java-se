import java.util.*;

public class Greetings {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = input.nextLine();
        double number = 10023.3453;

        System.out.printf("Hey %s. How are you? %-5.2f%n", username, number); //("Hey " + username + ". How are you?");

        System.out.printf("%-10s \t %-10s \t %-10s \t %-10s", "First name", "Last name", "Age", "Gender");

        input.close();
    }

}
