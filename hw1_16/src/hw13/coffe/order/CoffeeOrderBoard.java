package hw13.coffe.order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeOrderBoard {
    private int previousNumber = 0;
    List<Order> orders = new ArrayList<>();

    void add(Order order) {
        order.setNumberOfOrder(++previousNumber);
        orders.add(order);
    }

    public Order deliver() {
        Order lastOrder = orders.get(orders.size() - 1);
        orders.remove(orders.size() - 1);
        return lastOrder;
    }

    public Order deliver(int numberOfOrder) {
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {

            Order currentOrder = iterator.next();
            int currentNumberOfOrder = currentOrder.getNumberOfOrder();

            if (currentNumberOfOrder == numberOfOrder) {
                orders.remove(currentOrder);
                return currentOrder;
            }
        }
        return null;
    }

    void draw() {
        System.out.println("№ | Name");
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {

            Order currentOrder = iterator.next();

            System.out.println(currentOrder.getNumberOfOrder() + " | " + currentOrder.getNameOfClient());
        }
    }
}
