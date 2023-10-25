package hw22.factory;

public class FurnitureCreator {
    public Furniture getFurniture(String furnitureType) {
        if (furnitureType == null) {
            return null;
        }
        switch (furnitureType.toLowerCase()) {
            case "chair":
                return new Chair();
            case "shelf":
                return new Shelf();
            case "bed":
                return new Bed();
            default:
                return null;
        }
    }
}
