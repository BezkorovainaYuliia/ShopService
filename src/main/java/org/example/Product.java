package org.example;

import java.math.BigDecimal;

public record Product(int id, String nameProduct, String description, BigDecimal price) {
    public Product{
        if (id < 0) {throw new IllegalArgumentException("id ist zero");}
        if (nameProduct == null) { throw new IllegalArgumentException("name is null"); }
        if (description == null) { throw new IllegalArgumentException("description is null"); }
        if (price == null) { throw new IllegalArgumentException("price is null"); }
        if (price.compareTo(new BigDecimal("0")) < 0) { throw new IllegalArgumentException("price is less than zero"); }
    }


}
