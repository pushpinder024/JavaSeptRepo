package DEC_03_DEMO.TimHortonsAssignment;

public class DiyCoffee implements TimMerch {
    @Override
    public String getName() {
        return "Coffee Powder";
    }

    @Override
    public double getPrice() {
        return 17;
    }

    @Override
    public String itemInfo() {
        return "Make At Home Coffee Powder";
    }

    @Override
    public String toString(){
        return ("Item : " + getName() + "   | Price : " + getPrice() + "  | Info about product : "+ itemInfo());
    }
}
