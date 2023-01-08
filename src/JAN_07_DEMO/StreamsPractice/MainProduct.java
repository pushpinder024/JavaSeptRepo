package JAN_07_DEMO.StreamsPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProduct {
    public static void main(String[] args) {
        List<ProductBlueprint> list = new ArrayList<>();
        list.add(new ProductBlueprint("Hard Drive",120,40,"Electronics"));
        list.add(new ProductBlueprint("Mouse",60,23,"Electronics"));
        list.add(new ProductBlueprint("Mechanical Keyboard",80,34,"Electronics"));
        list.add(new ProductBlueprint("IPhone",1200,45,"Devices"));
        list.add(new ProductBlueprint("Hard Drive",120,40,"Electronics"));


        List<ProductBlueprint> collect = list.stream().filter(s -> s.getPrice() < 300).sorted(Comparator.comparingInt(q -> q.getQuantity())).collect(Collectors.toList());
        List<String> stringList = collect.stream().distinct().map(w -> w.getName() + "=" + w.getPrice()+2).collect(Collectors.toList());
        System.out.println(stringList);




    }
}
