package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class SavingsAccount extends BankAccount{
    private float savingsAccountBalance;
    private float finalSavingsAccountBalance;

    public float getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public void setSavingsAccountBalance(float savingsAccountBalance) {
        this.savingsAccountBalance = savingsAccountBalance;
    }

    @Override
    public float interestRate(float savingsAccountBalance, float interestRate) {
        super.interestRate(savingsAccountBalance, interestRate);
        finalSavingsAccountBalance = savingsAccountBalance+(interestRate/100);
        return finalSavingsAccountBalance;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("SPECIAL SAVINGS ACCOUNT BALANCE = " + finalSavingsAccountBalance);
    }
}
