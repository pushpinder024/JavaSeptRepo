package DEC_01_DEMO.MethodOverloadingAndOverriding;

public class DriverClass {
    public static void main(String[] args) {
        Person x = new Student();
        x.sleep();
        x.eat();
        x.firstName = "Pushpinder";
        System.out.println(x.firstName);

        System.out.println();
        Student y = new Student();
        y.sleep();
        y.eat();
        y.firstName = "Harry";
        System.out.println(y.firstName);


        System.out.println();

        NewStudent z=  new NewStudent();
        z.eat();
        z.sleep();
        z.drink();
        z.study();


    }
}
