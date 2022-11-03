package OCT_29_DEMO;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter month number(1-12)");
        int monthNo = sc.nextInt();

        switch (monthNo) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                System.out.println();

            case 2:
                System.out.println("38 days");
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
