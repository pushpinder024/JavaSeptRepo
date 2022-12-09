package NOV_24_DEMO.AnimalInheritance;

public class PuppyDog extends Dog {
     private String breed;




    public PuppyDog(String name, int age, String country, String breed){

        super(name,age,country);
        this.breed = breed;
    }


    @Override
    public String toString() {
        return "PuppyDog{name= " +  super.getName() + ", age=" + super.getAge() + ", country=" + super.getCountry() + "breed='" + breed +  +
                '}';
    }
}
