package NOV_24_DEMO.BankInheritance;

public class RBCBank extends Bank {
    private int RBCSpecialCustomerID;

    public int getRBCSpecialCustomerID() {
        return RBCSpecialCustomerID;
    }

    public void setRBCSpecialCustomerID(int RBCSpecialCustomerID) {
        this.RBCSpecialCustomerID = RBCSpecialCustomerID;
    }

    public RBCBank(String firstName, String lastName, int customerID, int balance, int RBCSpecialCustomerID) {
        super(firstName, lastName, customerID, balance);

    }

    public int withDrawal(int withdrawalAmount) {
        if (withdrawalAmount > super.getBalance()) {
            System.out.println("Transaction Unsuccessful");
        } else {
            int newBalance = super.getBalance() - withdrawalAmount;
             super.setBalance(newBalance);
        }
        return super.getBalance();
    }
    public int deposit(int depositAmount){
        int newBalance =   super.getBalance() + depositAmount;
        super.setBalance(newBalance);
        return super.getBalance();
    }


    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", customerID=" + super.getCustomerID() +
                ", balance=" + super.getBalance() +
                ", RBCSpecialCustomerID=" + RBCSpecialCustomerID+
                '}';
    }

    public RBCBank(){

    }
}
