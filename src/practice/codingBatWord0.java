package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class codingBatWord0 {
    public static void main(String[] args) {
        String[] array = {"p","a","s"};
        Map<String,Integer> m1 = new HashMap<>();

        Function< String[] , Map<String,Integer> > wfg = k ->
        {
            for (String w: k) {
                m1.put(w,0);

            }
            return m1;

        };
        wfg.apply(array);
        System.out.println(m1);

    }
}
