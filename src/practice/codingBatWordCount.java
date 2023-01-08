package practice;

import java.util.HashMap;
import java.util.Map;

public class codingBatWordCount {
    public static void main(String[] args) {
        Map<String,Integer> map =  new HashMap();
        Integer counter = 0;
        String [] strings = {"a", "b", "a", "c", "b"};

        for(int i = 0; i<strings.length; i++){
            for(int j =0; j<strings.length; j++){
                if(strings[i].equals(strings[j])){
                    counter ++;

                }
            }
            map.putIfAbsent(strings[i],counter);
            counter =0;
            System.out.println(map);
        }
    }
}
