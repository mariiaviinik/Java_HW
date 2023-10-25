package hw22.factory;

public class Chair implements Furniture {

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
        System.out.println("Sit on the chair.");
    }

    @Override
    public void color(String color) {
        System.out.println("Color the chair in " + color + ".");
    }
}
