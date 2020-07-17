//program to determine domestic and wild animals
import java.util.*;

public class TypeOfAnimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of an animal: ");
        String animal = input.next();

        switch (animal){
            case "cow":
            case "dog":
            case "hen": System.out.println(animal + " is a domestic animal");break;
            case "lion":
            case "zebra":
            case "tiger": System.out.println(animal + " is a wild animal");break;
            default: System.out.println(animal + " is not an animal");
        }
    }
}
