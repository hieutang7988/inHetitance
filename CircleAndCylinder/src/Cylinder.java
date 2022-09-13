public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(String color, double radius , double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.pow(this.radius,2)*Math.PI*this.height;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getColor()
                + " , "
                + getRadius()
                + "\n"
                + getArea()
                + super.toString()
                + "\n"
                + getVolume();


    }

}
