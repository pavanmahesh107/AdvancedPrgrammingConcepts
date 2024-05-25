package ExampleOfFactoryPattern;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public Shape create() {
        return new Circle(1.0);
    }

    public double getRadius() {
        return radius;
    }
}
