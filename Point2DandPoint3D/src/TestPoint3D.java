public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,1,1);
        System.out.println(point3D);
        point3D.setXYZ(4,5,6);
        System.out.println(point3D);
    }
}
