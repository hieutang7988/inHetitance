public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D( 2,2);
        point2D.setXY(3,4);
        System.out.println(point2D);
    }
}
