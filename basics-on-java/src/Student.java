
public class Student {

    //instance variable
    private String StudentName;
    private int midTermMark;
    private int endTermMark;


    //add class constructor
    public Student(String StudentName, int midTermMark, int endTermMark){

        //add code here
        this.StudentName = StudentName;
        this.midTermMark = midTermMark;
        this.endTermMark = endTermMark;

    }

    //method to set name
    public void setName(String StudentName){
        //check whether names are similar
        if (StudentName.equals("James") && !ValidateInput.validFirstName(StudentName)){
            System.out.printf("%s%n", "Incorrect! Name is similar");
            throw new IllegalArgumentException("Incorrect! Name is similar\n Incorrect name format");

        }else {
            this.StudentName = StudentName;
        }
    }

    //method to set mid-term marks
    public void setMidTermMark(int midTermMark){
        if (midTermMark > 0){
            this.midTermMark = midTermMark;
        }else{
            throw new IllegalArgumentException("mid-term Marks cannot be less that zero");
        }
    }

    //method to set end-term marks
    public void setEndTermMark(int endTermMark){
        if (endTermMark > 0){
            this.endTermMark = endTermMark;
        }else
            throw new IllegalArgumentException("end-term Marks cannot be less that zero");
    }

    //method to get student name
    public String getStudentName( ){
        return StudentName;
    }

    //method to get mid-term marks
    public int getMidTermTest(){ return midTermMark; }

    //method to get end-term marks
    public int getEndTermTest(){ return endTermMark; }
}
