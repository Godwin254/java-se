import java.util.*;

public class GuessBirthday{
    public static void main(String[] args){
       Scanner input  = new Scanner(System.in);
        /*
       System.out.print("Enter an integer number: ");

        int num = input.nextInt();

       int guess = 10; //(int)(Math.random() * 100);

        while(num != guess){

            if (num > guess){
                System.out.println("The number is too big");
            }else{
                System.out.println("The number is too less...Try again!");
            }

            System.out.print("Enter an integer number: ");

            num = input.nextInt();
        }


        do {
            if (num > guess){
                System.out.println("The number is too big");
            }else{
                System.out.println("The number is too less...Try again!");
            }

            System.out.print("Enter an integer number: ");

            num = input.nextInt();
        }while (num != guess);

        System.out.println("   Yey! You guessed correctly");\

         */

        System.out.print("Are you ready for the bible quiz? ");
        String response = input.nextLine();

        while(response.equals("yes")){
            for (int i = 1; i <= 3; i++) {
                if (i == 1) {
                    System.out.println("--------------------------------------------------\n");
                    System.out.print("Which is the first book of the bible? ");
                    String answer = input.nextLine();

                    while (!answer.equals("Genesis")) {
                        if (answer.startsWith("g")) {
                            System.out.println("Begin your answer with a capital letter ... \"H\" ");
                        }
                        else{
                            System.out.println("OOPS! try again");
                        }

                        System.out.print("Which is the first book of the bible? ");
                        answer = input.nextLine();
                    }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Correct! the first book of the bible is " + answer);

                } else if( i == 2){
                    System.out.println("--------------------------------------------------\n");
                    System.out.print("Who was the father of David? ");
                    String answer = input.nextLine();

                    while (!answer.equals("Jesse")) {
                        if (answer.startsWith("j")) {
                            System.out.println("Begin your answer with a capital letter ... \"H\" ");
                        }
                        else{
                            System.out.println("OOPS! try again");
                        }

                        System.out.print("Who was the father of David? ");
                        answer = input.nextLine();
                    }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Correct! the father of David is " + answer);

                } else {
                    System.out.println("--------------------------------------------------\n");
                    System.out.print("Who was the mother of Jesus? ");
                    String answer = input.nextLine();

                    while (!answer.equals("Mary")) {
                        if (answer.startsWith("m")) {
                            System.out.println("Begin your answer with a capital letter ... \"H\" ");
                        }else{
                            System.out.println("OOPS! try again");
                        }

                        System.out.print("Who was the mother of Jesus? ");
                        answer = input.nextLine();
                    }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Correct! the mother of Jesus is " + answer);

                }
            }

        }
        System.out.println("--------------------------------------------------\n");

        
        if (response.equals("no"))
            System.out.println("Thanks for your time... you could try again later! Bye");


        input.close();
    }
}