import java.util.*;

public class Tokenize2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ValidateInput inputs = new ValidateInput();
        String[] userInputs = new String[7];

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        System.out.print("Enter zipcode: ");
        String zip = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        //validate user inputs
        if (!inputs.validFirstName(firstName)){
            System.out.println("Invalid first name");
        }else if (!inputs.validLastName(lastName)){
            System.out.println("Invalid last name");
        }else if (!inputs.validAddress(address)){
            System.out.println("Invalid address");
        }else if (!inputs.validCity(city)){
            System.out.println("Invalid city name");
        }else if (!inputs.validState(state)){
            System.out.println("Invalid state name");
        }else if (!inputs.validZip(zip)){
            System.out.println("Invalid Zip code");
        }else if (!inputs.validZip(phone)){
            System.out.println("Invalid phone number");
        }else{
            System.out.println("!!Valid inputs!!");

            System.out.printf("%nUser details%n");
            for (int i = 0; i < userInputs.length; i++){
                userInputs[0] = firstName;
                userInputs[1] = lastName;
                userInputs[2] = address;
                userInputs[3] = city;
                userInputs[4] = state;
                userInputs[5] = zip;
                userInputs[6] = phone;

                System.out.println(userInputs[i]);
            }
        }

        sc.close();

    }
}

//validate user inputs
class ValidateInput{

    //validate first name
    public static boolean validFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    //validate lastName
    public static boolean validLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*"); //matches any number of letters split by a space(*), apostrophes(') or hyphen(-)
    }

    //validate address
    public static boolean validAddress(String address){
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    //validate city
    public static boolean validCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    //validate state
    public static boolean validState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    //validate zip
    public static boolean validZip(String zip){
        return zip.matches("\\d{5}");
    }

    //validate phone
    public static boolean validPhone(String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }

}

