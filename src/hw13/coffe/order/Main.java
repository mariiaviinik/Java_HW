package hw13.coffe.order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Tony");
        Order order2 = new Order("Mariia");
        Order order3 = new Order("James");
        Order order4 = new Order("Kit");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);
        coffeeOrderBoard.add(order4);

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(2);

        coffeeOrderBoard.draw();
    }
}
