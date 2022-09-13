public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        triangle = new Triangle("red" ,true,5.0,4.0,5.0);
        System.out.println(triangle);
    }

}
