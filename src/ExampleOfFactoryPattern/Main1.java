package ExampleOfFactoryPattern;

public class Main1 {
    public static void main(String[] args) {

        Square square = new Square(18);
        System.out.println("Original side is: "+square.getSide());

        Shapes shapes = square.create();
        Square newsquare = (Square) shapes;
        System.out.println("New Square side is "+newsquare.getSide());
    }
}
