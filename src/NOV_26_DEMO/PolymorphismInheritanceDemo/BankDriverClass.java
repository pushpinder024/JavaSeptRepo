package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class BankDriverClass {
    public static void main(String[] args) {
        Bank client1 = new ChequingAccount("Pushpinder", "Singh", "108", 20000, "108C");

        client1.deposit(((ChequingAccount) client1).getChequingAccountBalance(), 2000);

        System.out.println(client1 +""+ '\n');


        client1.deposit(((ChequingAccount) client1).getChequingAccountBalance(), 2000);
        client1.deposit(((ChequingAccount) client1).getChequingAccountBalance(), 2000);
        client1.withdrawal(((ChequingAccount) client1).getChequingAccountBalance(), 200);

        System.out.println(client1 +""+ '\n');



        Bank client2 = new SavingsAccount("Naman", "Kumar", "105", 25000, "105S",300);
        client2.deposit(((SavingsAccount) client2).getSavingsAccountBalance(), 5000);
        client2.withdrawal(((SavingsAccount) client2).getSavingsAccountBalance(), 2500);
        client2.interestRate();

        System.out.println(client2 +""+ '\n');






        Bank client3 =  new SpecialPromoSavings("Harry", "Sohal", "110",30000,"110SS",300,50);
        client3.interestRate();
        System.out.println(client3);
    }
}
