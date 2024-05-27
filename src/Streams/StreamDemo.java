package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 7, 9, 5, 3, 13, 18, 15, 19, 14);

        //Write a method to extract only the Odd numbers from the List
        List<Integer> list1 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                list1.add(number);
            }
        }
        System.out.println(list1);

        //How can we do the above Operation using Streams?
        List<Integer> oddNumbers = numbers.stream().filter((x) -> x % 2 == 1).toList();
        System.out.println(oddNumbers);

        List<Integer> evennumbers = numbers.stream().filter((z) -> z*z == z).toList();
        System.out.println(evennumbers);

        //1.How is the Above Stream working?
        //2.List converted into Stream.
        //3.Stream will loop over the elements in the list.
        //4.Every element will be passed in the method.
        //5.Lambda function will be applied over each element.
        //6.If, lambda expression returns true. Each element will be added to the final stream, else it will reject.
        //7.Finally, we will convert the stream back to List.


    }
}
