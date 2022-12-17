package DEC_03_DEMO.TimHortonsAssignment;

public interface TimMerch extends TimSuperParent {
    @Override
    public String getName();

    @Override
    public double getPrice();

    @Override
    public String toString();

    public String itemInfo();

}
