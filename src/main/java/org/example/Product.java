package org.example;

import java.math.BigDecimal;

public record Product(int id, String nameProduct, int price) {
    public Product{
        if (id < 0) {throw new IllegalArgumentException("id ist zero");}
        if (nameProduct == null) { throw new IllegalArgumentException("name is null"); }
        if (price == 0) { throw new IllegalArgumentException("price is null"); }

    }

    @Override
    public String toString() {
        return "Product has " +
                "id: " + id +
                ". It's " + nameProduct +
                " It has a price " + price;
    }
}
