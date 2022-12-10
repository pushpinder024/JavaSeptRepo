package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class SpecialPromoSavings extends SavingsAccount {
    private long specialInterestRate;
    public SpecialPromoSavings(String firstName, String lastName, String bankAccountNumber, long savingsAccountBalance, String savingsAccountNumber, long interestAmount, long specialInterestRate) {
        super(firstName, lastName, bankAccountNumber, savingsAccountBalance, savingsAccountNumber, interestAmount);
        this.specialInterestRate =  specialInterestRate;
    }

    @Override
    public long interestRate() {
       setSavingsAccountBalance(getSavingsAccountBalance() + getInterestAmount()+ specialInterestRate);
       return getSavingsAccountBalance();
    }

    @Override
    public String toString() {
        return "SpecialPromoSavings{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bankAccountNumber='" + getBankAccountNumber() + '\'' +
                "SavingsAccountBalance=" + getSavingsAccountBalance() +
                ", SavingsAccountNumber='" + getSavingsAccountNumber() + '\'' +
                "specialInterestRate=" + specialInterestRate +
                '}';
    }
}
