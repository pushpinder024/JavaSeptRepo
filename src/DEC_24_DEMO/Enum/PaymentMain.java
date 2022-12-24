package DEC_24_DEMO.Enum;

import NOV_24_DEMO.KaranBank.Main;

public class PaymentMain {
    private String name;
    private String CreditCardNumber;
    private PaymentRequirements paymentMethod;
    private String postalCode;
    private String cvv;
    private String expiryDate;

    public PaymentMain(String name, String creditCardNumber, PaymentRequirements paymentMethod, String postalCode, String cvv, String expiryDate) {
        this.name = name;
        CreditCardNumber = creditCardNumber;
        this.paymentMethod = paymentMethod;
        this.postalCode = postalCode;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PaymentMain{" +
                "name='" + name + '\'' +
                ", CreditCardNumber='" + CreditCardNumber + '\'' +
                ", paymentMethod=" + paymentMethod +
                ", postalCode='" + postalCode + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PaymentMain payment1 =  new PaymentMain("Pushpinder","4357339738681010", PaymentRequirements.VISA,"M9L2B6","786","01/23");
        System.out.println(payment1);
    }
}
