package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Programming: OrderMapRepo
 *
 *
 * In the main method, create either the OrderMapRepo or the
 * OrderListRepo and pass it to the constructor of ShopService (as a constructor parameter that uses the interface).
 */
public class OrderMapRepo implements OrderRepo{
    private Map<Integer, Order> orderMap = new HashMap<>();

    @Override
    public void addOrder(int id, Order newOrder) {
       orderMap.put(Integer.valueOf(id), newOrder);
    }

    @Override
    public List<Order> getAll() {
        return new ArrayList<>(orderMap.values());
    }


    @Override
    public void removeOrder(Order order) {
        Integer keyToRemove = null;

        for (Map.Entry<Integer, Order> entry : orderMap.entrySet()) {
            if (entry.getValue().equals(order)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            orderMap.remove(keyToRemove);
        }
    }
}
