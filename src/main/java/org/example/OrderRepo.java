package org.example;

import java.util.List;

public interface OrderRepo {
    void addOrder(int id, Order newOrder);
    List<Order> getAll();
    void removeOrder(Order order);
}
