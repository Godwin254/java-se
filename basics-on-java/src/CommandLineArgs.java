
public class CommandLineArgs {
    public static void main(String[] args){
        /*
        if (args.length > 0){
                System.out.printf("%s:", "Commandline args are");

            for (String val : args) {
                System.out.println(val);
            }
        }else {
            System.out.printf("%s", "No Commandline args");
        }

         */
        String firstName = "";
        String lastName = "";
        int age = 0;

        if (args.length <= 3) {

            for (int i = 0; i < args.length; i++){

                firstName = args[0];
                lastName = args[1];
                age = Integer.parseInt(args[2]);
            }
            if (args.length > 0)
                System.out.printf("%nMy name is %s %s and am %d years old%n", firstName, lastName, age);
            else
                System.out.println("Oops!,Zero args,No Message to print out");

        } else System.out.println("Enter 3 fields on commandline, \"firstName\" \"lastName\" and \"Age\" ");
    }
}
