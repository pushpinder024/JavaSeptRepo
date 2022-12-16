package DEC_01_DEMO.MethodOverloadingAndOverriding;

public class Student extends Person{
    public String stuId;
    public String grade;



    @Override
    public void eat() {
        System.out.println("Student eat");
    }
    public void study(){
        System.out.println("Student study");
    }

    @Override
    public void drink() {
        System.out.println("Student Drinks");
    }
}
