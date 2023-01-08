package JAN_05_DEMO.StreamsAPI;

import java.util.stream.Stream;

public class StreamsAPI {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.generate(() -> 1);
        integerStream.forEach(i -> addidtionm(i));
    }

    public static void addidtionm(Integer i) {
        System.out.println(i + 22);
    }
}
