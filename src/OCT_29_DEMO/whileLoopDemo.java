package OCT_29_DEMO;

import java.util.Scanner;

public class whileLoopDemo {
    public static void main(String[] args) {

        double x = Math.random() * 10;
        int randomNum = (int) x;
//        boolean flag = true;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("PLEASE TAKE YOUR GUESS FROM 0 TO 9");
            int guess =  sc.nextInt();

            if(guess==randomNum){
                System.out.println("YOUR GUESS IS CORRECT");
                break;
            }else{
                System.out.println("PLEASE TRY AGAIN");
            }
        }
    }
}
