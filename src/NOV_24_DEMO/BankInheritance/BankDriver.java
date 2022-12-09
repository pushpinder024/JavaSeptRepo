package NOV_24_DEMO.BankInheritance;

public class BankDriver {
    public static void main(String[] args) {
        RBCBank bank1 = new RBCBank("Pushpinder", "Singh", 108, 20000, 679);
        bank1.setRBCSpecialCustomerID(679);
        System.out.println(bank1.withDrawal(2000));
        System.out.println(bank1.withDrawal(5000));
        System.out.println(bank1);




        RBCBank bank2 =  new RBCBank();
        bank2.setFirstName("Harry");
        bank2.setLastName("Sohal");
        bank2.setRBCSpecialCustomerID(6969);
        bank2.setCustomerID(105);
        bank2.setBalance(35000);
        System.out.println(bank2.withDrawal(3000));
        System.out.println(bank2);




        Bank bank3 =  new TDBank___TypeCastingOfChildAndParent();
        bank3.setFirstName("Naman");
        bank3.setLastName("Kumar");
        ((TDBank___TypeCastingOfChildAndParent)bank3).setRBCSpecialCustomerID(9090);       // TYPE CASTING  ----- USED TO ACCESS THE METHODS IN CHILD CLASS , EVEN IF WE CREATED THE OBJECT OF PARENT CLASS TYPE
        bank3.setCustomerID(121);
        bank3.setBalance(50000);
        System.out.println(((TDBank___TypeCastingOfChildAndParent)bank3).deposit(2000));       // TYPE CASTING  ----- USED TO ACCESS THE METHODS IN CHILD CLASS , EVEN IF WE CREATED THE OBJECT OF PARENT CLASS TYPE
        System.out.println(((TDBank___TypeCastingOfChildAndParent)bank3).deposit(2000));       // TYPE CASTING  ----- USED TO ACCESS THE METHODS IN CHILD CLASS , EVEN IF WE CREATED THE OBJECT OF PARENT CLASS TYPE


    }

}
