package JAN_05_DEMO;

import java.util.Date;
import java.util.function.*;

public class ImportantFunctionalInterfaces {
    public static void main(String[] args) {


        //Function    ----input type T and return type R
        Function<String, Integer> func = String::length;
        System.out.println(func.apply("Pushpinder"));


        //Predicate     ------    Boolean type output
        Predicate<String> pred = s -> s.length() > 10;
        System.out.println(pred.test("Pushpinder"));


        //  practice     ---covert String to integer

        Function<String, Integer> funct = Integer::parseInt;
        System.out.println(funct.apply("1") + 22);


        //consumers    ---- input type T and no return type

        Consumer<String> consumer = System.out::println;
        consumer.accept("Pushpinder");

        //bi-consumers    ---- two type T inputs and no return type
        BiConsumer<String, String> biConsumer = ImportantFunctionalInterfaces::method7;
        biConsumer.accept("Pushpinder ", "Singh");





        //Suppliers      ----- no input and return type T

        Supplier<Date> supply = Date::new;
        System.out.println(supply.get());
    }

    public static void method7(String a, String b) {
        System.out.println(a + " " + b);
    }
}
