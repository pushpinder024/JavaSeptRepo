package DEC_03_DEMO.TimHortonsAssignment;

public class Donut implements TimConsumables {
    @Override
    public double getPrice() {

        return 1.50;
    }

    @Override
    public int getCalories() {

        return 180;
    }

    @Override
    public String getName() {

        return "Donut";
    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
