package hw11.exercise1;

public class Triangle implements GeometricFigures {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double areaOfFigure() {
        double semiperimeter = (double) (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - this.side1) * (semiperimeter - this.side2) * (semiperimeter - this.side3));
        return area;
    }
}
