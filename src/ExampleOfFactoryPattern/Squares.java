package ExampleOfFactoryPattern;

public class Squares extends Shape1{
    private int Side;

    public Squares(int Side){
        this.Side = Side;
    }
    @Override
    Shape1 create() {
        return new Squares(18); // Returning a new Square object with a default side length
    }

    public int getSide() {
        return Side;
    }
}
