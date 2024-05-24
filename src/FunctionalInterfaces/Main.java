package FunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Consumer<String> consumer = element -> System.out.println(element);
//
//        List<String> names = Arrays.asList("Pavan", "Mahesh", "rupa", "uma");
//
//        names.forEach(element -> System.out.println(element));
//
//        BiConsumer<String, Integer> biConsumer = (Key,Value) -> System.out.println("Key " + Key+ " Value " + Value);
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Pavan", 18);
//        map.put("Mahesh", 1518);
//        map.put("Rupa", 15);
//        map.put("Uma", 1815);
//
//        map.forEach((Key,Value) -> System.out.println("Key " + Key + ", Value " + Value));

        Predictae<Integer> predictae = number -> number % 2 == 0;
        int isSample = 4;
        boolean isSampleEven = predictae.Test(isSample);
        System.out.println("Is the given integer even? "+isSampleEven);

    }
}
