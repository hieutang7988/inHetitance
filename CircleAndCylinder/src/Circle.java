public class Circle {
    String color;
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPiremeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getColor()
                + " , "
                + getRadius()
                + "\n"
                + getArea();
    }
}
