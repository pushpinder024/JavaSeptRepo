package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class SavingsAccount extends Bank {
    private long savingsAccountBalance;
    private String savingsAccountNumber;
    private long interestAmount;


    public SavingsAccount(String firstName, String lastName, String bankAccountNumber, long savingsAccountBalance, String savingsAccountNumber, long interestAmount) {
        super(firstName, lastName, bankAccountNumber);
        this.savingsAccountBalance = savingsAccountBalance;
        this.savingsAccountNumber = savingsAccountNumber;
        this.interestAmount = interestAmount;
    }

    public long getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(long interestAmount) {
        this.interestAmount = interestAmount;
    }

    public long getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public void setSavingsAccountBalance(long savingsAccountBalance) {
        this.savingsAccountBalance = savingsAccountBalance;
    }

    public String getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public void setSavingsAccountNumber(String savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    @Override
    public long deposit(long mainBalance, long depositAmount) {
        mainBalance = savingsAccountBalance + depositAmount;
        setSavingsAccountBalance(mainBalance);
        return getSavingsAccountBalance();
    }

    @Override
    public long withdrawal(long mainBalance, long withdrawalAmount) {
        mainBalance = savingsAccountBalance - withdrawalAmount;
        setSavingsAccountBalance(mainBalance);
        return getSavingsAccountBalance();
    }

    @Override
    public long interestRate() {
        this.savingsAccountBalance =  this.savingsAccountBalance + this.interestAmount;
        setSavingsAccountBalance(this.savingsAccountBalance);
        return getSavingsAccountBalance();
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bankAccountNumber='" + getBankAccountNumber() + '\'' +
                "SavingsAccountBalance=" + getSavingsAccountBalance() +
                ", SavingsAccountNumber='" + getSavingsAccountNumber() + '\'' +
                '}';
    }
}
