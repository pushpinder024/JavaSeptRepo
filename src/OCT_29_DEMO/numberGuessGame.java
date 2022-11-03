package OCT_29_DEMO;

import java.util.Scanner;

public class numberGuessGame {
    public static void main(String[] args) {
        double x = Math.random() * 100;
        int randomNum = (int) x;





        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("PLEASE TAKE YOUR GUESS FROM 0 TO 99");
            int guess =  sc.nextInt();
            if(randomNum==guess){
                System.out.println("YOUR GUESS IS RIGHT");
                break;
            } else if (randomNum<guess) {
                System.out.println("YOUR GUESS IS GREATER THAN THHE CORRECT NUMBER");
            } else{
                System.out.println("YOUR GUESS IS LESS THAN THE CORRECT NUMBER");
            }
        }



    }
}
