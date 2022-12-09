package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class BankAccount {
    private String accountNumber;
    private String customerFirstName;
    private String customerLastName;


    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }



    public float interestRate(float a, float b){
        return 0.0F;
    }
    public float withdrawal(float a, float b){
        return 0.0F;
    }
    public float deposit(float a, float b){
        return 0.0F;
    }


    public void description() {
        System.out.println( "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                '}');
    }
}
