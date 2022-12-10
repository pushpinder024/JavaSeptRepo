package NOV_24_DEMO.CarInheritance;

public class Tesla extends Car {
    private long batteryCapacity;


    public Tesla(int year, long mileage, long price, long batteryCapacity) {
        super(year, mileage, price);
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("TESLA : (0 to 100) in 7 Seconds");
    }

    @Override
    public void breaking() {
        super.breaking();
        System.out.println("TESLA : (100 to 0) in 14 Seconds");
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "batteryCapacity=" + batteryCapacity +
                ", year=" + super.getYear() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                '}';
    }
}
