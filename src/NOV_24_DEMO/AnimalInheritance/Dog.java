package NOV_24_DEMO.AnimalInheritance;

import NOV_24_DEMO.AnimalInheritance.Animal;

public class Dog extends Animal {

    private String country;



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Dog(String name, int age, String country) {
        super(name, age);
        this.country =  country;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name=" +  super.getName() +
                ", age=" + super.getAge() +
                ", country=" + country +
                '}';

    }
}
