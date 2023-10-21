package hw19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private static int productAmount = 0;
    private int id;
    private double price;
    private String type;
    private boolean discount;
    private double discountPrice;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private LocalDateTime dateOfCreation = LocalDateTime.now();

    public Product(Double price, String type, boolean discount) {
        this.id = productAmount;
        this.price = price;
        this.type = type;
        this.discount = discount;
        if (discount) useDiscount();
        productAmount++;
    }

    public void useDiscount() {
        if (discount) this.discountPrice = (Math.round((price - price * 0.1) * 100.0) / 100.0);
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public double getPrice() {
        if (discount) return discountPrice;
        return price;
    }

    @Override
    public String toString() {
        double currentPrice = discount ? discountPrice : price;
        return currentPrice + ", " + type + ", " + dateFormat.format(dateOfCreation);
    }
}
