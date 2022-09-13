public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint( 1,2,1,1);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());
    }
}
