package DEC_17_DEMO.CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Object> set = new LinkedHashSet<>();
        set.add(1);
        set.add(12);
        set.add(null);
        set.add(12);
        set.add(null);
        System.out.println(set);
    }
}
