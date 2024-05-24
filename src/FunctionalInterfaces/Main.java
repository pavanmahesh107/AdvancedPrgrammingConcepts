package FunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Consumer<String> consumer = element -> System.out.println(element);
//        List<String> names = Arrays.asList("Pavan", "Mahesh", "rupa", "uma");
//        names.forEach(element -> System.out.println(element));

//        BiConsumer<String, Integer> biConsumer = (Key,Value) -> System.out.println("Key " + Key+ " Value " + Value);
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Pavan", 18);
//        map.put("Mahesh", 1518);
//        map.put("Rupa", 15);
//        map.put("Uma", 1815);
//        map.forEach((Key,Value) -> System.out.println("Key " + Key + ", Value " + Value));
//
//        Predictae<Integer> predictae = number -> number % 2 == 0;
//        int isSample = 4;
//        boolean isSampleEven = predictae.Test(isSample);
//        System.out.println("Is the given integer even? "+isSampleEven);
//
//        BiPredicate<Integer, Integer> biConsumer = (a, b) -> a > 18 && b > 15;
//        int number1 = 15;
//        int number2 = 16;
//        boolean result1 = biConsumer.Test(number1, number2);
//        System.out.println("Are both numbers positive: " + result1);
//
//        int number3 = 20;
//        int number4 = 16;
//        boolean result2 = biConsumer.Test(number3, number4);
//        System.out.println("Are both numbers positive: " + result2);
//
//        Function<String,Integer> function = str -> str.length();
//        String SampleString = "Pavan Mahesh";
//        int length = function.test(SampleString);
//        System.out.println("The length of the String is: "+length);

         BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;
         int number1 = 15;
         int number2 = 18;
         int result = biFunction.Test(number1,number2);
        System.out.println("The addition of A and B is: "+result);

    }
}
