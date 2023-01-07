package DEC_29_DEMO.AnonymousClassesAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainDriver {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Pushpinder", "Harry", "Naman", "Nikhil");
        System.out.println(data);


        data.forEach(d-> System.out.println(d));
        data.forEach(System.out::println);


       data.forEach(s -> System.out.println(s.length()));

        data.forEach(MainDriver::lengthPrint);



        /*  SORTING-----> */   data.sort((x,r)->x.compareTo(r));
        System.out.println(data);

    }

    public static void lengthPrint(String g){
        System.out.println(g.length());
    }
}
