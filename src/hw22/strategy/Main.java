package hw22.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        int a = 36;
        int b = 4;
        String figure = "triangle";

        if (figure == "rectangle") context.setStrategy(new StrategyCalculateRectangleArea());

        if (figure == "triangle") context.setStrategy(new StrategyCalculateTriangleArea());

        double result = context.getArea(a, b);

        System.out.println(result);
    }
}
