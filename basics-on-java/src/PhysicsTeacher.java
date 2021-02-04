
//demonstrating inheritance
public class PhysicsTeacher extends Teacher{

    public static void main(String[] args){

        PhysicsTeacher teacher1 = new PhysicsTeacher();

        System.out.printf("Name: %s%n", teacher1.getName());
        System.out.printf("School: %s%n", teacher1.school);
        System.out.printf("Location: %s%n", teacher1.location);
        System.out.printf("Does: %s%n", teacher1.does());
        System.out.printf("Room: %s%n", teacher1.room());
        System.out.printf("Subject: %s%n", teacher1.getSubject());
    }

    String getName(){
        return "Mr Angelo";
    }

    String getSubject(){
        return "Physics";
    }

}
