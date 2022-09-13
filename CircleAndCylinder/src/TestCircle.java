public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue",2.5);
        System.out.println(circle);

        circle.setColor("black");
        circle.setRadius(10.0);
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
