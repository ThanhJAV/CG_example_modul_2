public class ClassTriangle extends Shape {
    private double side1 = 0.0f;
    private double side2 = 0.0f;
    private double side3 = 0.0f;

    public ClassTriangle() {
    }

    public ClassTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public ClassTriangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public ClassTriangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        return 2 * ((Math.sqrt(getPerimeter() * ( getPerimeter() - side1 ) * ( getPerimeter() - side2) * getPerimeter() - side3))/side1);
    }

    @Override
    public String toString() {
        return " X = " + getSide1() + "\n" + " Y = " + getSide2() + "\n" + getSide3() +
                "\n" + " Color = " + getColor() + "\n" +
                " Triangle has perimeter is " + getPerimeter() + "\n" +
                " Triangle has area is " + getArea() + "\n";

    }
}
