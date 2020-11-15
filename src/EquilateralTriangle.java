import java.lang.Math;

public class EquilateralTriangle {
    //Attributes:
    private double side;

    //Constructor:
    public EquilateralTriangle(double side) {
        this.side = side;
    }

    //Functions:
    public double getSide() {
        return this.side;
    }

    public double getArea() {
        double area;
        area = ((Math.sqrt(3) / 4) * Math.pow(this.side, 2));
        return side;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = this.side * 3;
        return perimeter;
    }

}
