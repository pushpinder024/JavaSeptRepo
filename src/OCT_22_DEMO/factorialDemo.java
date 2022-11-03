package OCT_22_DEMO;

import java.util.Scanner;

public class factorialDemo {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER TO PERFORM FACTORIAL OPERATION");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = 1;
        for (int i = x; i > 0; i--) {
            c *= i;
        }
        System.out.println(c);
    }
}
