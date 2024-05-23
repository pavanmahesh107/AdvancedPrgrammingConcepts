package StreamsandLambdas;

public class Dog extends Animal{
    @Override
    public void makesSound() {
        System.out.println("Woof");
    }

    @Override
    public void walks() {
        System.out.println("Walks on four legs");
    }
}


