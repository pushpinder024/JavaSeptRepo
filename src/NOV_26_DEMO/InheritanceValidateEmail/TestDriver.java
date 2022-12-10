package NOV_26_DEMO.InheritanceValidateEmail;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Boolean flag = true;

        Scanner sc = new Scanner(System.in);
        while (flag == true) {
            System.out.println("PLEASE ENTER THE EMAIL FOR THE EMPLOYEE : It should contain @ sign");
            String empEmail = sc.next();

            if (empEmail.contains("@")) {
                Person employee1 = new Employee("Pushpinder", "Singh", 23, 'M', 108, empEmail, "Backend Developer");
                System.out.println(employee1);
                employee1.eat();
                employee1.sleep();
                ((Employee)employee1).work();                       //TYPE CASTING TO ACCESS METHODS ONLY PRESENT IN CHILD CLASS
                flag = false;
            } else {
                System.out.println("The format for the email is not correct : Please Try Again");
                flag = true;
            }


        }


    }
}
