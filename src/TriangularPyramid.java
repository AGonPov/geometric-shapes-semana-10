public class TriangularPyramid {
    //Attributes:
    private EquilateralTriangle equilateralTriangle;
    private double height;

    //Constructor:
    public TriangularPyramid(EquilateralTriangle equilateralTriangle, double height) {
        this.equilateralTriangle = equilateralTriangle;
        this.height = height;
    }

    public TriangularPyramid(double side, double height) {
        this.equilateralTriangle = new EquilateralTriangle(side);
        this.height = height;
    }

    //Functions:
    public double getVolume() {
        return (1.0 / 3.0) * this.equilateralTriangle.getArea() * this.height;
    }

    public double getHeight() {
        return this.height;
    }
}

