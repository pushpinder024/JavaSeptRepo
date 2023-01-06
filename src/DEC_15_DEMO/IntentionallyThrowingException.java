package DEC_15_DEMO;

import java.util.Scanner;

public class IntentionallyThrowingException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            if (age < 18) {
                throw new RuntimeException("Not the legal drinking age");
            }

        } catch (RuntimeException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            exceptionDemo(sc);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(e.getMessage());                                             //widest exception class type
        }

    }

    public static void exceptionDemo(Scanner b) throws Exception {                          //narrower exception class type
        exceptionDemo1(b);
    }

    public static void exceptionDemo1(Scanner a) throws RuntimeException {                  //narrowest exception class type
        if (a.nextInt() == 12) {
            throw new ArithmeticException("This message is coming from Exception ImportantFunctionalInterfaces 1 method");
        }
    }


}
