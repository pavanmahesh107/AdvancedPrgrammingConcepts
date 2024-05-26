package ExampleOfFactoryPattern;

public class Square extends Shapes{
    private int Side;

    public Square(int Side){
        this.Side = Side;
    }
    @Override
    Shapes create() {
        return new Square(15);
    }

    public int getSide(){
        return Side;
    }

}
