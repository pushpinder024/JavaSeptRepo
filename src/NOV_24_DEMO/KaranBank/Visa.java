package NOV_24_DEMO.KaranBank;

public class Visa extends Bank{
    float limit;

    public Visa(int accountNumber, float balance, float limt) {
        super(accountNumber, balance);
        this.limit = limt;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "limt=" + limit +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
            "}";
}
}
