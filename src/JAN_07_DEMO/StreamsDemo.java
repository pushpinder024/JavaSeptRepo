package JAN_07_DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,4,4546,56,56,56,6,5,565,65434,3,4);
        double reduce = list.stream().filter(d -> d % 2 == 0).mapToDouble(a -> a).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Optional<Integer> first = list.stream().filter(d -> d % 2 == 0).findFirst();
        System.out.println(first);
    }
}
