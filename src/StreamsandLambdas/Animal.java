package StreamsandLambdas;
abstract class Animal {

    //For any Abstract class it can contain one or many abstract methods,
    //the abstract methods are implemented in subclasses of the abstract class.
    public abstract void makesSound();

    public abstract void walks();

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
