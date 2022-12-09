package NOV_24_DEMO.KaranBank;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {







        int account,balance,limit,score1;

        Scanner sc = new Scanner(System.in);
        System.out.println("***** Bank *****");
        System.out.println("Choose Account for description");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        System.out.println("3. Visa");
        System.out.println("0. Exit");
        int choice = sc.nextInt();

        do {
            switch (choice) {


                case 1:
                    Features checking = new Features(0, 0, 0, 0);

                    System.out.println("Enter the account number: ");
                    checking.accountNumber = sc.nextInt();
                    System.out.println("Enter the balance: ");
                    checking.balance = sc.nextInt();
                    System.out.println("Enter the interest rate : ");
                    checking.interstaRate = sc.nextInt();
                    System.out.println("Enter the number of transactions per day");
                    checking.transactions = sc.nextInt();
                    System.out.println(checking);
                    break;

                case 2:

                    Promotion savings = new Promotion(0, 0, 0, null);

                    System.out.println("Enter the account number: ");
                    savings.accountNumber = sc.nextInt();
                    System.out.println("Enter the balance: ");
                    savings.balance = sc.nextInt();
                    System.out.println("Enter the interst rate : ");
                    savings.interstaRate = sc.nextInt();
                    System.out.println("Are the promotions available: (y/n)");
                    savings.promotions = sc.next();
                    if (savings.promotions.equals("y")) {
                        savings.interstaRate += 1.5;
                        System.out.println(savings);
                        break;
                    } else {

                        System.out.println(savings);
                        break;

                    }

                case 3:

                    CreditScore score = new CreditScore(0, 0, 0, 0);

                    System.out.println("Enter the account number: ");
                    score.accountNumber = sc.nextInt();
                    System.out.println("Enter the balance: ");
                    score.balance = sc.nextInt();
                    System.out.println("Enter the limit: ");
                    score.limit = sc.nextInt();
                    System.out.println("Enter the credit score: ");
                    score.score1 = sc.nextInt();
                    System.out.println(score);

                    break;

            }
            String choose;
            System.out.println("Do you want to try again ? (y/n)");
            choose=sc.next();
            if(choose.equals("y"))
            {
                System.out.println("***** Bank *****");
                System.out.println("Choose Account for description");
                System.out.println("1. Checking");
                System.out.println("2. Savings");
                System.out.println("3. Visa");
                System.out.println("0. Exit");
                System.out.println();
                choice = sc.nextInt();

            }
            else {
                break;
            }
        }while(choice!=0);
        System.out.println("You exit .. Have a good day :)");
    }
}
