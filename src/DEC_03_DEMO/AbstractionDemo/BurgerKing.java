package DEC_03_DEMO.AbstractionDemo;

public class BurgerKing extends Burger{
    @Override
    public void caloriesCounter() {
        System.out.println("One Burger King's burger has 400 calories");
    }

    @Override
    public void cookingTime() {
        System.out.println("Time required to cook a Burger King burger is 10 minutes");
    }

    @Override
    public void burgerPrice() {
        System.out.println("The price of one burger is $5");
    }
}
