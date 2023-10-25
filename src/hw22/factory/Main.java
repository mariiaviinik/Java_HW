package hw22.factory;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator factory = new FurnitureCreator();

        Furniture chair = factory.getFurniture("Chair");
        chair.use();

        Furniture shelf = factory.getFurniture("Shelf");
        shelf.use();

        Furniture bed = factory.getFurniture("Bed");
        bed.use();
    }
}
