package DEC_22_DEMO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> HMap = new HashMap<>();
        HMap.put("Pushpinder", 108);
        HMap.put("Naman", 105);
        HMap.put("Tarun", 113);
        HMap.put("Gurvinder", 121);
        HMap.put("Lovish", 124);

        //WILL ONLY ADD IF THE KEY IS NOT ALREADY PRESENT IN THE HASHMAP
        HMap.putIfAbsent("Naman", 109);
        HMap.putIfAbsent("Abhishek", 112);
        System.out.println(HMap);


        Map<String, Integer> HMap2 = new HashMap<>();
        HMap2.put("Jaskaran", 131);


        //ADD ONE HASHMAP TO ANOTHER HASHMAP
        HMap.putAll(HMap2);
        System.out.println(HMap);

        //WILL RETURN THE DEFAULT VALUE WE HAVE PASSSED IF THE KEY IS NOT PRESENT IN THE MAP
        System.out.println(HMap.getOrDefault("Naman", 9));
        System.out.println(HMap.getOrDefault("Naman", 89));


        //RETURNS A SET  OF MAP
        Set<Map.Entry<String, Integer>> HMapSet = HMap.entrySet() ;

        //FOR EACH LOOP
        for (Map.Entry<String, Integer> e : HMapSet) {
            System.out.println(e.getKey() + " : " + e.getValue());
            
        }




        //ITERATOR IN HASHMAP
        //CONVERTING THE MAP INTO THE ITERATOR TYPE OBJECT
        Iterator<Map.Entry<String,Integer>> it = HMapSet.iterator();
        while(it.hasNext()){
            it.remove();
        }
        System.out.println(HMap);


    }
}
