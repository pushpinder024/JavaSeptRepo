package DEC_03_DEMO.TimHortonsAssignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {

        List<TimSuperParent> list = new ArrayList<>();

        double total = 0;

        TimSuperParent a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to order: YES or NO");
        String validate = sc.next();

        while (validate.equals("YES")) {
            System.out.println("What would you like to order : Press 1 for Merch or Press 2 for Consumables");
            int choice = sc.nextInt();


            if (choice == 1) {
                System.out.println("Which item from our Merch would you like to order: \n" +
                        "Press 1 for NHL CARDS \n" +
                        "Press 2 for COFFEE POWDER \n" +
                        "Press 3  for COFFEE MUG");
                choice = sc.nextInt();


                switch (choice) {

                    case 1:
                        description(a = new IceHockeyCards(), list);

                        total = total + a.getPrice();
                        break;

                    case 2:
                        description(a = new DiyCoffee(), list);
                        total = total + a.getPrice();

                        break;

                    case 3:
                        description(a = new CoffeeMug(), list);
                        total = total + a.getPrice();

                        break;

                }


            } else if (choice == 2) {
                System.out.println("Which item from our Consumables would you like to order: \n" +
                        "Press 1 for COFFEE \n" +
                        "Press 2 for BAGEL \n" +
                        "Press 3 for DONUT \n" +
                        "Press 4 for TEA \n" +
                        "Press 5 for SANDWICH \n" +
                        "Press 6 for WRAP");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        description(a = new Coffee(), list);
                        total = total + a.getPrice();

                        break;
                    case 2:
                        description(a = new Bagel(), list);
                        total = total + a.getPrice();

                        break;
                    case 3:
                        description(a = new Donut(), list);
                        total = total + a.getPrice();

                        break;
                    case 4:
                        description(a = new Tea(), list);
                        total = total + a.getPrice();

                        break;
                    case 5:
                        description(a = new Sandwich(), list);
                        total = total + a.getPrice();

                        break;
                    case 6:
                        description(a = new Wrap(), list);
                        total = total + a.getPrice();

                        break;
                }


            } else {
                System.out.println("INVALID ENTRY");
                break;
            }

            System.out.println("Do you want to order anything else : YES or NO");
            validate = sc.next();
        }
        System.out.println("Here a list of total items ordered \n*********************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*********************");
        System.out.println("Your grand total is: " + total);


        System.out.println("Proceeding to the payment page.......");
        paymentAuthorization(sc);
    }


    public static void paymentAuthorization(Scanner sc) {
        System.out.println("Please enter the credit card number");
        String creditNo = sc.next();
        System.out.println("Please enter the CVV number");
        String CVV = sc.next();
        System.out.println("Please enter the expiry date in MM/YYYY format");
        String expiry = sc.next();

        if (creditNo.equals(PaymentDetails.creditCardNumber) && CVV.equals(PaymentDetails.CVVnumber) && expiry.equals(PaymentDetails.expiryDate)) {
            System.out.println("PAYMENT SUCCESSFUL :) \n Thankyou for the business!!");
        } else {
            System.out.println("Credit Card credentials do not match :(  \n Hope to see you again");
        }

    }

    public static void description(TimSuperParent product, List<TimSuperParent> listOfItemsOrdered) {
        int choice = 0;
        if (product instanceof TimMerch) {
            System.out.println(product);
            System.out.println("Do you wish to continue : 1 for yes, 2 for no");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();


        } else if (product instanceof TimConsumables) {
            System.out.println(product);
            System.out.println("Do you wish to continue : 1 for yes, 2 for no");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        }

        if (choice == 1) {
            listOfItemsOrdered.add(product);


        }
    }

}
