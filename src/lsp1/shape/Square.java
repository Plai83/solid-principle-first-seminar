package lsp1.shape;

public class Square extends Quadrilateral {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }
}
