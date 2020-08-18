import java.util.*;

public class StudentRegister {

    //main method
    public static void main(String[] args){

        //create object instances
        Student studentA = new Student();

        Scanner input = new Scanner(System.in);

        System.out.printf("Initial name is %s%n", studentA.getStudentName() );

        //prompt user for input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        studentA.setName(name);

        System.out.printf("Current name is %s%n", studentA.getStudentName());

    }


}
