package OCT_22_DEMO;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
