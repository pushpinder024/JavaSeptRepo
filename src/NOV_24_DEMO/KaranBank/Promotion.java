package NOV_24_DEMO.KaranBank;


public class Promotion extends Savings{
    String promotions;

    public Promotion(int accountNumber, float balance, float interstaRate, String promotions) {
        super(accountNumber, balance, interstaRate);
        this.promotions = promotions;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotions=" + promotions +
                ", interstaRate=" + interstaRate +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
           "}";
}
}
