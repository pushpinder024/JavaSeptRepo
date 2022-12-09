package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class BankDriver {
    public static void main(String[] args) {
        ChequingAccount sc = new ChequingAccount();
        sc.setAccountNumber("105");
        sc.setCustomerFirstName("Naman");
        sc.setCustomerLastName("Kumar");
        sc.setChequingAccountBalance(20000);
        sc.setWithdrawalAmount(2000);

        sc.withdrawal(sc.getChequingAccountBalance(), sc.getWithdrawalAmount());
        sc.setDepositAmount(15000);
        sc.deposit(sc.getChequingAccountBalance(),sc.getDepositAmount());
        sc.description();


        System.out.println();

        SavingsAccount ab = new SavingsAccount();
        ab.setSavingsAccountBalance(50000);
        ab.setAccountNumber("108");
        ab.setCustomerFirstName("Pushpinder");
        ab.setCustomerLastName("Singh");
        ab.interestRate(ab.getSavingsAccountBalance(), 4.5F);
        ab.description();


        System.out.println();


        SpecialPromoSavingsAccount xy = new SpecialPromoSavingsAccount();
        xy.setAccountNumber("110");
        xy.setCustomerFirstName("Ayush");
        xy.setCustomerLastName("Sharma");
        xy.setSpecialBonusInDollars(1);
        System.out.println(xy.interestRate(100, 5));
        xy.description();


        System.out.println();

        BankAccount pp = new BankAccount();
        pp.setAccountNumber("109");
        pp.setCustomerFirstName("Nikhil");
        pp.setCustomerLastName("Salaria");
        pp.description();

    }
}
