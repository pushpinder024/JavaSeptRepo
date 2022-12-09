package NOV_24_DEMO.BankInheritance;

public class Bank {
    private String firstName;
    private String lastName;
    private int  customerID;
    private int balance;

    public Bank() {
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Bank(String firstName, String lastName, int customerID, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerID=" + customerID +
                ", balance=" + balance +
                '}';
    }
}
