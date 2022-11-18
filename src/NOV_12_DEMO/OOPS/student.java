package NOV_12_DEMO.OOPS;

public class student {
    static String collegeName;
    long id;
    String name;
    int grade;

    public void getInfo() {
        System.out.println("Student name is "+name);
        System.out.println("Student id is " + id);
        System.out.println("Student grade is " +grade);
        System.out.println("The college name is " + collegeName);
    }
}
