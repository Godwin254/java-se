import java.util.*;

public class AccountsInfo {
    //instance variables
    private static final Scanner input = new Scanner(System.in);
    private String name;
    private double depositAmount;
    private double accountBalance;

    //constructors
    //non-static methods
    //setters
    public void setName(String name) { this.name = name; }

    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    public void setDepositAmount( double depositAmount ) { this.depositAmount = depositAmount; }

    //getters
    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getNewAccountBalance(){
        return accountBalance + depositAmount;
    }

    //main method
    public static void main(String[] args) {
        AccountsInfo personA = new AccountsInfo();

        System.out.print("Enter name: \n");
        String name = input.nextLine();

        System.out.print("Deposit amount: \n");
        double deposit = input.nextDouble();

        //standing balance
        double balance = 4000;

        //set details
        personA.setName(name);
        personA.setDepositAmount(deposit);
        personA.setAccountBalance(balance);

        //print outputs
        System.out.printf("Account name: %s%n", personA.getName());
        System.out.printf("Initial balance: %.3f%n", personA.getAccountBalance());
        System.out.printf("Deposited amount: %.3f%n", personA.getDepositAmount());
        System.out.printf("Current balance: %.3f%n", personA.getNewAccountBalance());
        System.out.printf("%nTaxed : %.2f%n", taxBalance(personA.getNewAccountBalance()));
        System.out.printf("%nNew balance (taxed): %.3f%n", (personA.getNewAccountBalance() - taxBalance(personA.getNewAccountBalance())));
    }

    //static method
    public static double taxBalance(double accountBalance) {
        return (accountBalance * ((double) 6/100));
    }

}
