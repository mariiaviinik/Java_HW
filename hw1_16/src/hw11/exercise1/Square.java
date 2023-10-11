package hw11.exercise1;

public class Square implements GeometricFigures{
    private int side1;
    private int side2;
    public Square(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double areaOfFigure(){
        return (double) this.side1 * this.side2;
    }
}
