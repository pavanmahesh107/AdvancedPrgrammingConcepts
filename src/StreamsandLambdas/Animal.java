package StreamsandLambdas;

abstract class Animal {

    //For any Abstract class it can contain one or many abstract methods, as well as one or more general methods
    //the abstract methods are implemented in subclasses of the abstract class.
    public abstract void makesSound();

    public abstract void walks();

    public void sleep() {
        System.out.println("The animal is sleeping");
    }

    public void Brushes() {
        System.out.println("Animals don't brush");
    }
}
