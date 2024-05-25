package ExampleOfFactoryPattern;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        System.out.println("Original radius of circle is "+circle.getRadius());

        Shape newShape = circle.create();
        Circle newCircle = (Circle) newShape;

        System.out.println("New Circle radius is "+newCircle.getRadius());
    }
}
