import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter color : ");
        String color = sc.nextLine();
        System.out.println(" Enter X : ");
        double side1 = sc.nextDouble();
        System.out.println(" Enter Y : ");
        double side2 = sc.nextDouble();
        System.out.println(" Enter Z : ");
        double side3 = sc.nextDouble();

        ClassTriangle classTriangle = new ClassTriangle(color, side1, side2, side3);
        System.out.println(classTriangle);
    }
}
