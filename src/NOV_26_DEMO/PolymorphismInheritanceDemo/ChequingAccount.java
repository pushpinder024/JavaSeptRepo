package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class ChequingAccount extends Bank{
    private long chequingAccountBalance;
    private String ChequingAccoutNumber;

    public long getChequingAccountBalance() {
        return chequingAccountBalance;
    }

    public void setChequingAccountBalance(long chequingAccountBalance) {
        this.chequingAccountBalance = chequingAccountBalance;
    }

    public String getChequingAccoutNumber() {
        return ChequingAccoutNumber;
    }

    public void setChequingAccoutNumber(String chequingAccoutNumber) {
        ChequingAccoutNumber = chequingAccoutNumber;
    }

    public ChequingAccount(String firstName, String lastName, String bankAccountNumber, long chequingAccountBalance, String chequingAccoutNumber) {
        super(firstName, lastName, bankAccountNumber);
        this.chequingAccountBalance = chequingAccountBalance;
        ChequingAccoutNumber = chequingAccoutNumber;
    }


    @Override
    public long deposit(long mainBalance, long depositAmount) {
         mainBalance = chequingAccountBalance + depositAmount;
         setChequingAccountBalance(mainBalance);
         return getChequingAccountBalance();
    }

    @Override
    public long withdrawal(long mainBalance, long withdrawalAmount) {
        mainBalance = chequingAccountBalance -withdrawalAmount;
        setChequingAccountBalance(mainBalance);
        return getChequingAccountBalance();
    }


    @Override
    public String toString() {
        return "ChequingAccount{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bankAccountNumber='" + getBankAccountNumber() + '\'' +
                "chequingAccountBalance=" + chequingAccountBalance +
                ", ChequingAccoutNumber='" + ChequingAccoutNumber + '\'' +
                '}';
    }
}
