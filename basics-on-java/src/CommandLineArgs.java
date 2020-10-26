
public class CommandLineArgs {
    public static void main(String[] args){

        if (args.length > 0){
                System.out.printf("%s:", "Commandline args are");

            for (String val : args) {
                System.out.println(val);
            }
        }else {
            System.out.printf("%s", "No Commandline args");
        }

    }
}
