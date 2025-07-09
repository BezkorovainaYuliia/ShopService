package org.example;


import java.util.Map;

public record Order(int id, Map<Product, Integer> products) {
    public Order{
        if (products == null){ throw new NullPointerException("products is null"); }
    }

    public Order addProduct(int id, Product product,  int quantity){
        products.put(product, quantity);
        return new Order(id, products);
    }

    public Order removeProduct(Product product){
        products.remove(product);
        return new Order(id, products);
    }

    public Order changeProductsQuantity(Product product, int quantity){
        products.put(product, quantity);
        return new Order(id, products);
    }

    @Override
    public String toString() {
        return "Order: " + id +
                " products: " + products;
    }
}
