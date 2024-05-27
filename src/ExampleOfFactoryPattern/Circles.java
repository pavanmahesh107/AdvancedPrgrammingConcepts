package ExampleOfFactoryPattern;

public class Circles extends Shape1 {
    private double radius;

    public Circles(double radius){
        this.radius = radius;
    }
    @Override
    Shape1 create() {
        return new Circles(8.0); // Returning a new Circle object with a default radius
    }

    public double getRadius() {
        return radius;
    }
}
