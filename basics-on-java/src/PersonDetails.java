
public class PersonDetails {
    public static void main(String[] args) {
        //Person person1 = new Person();

        System.out.println("Name :" + Person.getName() );
        System.out.println("Age :" + Person.getAge() );
    }
}

class Person{

    //getters
    public static String getName(){

       return "John Doe";
    }

    public static int getAge(){

        return 13;
    }
}


