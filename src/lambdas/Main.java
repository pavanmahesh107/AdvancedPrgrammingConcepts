package lambdas;

import FunctionalInterfaces.BiConsumer;
import FunctionalInterfaces.Consumer;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        //SampleInterface sampleInterface = new SampleInterface();

        //Way-1
        SampleClass sampleClass = new SampleClass();
        sampleClass.fun();

        //Way 2 Anonymous class
        SampleInterface sampleInterface = new SampleInterface() {
            @Override
            public void fun() {

                System.out.println("Anonymous class for creating the object to the interface");
            }
        };
        sampleInterface.fun();

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void Test(String string, Integer integer) {
                System.out.println("String " + string + " integer " + integer);
            }
        };
        biConsumer.Test("Scaler", 1);

        //Lambda Expression simple implementation
        Consumer<String> consumer = (Str) -> {
            System.out.println("Consumer lambda implementation by: "+Str);
        };
        consumer.Test("Pavan Mahesh");

        BinaryOperator<Integer> binaryOperator =(x,y) -> {
            return  x+y;
        };
        System.out.println(binaryOperator.apply(10,15));
    }
}
