import java.util.*;


public class GetStudentDetails {

    //instance variable
    private String studentName;

    private static final Scanner input = new Scanner(System.in);

    public GetStudentDetails(String name, double termFees){
        this.studentName = name;

        if (termFees < 0 ){
            System.out.printf("No fee is paid!");
        }
    }
}
