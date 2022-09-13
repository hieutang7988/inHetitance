public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder("red",2.0, 5.0);
        System.out.println(cylinder);

        cylinder.setColor("blue");
        cylinder.setRadius(3);
        cylinder.setHeight(7);
        System.out.println(cylinder);
    }
}
