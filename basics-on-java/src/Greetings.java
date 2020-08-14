import java.util.*;

public class Greetings {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = input.nextLine();

        System.out.println("Hey " + username + ". How are you?");
    }

}
