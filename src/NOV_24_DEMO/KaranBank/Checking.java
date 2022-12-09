package NOV_24_DEMO.KaranBank;

public class Checking extends Bank{
    float interstaRate;

    public Checking(int accountNumber, float balance, float interstaRate) {
        super(accountNumber, balance);
        this.interstaRate = interstaRate;
    }

    @Override
    public String toString() {
        return "Checking{" +
                "interstaRate=" + interstaRate +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
            "}";
}
}
