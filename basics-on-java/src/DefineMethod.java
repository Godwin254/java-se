import java.util.*;

public class DefineMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int max_num = max(num1, num2);

        System.out.println("maximum number is " + max_num);

        input.close();
    }

    public static int max(int num1, int num2){
        int result;

        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }

        return result;
    }

}
