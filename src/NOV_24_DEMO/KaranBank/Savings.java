package NOV_24_DEMO.KaranBank;

public class Savings extends Bank {

    float interstaRate;

    public Savings(int accountNumber, float balance, float interstaRate) {
        super(accountNumber, balance);
        this.interstaRate = interstaRate;
    }

    @Override
    public String toString() {
        return "Savings{" +
                "interstaRate=" + interstaRate +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
            "}";
}
}
