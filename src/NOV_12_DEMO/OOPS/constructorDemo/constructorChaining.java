package NOV_12_DEMO.OOPS.constructorDemo;

public class constructorChaining {
    String name;
    int id;
    double grade;

    public constructorChaining() {                                          //CONSTRUCTOR 1
        System.out.println(1);
    }


    public constructorChaining(String name) {                                          //CONSTRUCTOR 2
        this();  // CALL MADE TO CONSTRUCTOR 1

        System.out.println(2);
        this.name = name;
    }


    public constructorChaining(String name, int id) {                                          //CONSTRUCTOR 3
        this(name);   // CALL MADE TO CONSTRUCTOR 2
        System.out.println(3);
        this.id = id;
    }


    public constructorChaining(String name, int id, double grade) {                                          //CONSTRUCTOR 4
        this(name,id);   // CALL MADE TO CONSTRCUTOR 3
        System.out.println(4);
        this.grade = grade;
    }
}
