package day50_PolymorphisimContinue.WarmUp;

public class Student implements online_Education, Cybertek {

    private String studentName;
    private int age;
    private double grade;
    private boolean has_ITBackGround;

    @Override
    public String toString() {
        return "Student{" + "studentName='" + studentName + '\'' + ", age=" + age +
                ", grade=" + grade + ", has_ITBackGround=" + has_ITBackGround +'}';
    }

    public void studying(String studentName){
        System.out.println(studentName+ " is studying");
    }
    public void takingBreaks(String studentName){
        System.out.println(studentName + " is taking breaks");
    }
    public String getStudentName(){
        return studentName;
    }
    public int getAge(){
        return age;
    }
    public double getGrade(){
        return grade;
    }
    public boolean isHas_ITBackGround() {
        return has_ITBackGround;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public void setHas_ITBackGround(boolean has_ITBackGround){
        this.has_ITBackGround=has_ITBackGround;
    }
    @Override
    public void attendClass(String name) {
        System.out.println(name + "is attending class");
    }
    public  Student (String studentName,int age,double grade,boolean has_ITBackGroun){
        this.age=age;
        this.grade=grade;
        this.has_ITBackGround=has_ITBackGroun;
        this.studentName=studentName;
    }



}
