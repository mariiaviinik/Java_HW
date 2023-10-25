package hw22.strategy;

public class StrategyCalculateTriangleArea implements ShapeArea {
    @Override
    public double getArea(int height, int base) {
        return height * base / 2.0;
    }
}
