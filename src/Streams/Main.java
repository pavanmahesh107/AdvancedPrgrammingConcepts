package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1,9,6,7,3,8,5);

        Stream<Integer> stream = numbers.stream();

        Stream<Integer> stream1 = Stream.of(1,9,6,7,3,8,5);

        //Builder way of creating a stream
        Stream.Builder<Integer> sb =  Stream.builder();
        sb.add(1);
        sb.add(3);
        sb.add(5);
        sb.build();
    }
}
