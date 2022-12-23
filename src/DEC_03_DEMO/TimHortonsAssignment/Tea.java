package DEC_03_DEMO.TimHortonsAssignment;

public class Tea implements TimConsumables {

    @Override
    public double getPrice() {

        return 3.00;
    }

    @Override
    public int getCalories() {

        return 100;
    }

    @Override
    public String getName() {

        return "Orange Pekoe Tea";

    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
