package hw22.factory;

public class Shelf implements Furniture {
    @Override
    public void disassemble() {
        System.out.println("Disassemble a chair.");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble a shelf.");
    }

    @Override
    public void use() {
        System.out.println("Put the book on the shelf.");
    }

    @Override
    public void color(String color) {
        System.out.println("Color the shelf in " + color + ".");
    }
}
