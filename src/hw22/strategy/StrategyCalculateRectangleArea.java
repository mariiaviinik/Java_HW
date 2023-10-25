package hw22.strategy;

public class StrategyCalculateRectangleArea implements ShapeArea {
    @Override
    public double getArea(int side1, int side2) {
        return side1 * side2 * 1.0;
    }
}
