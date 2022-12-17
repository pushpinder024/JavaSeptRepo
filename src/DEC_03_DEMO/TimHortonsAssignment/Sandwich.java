package DEC_03_DEMO.TimHortonsAssignment;

public class Sandwich implements TimConsumables {

    @Override
    public double getPrice() {

        return 8.00;
    }

    @Override
    public int getCalories() {

        return 670;
    }

    @Override
    public String getName() {

        return "Sandwich";
    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
