

public class Circle {
    //Attributes:
    private double radius;

    //Constructor:
    public Circle(double radius) {
        this.radius = radius;
    }

    //Functions:
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double area;
        area = (Math.PI * Math.pow(this.radius, 2));
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (Math.PI * this.radius);
        return perimeter;
    }
}
