package NOV_26_DEMO.PolymorphismInheritanceDemo;

public class SpecialPromoSavingsAccount extends SavingsAccount{
private int specialBonusInDollars;
private int interestRate;

    public int getSpecialBonusInDollars(int i) {
        return specialBonusInDollars;
    }

    public void setSpecialBonusInDollars(int specialBonusInDollars) {
        this.specialBonusInDollars = specialBonusInDollars;
    }

    @Override
    public float interestRate(float savingsAccountBalance, float interestRate) {
        interestRate = ( (super.interestRate(savingsAccountBalance, interestRate)) + (specialBonusInDollars));
        return interestRate;
    }




    @Override
    public void description() {
        super.description();
        System.out.println("SAVINGS BALANCE AFTER SPECIAL OFFER  = " + interestRate);
    }
}
