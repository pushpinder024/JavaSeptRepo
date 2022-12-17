package DEC_03_DEMO.TimHortonsAssignment;

public class Bagel implements TimConsumables {


    @Override
    public double getPrice() {

        return 1.99;
    }

    @Override
    public int getCalories() {

        return 250;
    }

    @Override
    public String getName() {

        return "Everything Bagel";
    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
