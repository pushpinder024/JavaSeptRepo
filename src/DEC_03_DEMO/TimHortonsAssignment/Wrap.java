package DEC_03_DEMO.TimHortonsAssignment;

public class Wrap implements TimConsumables {
    @Override
    public double getPrice() {

        return 5.30;
    }

    @Override
    public int getCalories() {

        return 400;
    }

    @Override
    public String getName() {

        return "Chicken Wrap";
    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
