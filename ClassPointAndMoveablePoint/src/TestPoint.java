public class TestPoint {
    public static void main(String[] args) {
        Point point2D = new Point();
        System.out.println(point2D);

        point2D = new Point( 2,2);
        System.out.println(point2D);

        point2D.setXY(3,4);
        System.out.println(point2D);
    }
}
