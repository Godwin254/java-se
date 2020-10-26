
public class EmployeeInfo {

    public static void main(String[] args){

        Employee emp1 = new Employee("Kevin", "Tay", 300.0);
        Employee emp2 = new Employee("Wilton", "Candy");
        Employee emp3 = new Employee();
        Employee emp4 = new Employee("Castro");
        //String s = "Godwin";

        //if (s.length())

        try {

            emp3.setSalary(100);

        }catch (IllegalArgumentException e){
            e.getCause();
            e.getMessage();
        }

        System.out.printf("%-12s%-12s%-10s%n", "FirstName", "LastName", "Salary");
        System.out.printf("%-12s%-12s%-10.2f%n", emp1.getFirstName(), emp1.getLastName(),emp1.getSalary());
        System.out.printf("%-12s%-12s%-10.2f%n", emp2.getFirstName(), emp2.getLastName(),emp2.getSalary());
        System.out.printf("%-12s%-12s%-10.2f%n", emp3.getFirstName(), emp3.getLastName(),emp3.getSalary());
        System.out.printf("%-12s%-12s%-10.2f%n", emp4.getFirstName(), emp4.getLastName(),emp4.getSalary());

        System.out.println();

        System.out.printf("Total count: %d", Employee.getCount());
    }
}

class Employee{
    private final String firstName;
    private final String lastName;
    private double salary;
    private static int count;

    //constructors
    public Employee(){
        this("","",0.0);
    }

    public Employee(String firstName){
        this(firstName, "", 0.0);
    }

    public Employee(String firstName, String lastName){
        this(firstName, lastName, 0.0);
    }


    public Employee(String firstName, String lastName, double salary){

        if (salary < 0){
            throw new IllegalArgumentException("Salary cannot be zero or negative");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        count++; //increase Employee count
    }

    //accessors
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;

    }

    public double getSalary(){
        return salary;
    }

    public static int getCount(){
        return count;
    }

    //setters
    public void setSalary(double salary){
        if (salary <= 0){
            throw new IllegalArgumentException("Salary cannot be less than zero");
        }
        this.salary = salary;
    }

}
