
public class BiologyTeacher extends Teacher{
    public static void main(String[] args){

        BiologyTeacher teacher2 = new BiologyTeacher();

        System.out.printf("Name: %s%n", teacher2.getName());
        System.out.printf("School: %s%n", teacher2.school);
        System.out.printf("Location: %s%n", teacher2.location);
        System.out.printf("Does: %s%n", teacher2.does());
        System.out.printf("Room: %s%n", teacher2.room());
        System.out.printf("Subject: %s%n", teacher2.getSubject());
    }

    String getName(){
        return "Mrs Wallace";
    }

    String getSubject(){
        return "Biology";
    }
}
