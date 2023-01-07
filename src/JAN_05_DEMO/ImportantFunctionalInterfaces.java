package JAN_05_DEMO;

import java.util.Date;
import java.util.function.*;

public class ImportantFunctionalInterfaces {
    public static void main(String[] args) {


        //Function    ----input type T and return type R
        Function<String, Integer> func = s1 -> s1.length();
        System.out.println(func.apply("Pushpinder"));

        Function<String, Integer> func1 = String::length;
        System.out.println(func1.apply("Pushpinder"));



        //Predicate     ------    Boolean type output
        Predicate<String> pred = ImportantFunctionalInterfaces::test;
        System.out.println(pred.test("Pushpinder"));

        Predicate<String> pred1 = s -> s.length() > 10;
        System.out.println(pred1.test("Pushpinder"));



        //  practice     ---covert String to integer

        Function<String, Integer> funct = s -> Integer.parseInt(s);
        System.out.println(funct.apply("1") + 22);

        Function<String, Integer> funct1 = Integer::parseInt;
        System.out.println(funct1.apply("1") + 22);




        //consumers    ---- input type T and no return type

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Pushpinder");

        Consumer<String> consumerw = System.out::println;
        consumerw.accept("Pushpinder");





        //bi-consumers    ---- two type T inputs and no return type
        BiConsumer<String, String> biConsumer = (a, b) -> method7(a, b);
        biConsumer.accept("Pushpinder ", "Singh");

        BiConsumer<String, String> biConsumer1 = ImportantFunctionalInterfaces::method7;
        biConsumer1.accept("Pushpinder ", "Singh");





        //Suppliers      ----- no input and return type T

        Supplier<Date> supply = () -> new Date();
        System.out.println(supply.get());

        Supplier<Date> supply1 = Date::new;
        System.out.println(supply1.get());
    }

    public static void method7(String a, String b) {
        System.out.println(a + " " + b);
    }

    private static boolean test(String s) {
        return s.length() > 10;
    }
}
