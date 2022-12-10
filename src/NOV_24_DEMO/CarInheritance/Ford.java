package NOV_24_DEMO.CarInheritance;

public class Ford  extends Car {
    private long engineCapacity;

    public Ford(int year, long mileage, long price, long engineCapacity) {
        super(year, mileage, price);
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("FORD : (0 to 100) in 10 Seconds");
    }

    @Override
    public void breaking() {
        super.breaking();
        System.out.println("FORD : (100 to 0) in 20 Seconds");
    }

    @Override
    public String toString() {
        return "Ford{" +
                "engineCapacity=" + engineCapacity +  ", year=" + super.getYear() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                '}';
    }
}
