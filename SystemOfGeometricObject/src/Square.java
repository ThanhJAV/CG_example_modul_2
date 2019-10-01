public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSize() {
        return side;
    }

    public void setSize(double size) {
        this.side = size;
    }
}
