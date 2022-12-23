package DEC_17_DEMO.CollectionsFramework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(15);
//        list.add(20);
//        list.add(3, 25);
//        System.out.println(list);
//        list.add(4, 30);
//        System.out.println(list);

//        list.remove(0);
//        System.out.println(list.remove(new Object(20)));
//        System.out.println(list);

//        list.clear();
//        System.out.println(list);
//
//
//        List<Integer> list1 =  new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(25);
//
//        list.removeAll(list1);
//        System.out.println(list);





        /* *************************************************************************************************************** */
        /*            ITERATING THROUGH A LIST        */

//        for(int i =0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//
//        for(Integer element : list){
//            System.out.println(element);
//        }


        List<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(4);
        aList.add(10);
        aList.add(15);
        aList.add(null);
        aList.add(3);
        aList.add(6);
        System.out.println(aList);

//        for (int j = 0; j < aList.size(); j++) {
//            if (aList.get(j) % 2 == 0) {
//                aList.remove(j);
//            }
//        }
//
////        for(Integer element : aList){
////            if(element%2==0){
////                aList.remove(element);
////            }
////        }
//        Iterator<Integer> it = aList.iterator();
//
//
//        while (it.hasNext()) {
//            if (it.next() % 2 == 0) {
//                it.remove();
//            }
//
//
//        }
        System.out.println(aList);

    }
}
