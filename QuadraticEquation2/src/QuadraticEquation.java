public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = (b * b) - 4 * a * c;
    }

    public void display() {
        System.out.println(" Delta = " + getDiscriminant());
        if (delta < 0) {
            System.out.println(" Phuong trinh vo nghiem !");
        }else if (delta == 0) {
            System.out.println(" Phuong trinh co nghiem kep  x1 = x2 = " + -b / (2 * a));
        } else if (delta > 0) {
            System.out.println(" Phuong trinh co 2 nghiem phan biet: " + "\n" + " x1 = " + (-b + Math.sqrt(delta)) / (2 * a) + "\n" + " x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }

    }

}

