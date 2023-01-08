package DEC_29_DEMO.AnonymousClassesAndFunctionalInterfaces;

public class CalculateInterfaceDriver {
    public static void main(String[] args) {


        CalculateInterface c1 =  (w, r) -> w+r;
                              //----------------\\    <------ This whole implementation can also be called as a FUNCTION.
        //                    \\----------------//    <------ This whole implementation can also be called as a FUNCTION.
        System.out.println(c1.addition(5, 5));


        calc((w, r) -> w+r);
        calc((w, r) -> w*r);


    }
    public static void calc(CalculateInterface o){
        System.out.println(o.addition(4,6));
    }
}
