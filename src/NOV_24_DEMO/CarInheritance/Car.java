package NOV_24_DEMO.CarInheritance;



public class Car {
    private int year;
    private long mileage;
    private long price;


    public Car(int year, long mileage, long price) {
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }


    public void acceleration() {
        System.out.println("THE CAR ACCELERATED");
    }

    public void breaking() {
        System.out.println("THE CAR IS BREAKING");
    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
