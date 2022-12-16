package DEC_03_DEMO.AbstractionDemo;

public class MainDriver {
    public static void main(String[] args) {
        BurgerKing burger1 = new BurgerKing();
        burger1.burgerPrice();
        burger1.caloriesCounter();
        burger1.cookingTime();
        System.out.println();
        System.out.println("*******************************************");
        System.out.println();
        McDonalds burger2 = new McDonalds();
        burger2.burgerPrice();
        burger2.caloriesCounter();
        burger2.cookingTime();
    }
}
