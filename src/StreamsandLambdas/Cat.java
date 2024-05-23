package StreamsandLambdas;

public class Cat implements Animals{
    @Override
    public void walk() {
        System.out.println("Cat have small legs");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
