package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementiere die Klasse OrderListRepo mit einer Liste zur Speicherung von Bestellungen.
 * Implementiere Methoden zum Hinzufügen,
 * Entfernen und Abrufen von Bestellungen (einzelne Bestellung und alle Bestellungen).
 */

public class OrderListRepo implements OrderRepo{
    private List<Order> orders = new ArrayList<>();


    public void addOrder(int id, Order newOrder) {
        /// ?????? id
        orders.add(newOrder);
    }
    public List<Order> getAll() {
        return orders;
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }


}
