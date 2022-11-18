package NOV_12_DEMO;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class methodsInString {
    public static void main(String[] args) {
        String a = "pushpinder        ";
        String b = "mohit";

        String x = "Pushpinder";
        String y = new String("Pushpinder");
        System.out.println(x==y);
        System.out.println(x.equals(y));


        System.out.println(a.compareTo(b));    //compare to method


        System.out.println(a.intern());    // intern method


        System.out.println(a.concat(b));     // concat method

        System.out.println(Arrays.toString(a.split("p")));      // split method from a specific String character


        System.out.println(a.trim());    // trim extra spaces from the beginning anf the end


//        System.out.println(a.replace('p','r'));   //replace the specified character with another supplied char


        System.out.println(a.replace("pu","si"));    //replace multiple characters with multiple characters


        System.out.println(a.indexOf("p",1));    //indexOfMethod
        System.out.println(a.lastIndexOf("p"));

    }
}
