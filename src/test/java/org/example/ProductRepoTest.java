package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProductRepoTest {

    @Test
    void findById() {
        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product(4, "LuiViton", "Bag from new colection", new BigDecimal(223.45));
        Product product2 = new Product(5, "Apple MacBook", "Laptop", new BigDecimal(565.89));
        Product product3 = new Product(6, "Oskar", "Golden Figure", new BigDecimal(16.45));
        products.add(product1);
        products.add(product2);
        products.add(product3);
        productRepo.addProducts(products);
        Product actual = productRepo.findProductById(5);
        Product expected = new Product(5, "Apple MacBook", "Laptop", new BigDecimal(565.89));
        assertEquals(expected, actual);
    }

    @Test
    void addProducts() {
        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product(1, "Katana", "Weapon from Japan", new BigDecimal(23.45));
        Product product2 = new Product(2, "Tifani", "Jewels", new BigDecimal(345.67));
        Product product3 = new Product(3, "Bikini", "Victoria Secret BH", new BigDecimal(76.45));

        products.add(product1);
        products.add(product2);
        products.add(product3);
        productRepo = new ProductRepo();
        product1 = new Product(4, "LuiViton", "Bag from new colection", new BigDecimal(223.45));
        product2 = new Product(5, "Apple MacBook", "Laptop", new BigDecimal(565.89));
        product3 = new Product(6, "Oskar", "Golden Figure", new BigDecimal(16.45));
        products.add(product1);
        products.add(product2);
        products.add(product3);

        productRepo.addProducts(products);

        int expected = 6;
        int actual = productRepo.getProducts().size();

        assertEquals(expected, actual);
    }

    @Test
    void removeProducts() {
        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product(1, "Katana", "Weapon from Japan", new BigDecimal(23.45));
        Product product2 = new Product(2, "Tifani", "Jewels", new BigDecimal(345.67));
        Product product3 = new Product(3, "Bikini", "Victoria Secret BH", new BigDecimal(76.45));

        products.add(product1);
        products.add(product2);
        products.add(product3);
        productRepo = new ProductRepo();
        product1 = new Product(4, "LuiViton", "Bag from new colection", new BigDecimal(223.45));
        product2 = new Product(5, "Apple MacBook", "Laptop", new BigDecimal(565.89));
        product3 = new Product(6, "Oskar", "Golden Figure", new BigDecimal(16.45));
        products.add(product1);
        products.add(product2);
        products.add(product3);
        productRepo.addProducts(products);

        productRepo.removeProducts(products);
        int actual = productRepo.getProducts().size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void addProduct_IsTrue() {
        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product(1, "Katana", "Weapon from Japan", new BigDecimal(23.45));
        Product product2 = new Product(2, "Tifani", "Jewels", new BigDecimal(345.67));
        Product product3 = new Product(3, "Bikini", "Victoria Secret BH", new BigDecimal(76.45));

        products.add(product1);
        products.add(product2);
        products.add(product3);
        productRepo = new ProductRepo();
        productRepo.addProducts(products);
        product1 = new Product(4, "LuiViton", "Bag from new colection", new BigDecimal(223.45));
        productRepo.addProduct(product1);
        Product actual = productRepo.findProductById(4);
        assertEquals(product1, actual);
    }


}