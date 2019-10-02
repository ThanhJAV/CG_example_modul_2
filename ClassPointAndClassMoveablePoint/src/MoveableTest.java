public class MoveableTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,5,10,10);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
