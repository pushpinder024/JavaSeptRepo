package DEC_22_DEMO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingInHashmap {
    public static void main(String[] args) {

        Map<String ,Integer> map =  new HashMap<>();

        map.put("Pushpinder", 108);
        map.put("Naman", 105);
        map.put("Tarun", 113);
        map.put("Gurvinder", 121);
        map.put("Lovish", 124);

        /*                                            STEPS FOR ITERATION IN A HASHMAP                                 */



         //STEP 1 ------    CREATE A SET OF MAP USING THE    entrySet() METHOD ON THE MAP WHICH RETURNS THE SET TYPE VIEW OF THE KEYS AND VALUES PRESENT IN A MAP
        Set<Map.Entry<String,Integer>> set = map.entrySet();



        //STEP 2A ----------   USING FOR EACH LOOP TO ITERATE USING THE ENTRY WE CREATED IN STEP 1

//        for(Map.Entry<String,Integer> loopSet : set){
//            System.out.println(loopSet.getKey() + " : " + loopSet.getValue());
//
//        }


        //STEP 2B     ----------- USING THE ITERATOR TO ITERATE USING THE ENTRY WE CREATED IN STEP 1

        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()){                                            //ITERATOR HAS 2 METHODS hasNext() AND next()
            //System.out.println(it.next());
            Map.Entry<String, Integer> next = it.next();
            System.out.println(next.getKey() + " : " + next.getValue());


        }
        //iterator() METHOD RETURNS THE ITERATOR OBJECT WHICH HELPS TO ITERATE THROUGH EACH AND EVERY ELEMENT OF THE MAP OR COLLECTION


        //WE CANNOT USE FOR EACH OR THE ITERATOR DIRECTLY ON A MAP..... WE HAVE TO MAKE A SET TYPE VIEW OF THE MAP FOR BEING ABLE TO USE ITERATOR OR FOR EACH LOOP


    }
}
