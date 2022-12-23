package DEC_17_DEMO.CollectionsFramework.CollectionsFrameworkPractice;

import java.util.*;

public class TheEmployeesDriverTreeSet {
    public static void main(String[] args) {
        Set<TheEmployees> set1 =  new TreeSet<>();
        set1.add(new TheEmployees("108", "Pushpinder", "Singh", "80000", "4377706939"));
        set1.add(new TheEmployees("105", "Naman", "Kumar", "65000", "2341567892"));
        set1.add(new TheEmployees("113", "Tarun", "Gill", "70000", "5556667778"));
        set1.add(new TheEmployees("112", "Abhishek", "Juneja", "65000", "5553334444"));
        set1.add(new TheEmployees("121", "Gurvinder", "Singh", "70000", "6667772222"));
        set1.add(new TheEmployees("124", "Lovish", "Kapoor", "62000", "9998887777"));


        Set<TheEmployees> set2 = new TreeSet<>();
        set2.add(new TheEmployees("108", "Pushpinder", "Singh", "80000", "4377706939"));
        set2.add(new TheEmployees("105", "Naman", "Kumar", "65000", "2341567892"));
        set2.add(new TheEmployees("123", "Abhinav", "Juneja", "70000", "5556667778"));
        set2.add(new TheEmployees("127", "Mukesh", "Mangla", "65000", "5553334444"));
        set2.add(new TheEmployees("121", "Gurvinder", "Singh", "70000", "6667772222"));

        set1.addAll(set2);
        System.out.println(set1);
    }
}
