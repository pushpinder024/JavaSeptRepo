package OCT_20_DEMO;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int x = 1;
//          int c = (x++)   + (++x)  +  (x++) ;
//        System.out.println(x);
//        System.out.println(c);
//

        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR ARRIVAL TIME");
        int arrivalTime = sc.nextInt();
        if(arrivalTime>8){
            System.out.println("YOU ARE NOT ADMITTED");
        } else{
            System.out.println("YOU ARE ADMITTED");
        }



        method2(9);

    }

    public static void method2(int arrivalTime){
        if(arrivalTime>8){
            System.out.println("YOU ARE NOT ADMITTED");
        } else{
            System.out.println("YOU ARE ADMITTED");
        }
    }
}
