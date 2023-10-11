package hw11.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2, 3, 4);
        Square square = new Square(2, 2);

        List<GeometricFigures> geometricFigures = new ArrayList<GeometricFigures>(Arrays.asList(circle, triangle, square));
        System.out.println("General area: " + generalAreaOfAllFigures(geometricFigures));
    }

    public static double generalAreaOfAllFigures(List<GeometricFigures> geometricFigures) {
        Iterator<GeometricFigures> iterator = geometricFigures.iterator();
        double generalArea = 0.0;
        while (iterator.hasNext()) {
            generalArea += iterator.next().areaOfFigure();
        }
        return generalArea;
    }
}
