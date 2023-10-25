package hw22.factory;

public class Bed implements Furniture {
    @Override
    public void disassemble() {
        System.out.println("Disassemble a chair.");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble a chair.");
    }

    @Override
    public void use() {
        System.out.println("Lay in the bed.");
    }

    @Override
    public void color(String color) {
        System.out.println("Color the bed in " + color + ".");
    }
}
