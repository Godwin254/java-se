import java.util.*;

public class StudentRegister {

    //main method
    public static void main(String[] args){

        //create object instances;
        //set initial name;
        Student studentA = new Student("James Kayle", 78, 67);

        Scanner input = new Scanner(System.in);

        System.out.printf("Initial name is %s%n", studentA.getStudentName() );
        System.out.printf("mid-term mark is: %d%n", studentA.getMidTermTest());
        System.out.printf("End-term mark is: %d%n", studentA.getEndTermTest());

        //prompt user for name input
        System.out.print("Enter your name: \n");
        String name = input.nextLine();

        //prompt user for mid-term mark
        System.out.print("Enter your mid-term mark: ");
        int midTermMark = input.nextInt();

        //prompt user for end-term test
        System.out.print("Enter your end-term mark: ");
        int endTermMark = input.nextInt();



        try{
            studentA.setName(name);
            studentA.setMidTermMark(midTermMark);
            studentA.setEndTermMark(endTermMark);
        }catch (IllegalArgumentException e){
            e.getMessage();
        }

        System.out.printf("Current name is %s%n", studentA.getStudentName());
        System.out.printf("Current mid-term mark is %d%n", studentA.getMidTermTest());
        System.out.printf("Current end-term mark is %d%n", studentA.getEndTermTest());


        input.close();
    }


}
