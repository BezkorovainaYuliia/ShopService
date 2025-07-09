package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo{
    private List<Order> orders = new ArrayList<>();


    public void addOrder(int id, Order newOrder) {
        orders.add(newOrder);
    }
    public List<Order> getAll() {
        return orders;
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }


}
