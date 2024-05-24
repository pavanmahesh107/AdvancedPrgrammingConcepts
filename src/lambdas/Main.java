package lambdas;

import FunctionalInterfaces.BiConsumer;

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

        BiConsumer<String,Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void Test(String string, Integer integer) {
                System.out.println("String " +string+ " integer " +integer);
            }
        };
        biConsumer.Test("Scaler",1);
    }
}
