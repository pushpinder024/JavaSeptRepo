package NOV_24_DEMO.BankInheritance;

public class TDBank___TypeCastingOfChildAndParent extends RBCBank{



    public int deposit(int depositAmount){
      int newBalance =   super.getBalance() + depositAmount;
        super.setBalance(newBalance);
        return super.getBalance();
    }
}
