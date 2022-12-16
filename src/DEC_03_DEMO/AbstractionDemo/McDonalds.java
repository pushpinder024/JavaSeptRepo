package DEC_03_DEMO.AbstractionDemo;

public class McDonalds extends Burger{
    @Override
    public void caloriesCounter() {
        System.out.println("One McDonalds burger has 450 calories");
    }

    @Override
    public void cookingTime() {
        System.out.println("Time required to cook a McDonalds burger is 7 minutes");
    }

    @Override
    public void burgerPrice() {
        System.out.println("The price of one burger is $7");
    }
}
