package NOV_24_DEMO.CarInheritance;

public class Honda extends Car {

    private long engineCapacity;

    public Honda(int year, long mileage, long price, long engineCapacity) {
        super(year, mileage, price);
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void acceleration() {
        super.acceleration();
        System.out.println("HONDA : (0 to 100) in 15 Seconds");
    }

    @Override
    public void breaking() {
        super.breaking();
        System.out.println("HONDA : (100 to 0) in 30 Seconds");
    }
    @Override
    public String toString() {
        return "Honda{" +
                "engineCapacity=" + engineCapacity +  ", year=" + super.getYear() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                '}';
    }


}
