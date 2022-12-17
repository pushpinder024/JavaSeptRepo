package DEC_03_DEMO.TimHortonsAssignment;

public class IceHockeyCards implements TimMerch {
    @Override
    public String getName() {
        return "NHL Cards";
    }

    @Override
    public double getPrice() {
        return 2;
    }

    @Override
    public String itemInfo() {
        return "Pocket size NHL league cards";
    }

    @Override
    public String toString() {
        return ("Item : " + getName() + "   | Price : " + getPrice() + "  | Info about product : "+ itemInfo());
    }
}
