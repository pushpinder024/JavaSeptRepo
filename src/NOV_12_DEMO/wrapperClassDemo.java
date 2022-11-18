package NOV_12_DEMO;

public class wrapperClassDemo {
    public static void main(String[] args) {
        Integer q = 10000;
        String sw = "12432";
        int parsedInt = Integer.parseInt(sw);    // CONVERT STRING TO int
        System.out.println(parsedInt);

        Integer ww = Integer.valueOf(sw);        //CONVERT STRING TO Integer
        System.out.println(ww);


    }
}
