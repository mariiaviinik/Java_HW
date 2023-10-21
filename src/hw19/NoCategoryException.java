package hw19;

public class NoCategoryException extends Exception {
    public NoCategoryException(String category) {
        super("No product in category " + category + " was found");
    }
}
