package JAN_07_DEMO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInClassAssignment {
    public static void main(String[] args) {

        //1
        List<String> list1 = Arrays.asList("Broadway","Amsterdam","Brooklyn","Manhattan","Toronto","Brampton","Mississauga","Berlin");

        List<String> BList = list1.stream().filter(b -> b.charAt(0) == 'B').map(z -> z.toUpperCase()).collect(Collectors.toList());
        System.out.println(BList);


        List<Integer> list2 = Arrays.asList(5,1,2,3,4,40,5,6,7,8,9,10);
//2A
        List<Integer> squared = list2.stream().map(q -> q * q).collect(Collectors.toList());
        System.out.println(squared);
//2B
        List<Integer> trippled = list2.stream().map(o -> o * o * o).sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(trippled);


        //4

        List<String> list3 = Arrays.asList("India","Canada","India","England","USA");

        List<String> countryList = list3.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println(countryList);

        System.out.println(list3.stream().distinct().limit(3).noneMatch(w -> w.length() > 7));



    }
}
