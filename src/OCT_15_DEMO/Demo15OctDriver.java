package OCT_15_DEMO;

import OCT_15_DEMO.Demo15Oct;

import java.util.Date;

public class Demo15OctDriver {
    public static void main(String[] ars) {
        Date date = new Date();
        System.out.println(date);

        int a = 10;
        int b = 20;
        System.out.println(a + b);


        System.out.println(Demo15Oct.subtract(20, 10));
        System.out.println(Demo15Oct.sum(20, 10));
        System.out.println(Demo15Oct.multiply(20, 10));
        System.out.println(Demo15Oct.divide(13132121, 1123123));
    }
}
