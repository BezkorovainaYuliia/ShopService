package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @ParameterizedTest
    @CsvSource({"1, Katana, Weapon from Japan, 34.5, 1"})
    void id(int id, String name, String description, BigDecimal price, int expected) {
    Product product = new Product(id, name, description, price);
    assertEquals(expected, product.id());
    }

    @Test
    void nameProduct() {

    }

    @Test
    void description() {
    }

    @Test
    void price() {
    }
}