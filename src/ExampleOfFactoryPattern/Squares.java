package ExampleOfFactoryPattern;

public class Squares extends Shape1{
    private int Side;

    public Squares(int Side){
        this.Side = Side;
    }
    @Override
    Shape1 create() {
        return new Squares(18);
    }

    public int getSide() {
        return Side;
    }
}
