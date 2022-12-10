package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class Bank {
    private String firstName;
    private String lastName;
    private String bankAccountNumber;

    public Bank(String firstName, String lastName, String bankAccountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    public long deposit(long mainBalance, long depositAmount) {
        return 0;
    }

    public long withdrawal(long mainBalance, long withdrawalAmount) {
        return 0;
    }

    public long interestRate() {
        return 0;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}
