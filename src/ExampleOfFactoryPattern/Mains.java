package ExampleOfFactoryPattern;

public class Mains {
    public static <circles> void main(String[] args) {

        Circles circles = new Circles(5.0);
        System.out.println("Original circle radius is: " + circles.getRadius());

        Shape1 shape1 = circles.create();
        Circles newCircles = (Circles) shape1; // Casting to Circle
        System.out.println("The new Circle radius is: " + newCircles.getRadius());

        Squares squares =new Squares(15);
        System.out.println("Original side of a square is: "+squares.getSide());

        Shape1 shape11 = squares.create();
        Squares newSquares = (Squares) shape11; // Casting to Square 
        System.out.println("The new side of a Square is: "+newSquares.getSide());


    }
}
