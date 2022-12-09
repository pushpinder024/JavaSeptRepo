package NOV_24_DEMO.KaranBank;

public class CreditScore extends Visa{
    int score1;

    public CreditScore(int accountNumber, float balance, float limit, int score) {
        super(accountNumber, balance, limit);
        this.score1 = score;
    }


    @Override
    public String toString() {
        return "CreditScore{" +
                "score=" + score1 +
                ", limit=" + limit +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
            "}";
}
}
