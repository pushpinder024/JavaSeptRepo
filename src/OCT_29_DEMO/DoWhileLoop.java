package OCT_29_DEMO;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


        double x = Math.random() * 100;
        int randomNum = (int) x;
        System.out.println(randomNum);


        Scanner sc = new Scanner(System.in);
        int guess;


        do {
            System.out.println("KEEP GUESSING");
            guess = sc.nextInt();
        } while (randomNum != guess);

        System.out.println("YOU WIN: RIGHT GUESS");
    }
}
