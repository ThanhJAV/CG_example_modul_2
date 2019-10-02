import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(5 , 7);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
