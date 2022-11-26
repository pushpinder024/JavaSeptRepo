package NOV_12_DEMO;

import java.util.Arrays;
import java.util.Collections;

public class sort3WordsDescendingOrder {
    public static void main(String[] args) {
//        String a = "Pushpinder";
//        String b = "Nikhil";
//        String c = "Naman";
//        System.out.println("The correct order is - ");
//
//
//        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {             //WHEN (A) IS AT THE TOP
//            System.out.println(a);
//
//            if (b.compareTo(c) > 0) {
//                System.out.println(b);
//                System.out.println(c);
//            } else {
//                System.out.println(c);
//                System.out.println(b);
//            }
//
//        }
//
//
//        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {             //WHEN (B) IS AT THE TOP
//            System.out.println(b);
//
//            if (a.compareTo(c) > 0) {
//                System.out.println(a);
//                System.out.println(c);
//            } else {
//                System.out.println(c);
//                System.out.println(a);
//            }
//
//        }
//
//
//        if (c.compareTo(b) > 0 && c.compareTo(a) > 0) {             //WHEN (C) IS AT THE TOP
//            System.out.println(c);
//
//            if (b.compareTo(a) > 0) {
//                System.out.println(b);
//                System.out.println(a);
//            } else {
//                System.out.println(a);
//                System.out.println(b);
//            }
//
//        }


        String[] array1 = {"B", "C", "A", "E", "D"};
        String tmp;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[i].compareTo(array1[j]) > 0) {
                    tmp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tmp;


                }
            }

        }
        System.out.println(Arrays.toString(array1));
    }
}