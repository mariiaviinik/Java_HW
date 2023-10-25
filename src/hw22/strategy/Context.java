package hw22.strategy;

public class Context {
    private ShapeArea strategy;

    void setStrategy(ShapeArea strategy) {
        this.strategy = strategy;
    }

    double getArea(int a, int b) {
        return strategy.getArea(a, b);
    }
}
