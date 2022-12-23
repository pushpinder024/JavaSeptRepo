package DEC_17_DEMO.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map =  new HashMap<>();
        map.put(1,"John");
        map.put(2,"Tom");
        map.put(3,"Sam");
        map.put(4,"Jordan");
        map.put(2,"Gucci");
        map.put(5,"John");
        System.out.println(map);

    }
}
