import java.util.Scanner;
//import java.util.StringTokenizer;

public class Tokenize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();
        String[] tokens = words.split(" ");

        System.out.println(tokens.length);
        for(String token : tokens) System.out.println(token);

        sc.close();
    }
}
