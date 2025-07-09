package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class OrderListRepoTest {
    @Test
    void addOrder() {
        OrderListRepo orderListRepo = new OrderListRepo();
        Product product = new Product(1, "Name 1", 3, 11);
        Product product2 = new Product(2, "Name 2", 2, 2);
        Product product3 = new Product(3, "Name 3", 3, 3);


        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        Order order = new Order(11, products,0);
        orderListRepo.addOrder(11, order);

        int expected = 1;
        assertEquals(expected,orderListRepo.getAll().size());
    }

    @Test
    void removeOrder() {
        OrderListRepo orderListRepo = new OrderListRepo();
        Product product = new Product(1, "Name 1", 3, 11);
        Product product2 = new Product(2, "Name 2", 2, 2);
        Product product3 = new Product(3, "Name 3", 3, 3);


        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        Order order = new Order(11, products,0);
        orderListRepo.addOrder(11, order);

        products = new ArrayList<>();
        products.add(product3);

        Order order1 = new Order(12, products,0);
        orderListRepo.addOrder(12, order1);


        products = new ArrayList<>();
        products.add(product);
        products.add(product2);

        Order order2 = new Order(13, products,0);
        orderListRepo.addOrder(13, order2);

        orderListRepo.removeOrder(order2);

        List<Order> listOrders = orderListRepo.getAll();
        boolean actual = listOrders.contains(order2);
        assertEquals(false,actual);
    }
  
}