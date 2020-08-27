import java.util.*;

//Hacker-rank 30 days of code

public class TestPersonsAge {
    private int age;

    //constructor
    public TestPersonsAge(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (!(initialAge < 0) )
            this.age = initialAge;
        else{
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }

    }

    //instance method to determine how old
    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if ( age < 13 )
            System.out.println("You are young.");
        else if (age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }
    }

    //instance method to increase age
    public void yearPasses() {
        // Increment this person's age.
        age += 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            TestPersonsAge p = new TestPersonsAge(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
