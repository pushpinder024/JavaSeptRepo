package JAN_05_DEMO.StreamsAPI.StreamsYoutubeDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args) {
        List<Billionaires> bList = new ArrayList<>();
        bList.add(new Billionaires("Elon Musk", 200));
        bList.add(new Billionaires("Jeff Bezos", 180));
        bList.add(new Billionaires("Bill Gates", 120));
        bList.add(new Billionaires("Mark Zuckerberg", 80));
        bList.add(new Billionaires("Elon Musk", 200));


        List<Billionaires> above100Billions = bList.stream().filter(q -> q.getBillions() > 100).distinct().collect(Collectors.toList());
        System.out.println(above100Billions);

        List<Integer> moneyList = bList.stream().filter(q -> q.getBillions() > 100).map(w -> w.getBillions()).distinct().collect(Collectors.toList());
        System.out.println(moneyList);

        above100Billions.forEach(a -> System.out.println(a.getName()));

        List<Billionaires> sortedList = bList.stream().sorted(Comparator.comparing(p -> p.getName())).distinct().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
