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
        if (StudentName.equals("James")){
            System.out.printf("%s%n", "Incorrect! Name is similar");
        }else {
            this.StudentName = StudentName;
        }
    }

    //method to set mid-term marks
    public void setMidTermMark(int midTermMark){
        if (midTermMark > 0){
            this.midTermMark = midTermMark;
        }
    }

    //method to set end-term marks
    public void setEndTermMark(int endTermMark){
        if (endTermMark > 0){
            this.endTermMark = endTermMark;
        }
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
