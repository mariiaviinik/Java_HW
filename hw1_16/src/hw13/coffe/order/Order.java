package hw13.coffe.order;

public class Order {
    private int numberOfOrder;
    private String nameOfClient;

    public Order(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }
}
