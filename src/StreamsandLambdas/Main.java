package StreamsandLambdas;

public class Main {
    public static void main(String[] args) {

//        Animal myDog = new Dog();
//        myDog.makesSound();
//        myDog.sleep();
//        myDog.walks();
//        myDog.Brushes();

        //Using the Lambda expression to implement the abstract the method
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Executing the functional Interface method");
        //Invoking the method implemented by the lambda expression
        myFunctionalInterface.execute();
    }
}
