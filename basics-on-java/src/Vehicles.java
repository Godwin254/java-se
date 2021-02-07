import java.util.Scanner;

public class Vehicles {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //prompt input of an animals name
        System.out.println("Enter an animals name");
        String animalName = sc.next();

        String sound = sounds(animalName);

        System.out.println(sound);

        sc.close();
    }

    static String sounds(String animal){

        switch (animal){
            case "cow":
                System.out.printf("Moo Moo%n");
                break;
            case "dog":
                System.out.printf("Goo Goo%n");
                break;
            case "bee":
                System.out.printf("hiiiiiiizzzzzzz%n");
                break;
            case "cat":
                System.out.printf("Miaaaaauuuuu%n");
                break;
            default:
                System.out.printf("That is not an animal%n");
        }

        return animal;
    }

}
