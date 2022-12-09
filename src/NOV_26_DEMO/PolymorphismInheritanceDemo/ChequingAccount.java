package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class ChequingAccount extends BankAccount {
    private float chequingAccountBalance;
    private float withdrawalAmount;
    private float depositAmount;
    private float finalChequingAfterTransactions;

    public float getChequingAccountBalance() {
        return chequingAccountBalance;
    }

    public void setChequingAccountBalance(float chequingAccountBalance) {
        this.chequingAccountBalance = chequingAccountBalance;
    }

    public float getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(float withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Override
    public float withdrawal(float chequingAccountBalance, float withdrawalAmount) {

        if (chequingAccountBalance < withdrawalAmount) {
            System.out.println("Not sufficient Balance. Chequing account balance remains unchanged");

        } else {
            chequingAccountBalance = chequingAccountBalance - withdrawalAmount;
            finalChequingAfterTransactions = chequingAccountBalance;
        }
        return finalChequingAfterTransactions;


    }

    @Override
    public float deposit(float chequingAccountBalance, float depositAmount) {
        finalChequingAfterTransactions = chequingAccountBalance + depositAmount;
        return finalChequingAfterTransactions;
    }

    @Override
    public void description() {
         super.description();
        System.out.println("Chequing Account Balance = " + finalChequingAfterTransactions);

    }
}

