import java.util.Scanner;

public class CompanyInfo {
    //instance variable
    String companyName;
    int companyPin;
    double companyBalance;
    private static final Scanner input = new Scanner(System.in);

    //constructor
    public CompanyInfo(String companyName, int companyPin, double companyBalance){

        this.companyName = companyName;
        this.companyPin = companyPin;
        this.companyBalance = companyBalance;
    }

    //method to set company name
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    //method to set company pin
    public void setCompanyPin(int companyPin){
        this.companyPin = companyPin;
    }

    //method to set company balance
    public void setCompanyBalance(double companyBalance){
        this.companyBalance = companyBalance;
    }

    //method to retrieve company name
    public String getCompanyName(){
        return companyName;
    }

    //method to retrieve company pin
    public int getCompanyPin() {
        return companyPin;
    }

    //method to retrieve company balance
    public double getCompanyBalance() {
        return companyBalance;
    }

    //main method
    public static void main(String[] args){
        //instance of an object
        CompanyInfo company1 = new CompanyInfo("Eddy company", 4567,50000);

        System.out.printf("Company Name: %s%n Company Pin: %d%n Company Balance: %.3f%n", company1.getCompanyName(), company1.getCompanyPin(), company1.getCompanyBalance());

        System.out.print("--------------------------\n");

        System.out.print("Enter company name: ");
        String companyName = input.nextLine();

        System.out.print("Enter company pin: ");
        int companyPin = input.nextInt();

        System.out.print("Enter company balance: ");
        double companyBalance = input.nextDouble();

        //set account details
        company1.setCompanyName(companyName);
        company1.setCompanyPin(companyPin);
        company1.setCompanyBalance(companyBalance);

        System.out.print("--------------------------\n");

        System.out.printf("Company Name: %s%n Company Pin: %d%n Company Balance: %.3f%n", company1.getCompanyName(), company1.getCompanyPin(), company1.getCompanyBalance());
    }
}
