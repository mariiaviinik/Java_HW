package hw19;

import java.util.List;

public class Dictionary {
    String category;
    List<Product> products;

    public Dictionary(String category, List<Product> products) {
        this.category = category;
        this.products = products;
    }

    @Override
    public String toString() {
        return "{" + category + ":" + products + "}";
    }
}
