package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ShopServiceTest {
    @Test
    void addProduct() {
        OrderListRepo orderListRepo = new OrderListRepo();

        ShopService shopService = new ShopService(orderListRepo);

        shopService.addProduct(new Product(1, "Name 1", 3, 34));

        Product actual = shopService.getProduct(1);
        Product expected = new Product(1, "Name 1", 3, 34);
        assertEquals(expected, actual);
    }

    @Test
    void getProductByName() {
        OrderListRepo orderListRepo = new OrderListRepo();
        ShopService shopService = new ShopService(orderListRepo);
        shopService.addProduct(new Product(1, "Name 1", 3, 34));
        shopService.addProduct(new Product(2, "Name 2", 3, 34));
        shopService.addProduct(new Product(3, "Name 3", 3, 34));
        Product actual = shopService.getProductByName("Name 2");
        Product expected = new Product(2, "Name 2", 3, 34);
        assertEquals(expected, actual);
    }

    @Test
    void getAll() {
        OrderListRepo orderListRepo = new OrderListRepo();
        ShopService shopService = new ShopService(orderListRepo);
        shopService.addProduct(new Product(1, "Name 1", 3, 34));
        shopService.addProduct(new Product(2, "Name 2", 3, 34));
        shopService.addProduct(new Product(3, "Name 3", 3, 34));

        List<Product> products = shopService.getProducts();
        int expected = 3;
        int actual = products.size();

        assertEquals(expected, actual);
    }
  
}