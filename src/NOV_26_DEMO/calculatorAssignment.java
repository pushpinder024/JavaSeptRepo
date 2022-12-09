package NOV_26_DEMO;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculatorAssignment {
    public static void main(String[] args) {
        Scanner javaDemo = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBERS");
        int x = javaDemo.nextInt();
        int y = javaDemo.nextInt();


        System.out.println("YES OR NO");
        Scanner sc = new Scanner(System.in);
        String ABC = sc.next();

        while (ABC.equals("YES")) {

            System.out.println("Please enter the type of operation you want to execute - '+', '-', '*', '/'");

            char operation = sc.next().charAt(0);


            System.out.println("Please enter the two numbers to perform the operation");


            switch (operation) {
                case '+':
                    add(x, y);
                    break;

                case '-':
                    subtraction(x, y);
                    break;
                case '*':
                    multiply(x, y);
                    break;
                case '/':
                    while (y == 0) {
                        System.out.println("WRONG INPUT -  CANNOT TAKE ZERO AS A DIVIDER - PLEASE ENTER THE SECOND NUMBER AGAIN");
                        y = sc.nextInt();
                    }

                    division(x, y);
            }


            System.out.println("DO YOU WANT TO KEEP OPERATION RUNNING: ENTER  YES OR NO");
            ABC = sc.next();

        }
    }


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void division(int a, int b) {
        System.out.println(a / b);
    }
}

