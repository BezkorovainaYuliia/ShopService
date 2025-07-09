package org.example;

import java.util.List;

public record Order(int id, List<Product> products, int total){

    public Order{
        if (products == null){ throw new NullPointerException("products is null"); }
        if (products.isEmpty()){ throw new IllegalArgumentException("products is empty"); }
        total = 0;
        for (Product product : products){
            total += product.price() * product.quantity();
        }
    }

    public Order addProduct(int id, Product product){
        products.add(product);
        return new Order(id, products,  total);
    }

    public Order removeProduct(Product product){
        products.remove(product);
        return new Order(id, products,  total);
    }

    @Override
    public String toString() {
        return "Order: " + id +
                " products: " + products +
                " total: " + total;
    }
}
