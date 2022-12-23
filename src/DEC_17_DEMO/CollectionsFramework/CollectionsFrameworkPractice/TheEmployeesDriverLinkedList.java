package DEC_17_DEMO.CollectionsFramework.CollectionsFrameworkPractice;

import java.util.LinkedList;
import java.util.List;

public class TheEmployeesDriverLinkedList {
    public static void main(String[] args) {
        List<TheEmployees> company1 = new LinkedList<>();
        company1.add(new TheEmployees("108", "Pushpinder", "Singh", "80000", "4377706939"));
        company1.add(new TheEmployees("105", "Naman", "Kumar", "65000", "2341567892"));
        company1.add(new TheEmployees("113", "Tarun", "Gill", "70000", "5556667778"));
        company1.add(new TheEmployees("112", "Abhishek", "Juneja", "65000", "5553334444"));
        company1.add(new TheEmployees("121", "Gurvinder", "Singh", "70000", "6667772222"));
        company1.add(new TheEmployees("124", "Lovish", "Kapoor", "62000", "9998887777"));

        System.out.println(company1);
        System.out.println();
        company1.add(3, new TheEmployees("126", "Preet", "Singh", "60000", "6665554488"));
        System.out.println(company1);


        company1.remove(6);
        System.out.println();
        System.out.println(company1);



        List<TheEmployees> company2 = new LinkedList<>();
        company2.add(new TheEmployees("108", "Pushpinder", "Singh", "80000", "4377706939"));
        company2.add(new TheEmployees("105", "Naman", "Kumar", "65000", "2341567892"));
        company2.add(new TheEmployees("123", "Abhinav", "Juneja", "70000", "5556667778"));
        company2.add(new TheEmployees("127", "Mukesh", "Mangla", "65000", "5553334444"));
        company2.add(new TheEmployees("121", "Gurvinder", "Singh", "70000", "6667772222"));

company1.addAll(company2);
        System.out.println(company1);

    }
}
