package DEC_03_DEMO.TimHortonsAssignment;

public class CoffeeMug implements TimMerch{
    @Override
    public String getName() {
        return "Coffe Mug";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String itemInfo() {
        return "Tim Red Coffee Mug";
    }

    @Override
    public String toString(){
        return ("Item : " + getName() + "   | Price : " + getPrice() + "  | Info about product : "+ itemInfo());
    }
}
