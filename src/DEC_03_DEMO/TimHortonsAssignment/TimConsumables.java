package DEC_03_DEMO.TimHortonsAssignment;

public interface TimConsumables extends TimSuperParent {
    @Override
    public double getPrice();

    @Override
    public String getName();

    @Override
    public String toString();

    public int getCalories();

}
