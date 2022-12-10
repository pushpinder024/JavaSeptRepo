package NOV_24_DEMO.CarInheritance;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to run the operation : YES or NO");
        String ABC = sc.next();

        while (ABC.equals("YES")) {

            System.out.println("Choose the brand : TESLA , FORD ,  HONDA ");
            String operation = sc.next();
            String x;

            Car vehicle;


            switch (operation) {
                case "TESLA":
                    vehicle = new Tesla(2021, 32000, 50000, 45000);
                    System.out.println(vehicle);

                    System.out.println("Which type of info would you like to have : type -  A for Acceleration or B for BREAK");
                    x = sc.next();
                    if (x.equals("A")) {
                        vehicle.acceleration();
                    } else if (x.equals("B")) {
                        vehicle.breaking();
                    } else {
                        System.out.println("WRONG INPUT- GOOD BYE");
                    }
                    break;


                case "FORD":
                    vehicle = new Ford(2022, 12000, 60000, 3200);
                    System.out.println(vehicle);
                    System.out.println("Which type of info would you like to have : type -  A for Acceleration or B for BREAK");
                    x = sc.next();
                    if (x.equals("A")) {
                        vehicle.acceleration();
                    } else if (x.equals("B")) {
                        vehicle.breaking();
                    } else {
                        System.out.println("WRONG INPUT- GOOD BYE");
                    }
                    break;


                case "HONDA":
                    vehicle = new Honda(2020, 50000, 30000, 2400);
                    System.out.println(vehicle);
                    System.out.println("Which type of info would you like to have : type -  A for Acceleration or B for BREAK");
                    x = sc.next();
                    if (x.equals("A")) {
                        vehicle.acceleration();
                    } else if (x.equals("B")) {
                        vehicle.breaking();
                    } else {
                        System.out.println("WRONG INPUT- GOOD BYE");
                    }
                    break;

                default:
                    System.out.println("INVALID ENTRY");


            }
            System.out.println("DO YOU WANT TO TRY THE OPERATION ONCE MORE : YES or NO");
            ABC = sc.next();


        }
    }
}
