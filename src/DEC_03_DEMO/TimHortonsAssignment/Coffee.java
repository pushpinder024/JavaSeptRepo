package DEC_03_DEMO.TimHortonsAssignment;

public class Coffee implements TimConsumables {
    @Override
    public double getPrice() {

        return 3.25;
    }

    @Override
    public int getCalories() {

        return 100;
    }

    @Override
    public String getName() {

        return "Regular Coffee";
    }

    @Override
    public String toString() {

        return ("Item : " + getName() + "   | Price : " + getPrice() + "   | Calories : " + getCalories());
    }
}
