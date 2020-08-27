import java.util.*;

//Hacker-rank 30 days of code
// # DAY 2 : Operators

public class MealCost {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tipPercent = meal_cost * tip_percent / 100;
        double taxPercent = meal_cost * tax_percent / 100;
        double totalCost = meal_cost + tipPercent + taxPercent;

        System.out.printf("%d", Math.round(totalCost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

       // int totalCost = (int) (Math.round(meal_cost + tipPercent + taxPercent) );

        //System.out.printf("%d", MealCost.solve());

        scanner.close();
    }
}

// all test-cases passed