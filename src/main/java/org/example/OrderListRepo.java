package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementiere die Klasse OrderListRepo mit einer Liste zur Speicherung von Bestellungen.
 * Implementiere Methoden zum Hinzufügen,
 * Entfernen und Abrufen von Bestellungen (einzelne Bestellung und alle Bestellungen).
 */

public class OrderListRepo {
    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order newOrder) {
        orders.add(newOrder);
    }
    public void addOrders(List<Order> newOrders) {
        orders.addAll(newOrders);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.id() == id) {
                return order;
            }
        }
        return null;
    }

    public void removeOrderById(int id) {
        for (Order order : orders) {
            if (order.id() == id) {
                orders.remove(order);
            }
        }
    }


    public void removeProductFromOrder(Order order, Product product) {

        for (Order order1 : orders) {
            if (order1.equals(order)) {
                order1.products().remove(product);
            }
        }
    }

    public void removeOrders(Order order) {
        orders.remove(order);
    }
}
