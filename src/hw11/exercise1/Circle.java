package hw11.exercise1;

public class Circle implements GeometricFigures{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double areaOfFigure(){
        return Math.PI * Math.pow(this.radius, 2) ;
    }
}
