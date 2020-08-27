import java.util.*;

//Hacker-rank 30 days of code

public class ConditionalStatement {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if ( N % 2 != 0){
                //is odd
                System.out.print("Weird");
            }else if (N >= 2 && N <= 5 ){
                //range of 2 to 5 and even
                System.out.print("Not Weird");
            }else if (N >= 6 && N <= 20 ){
                //range 6 to 20 and even
                if ( N % 2 == 0)
                    System.out.print("Weird");
            }else{
                //greater than 20 and even
                System.out.print("Not Weird");
            }

                scanner.close();
        }


}
