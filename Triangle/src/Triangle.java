public class Triangle extends Shape{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color ,boolean filled,double side1, double side2, double side3) {
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public double getP () {
      return getPerimeter()/2;
    }

    public double getArea() {
        return Math.sqrt(getP()*(getP() -this.side1)*(getP() - this.side2)*(getP() - this.side3));
    }

    @Override
    public String toString() {
        return "A Triangle with side = "
                + getSide1()
                + ","
                + getSide2()
                + ","
                + getSide3()
                + " A Triangle with Piremeter ="
                + getPerimeter()
                + " A Triangle with Area ="
                + getArea()
                + " , which is a subclass of "
                + super.toString();
    }
}
