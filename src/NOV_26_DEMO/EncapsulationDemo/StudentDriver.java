package NOV_26_DEMO.EncapsulationDemo;

public class StudentDriver {
    public static void main(String[] args) {
        StudentAddress studentAddress1 =  new StudentAddress("113 Cherrylawn Avenue", "North York","ON","M9L2B6","Canada");
        StudentDemo studentDemo =  new StudentDemo(108,"Pushpinder","Singh", studentAddress1,"pushpindersingh024@gmail.com","4377706939");
        System.out.println(studentDemo);
    }
}
