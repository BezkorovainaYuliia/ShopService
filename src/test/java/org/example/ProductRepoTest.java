package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ProductRepoTest {

    @Test
    void findById() {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Name 1", 2, 12));
        productRepo.addProduct(new Product(2, "Name 2", 2, 12));
        productRepo.addProduct(new Product(3, "Name 3", 3, 13));
        productRepo.addProduct(new Product(4, "Name 4", 4, 14));
        productRepo.addProduct(new Product(5, "Name 5", 5, 15));

        Product actual = productRepo.findProductById(4);
        Product expected = new Product(4, "Name 4", 4, 14);
        assertEquals(expected, actual);
    }
    @Test
    void findByIdIfNull() {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Name 1", 2, 12));
        productRepo.addProduct(new Product(2, "Name 2", 2, 12));
        productRepo.addProduct(new Product(3, "Name 3", 3, 13));
        productRepo.addProduct(new Product(4, "Name 4", 4, 14));
        productRepo.addProduct(new Product(5, "Name 5", 5, 15));

        assertNull(productRepo.findProductById(7));
    }

    @Test
    void removeProduct() {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Name 1", 2, 12));
        productRepo.addProduct(new Product(2, "Name 2", 2, 12));
        productRepo.addProduct(new Product(3, "Name 3", 3, 13));
        productRepo.addProduct(new Product(4, "Name 4", 4, 14));
        productRepo.addProduct(new Product(5, "Name 5", 5, 15));

        productRepo.removeProduct(new Product(3, "Name 3", 3, 13));
        assertNull(productRepo.findProductById(3));
    }


    @Test
    void removeAllProduct() {
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product(1, "Name 1", 2, 12));
        productRepo.addProduct(new Product(2, "Name 2", 2, 12));
        productRepo.addProduct(new Product(3, "Name 3", 3, 13));
        productRepo.addProduct(new Product(4, "Name 4", 4, 14));
        productRepo.addProduct(new Product(5, "Name 5", 5, 15));

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product(1, "Name 1", 2, 12));
        listProducts.add(new Product(2, "Name 2", 2, 12));

        productRepo.removeProducts(listProducts);
        assertNull(productRepo.findProductById(1));
        assertNull(productRepo.findProductById(2));
    }
  
}