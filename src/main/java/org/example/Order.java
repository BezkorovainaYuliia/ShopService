package org.example;


import java.util.List;

public record Order(int id, List<Product> products){

    public Order{
        if (products == null){ throw new NullPointerException("products is null"); }
    }

    public Order addProduct(int id, Product product){
        products.add(product);
        return new Order(id, products);
    }

    public Order removeProduct(Product product){
        products.remove(product);
        return new Order(id, products);
    }

    @Override
    public String toString() {
        return "Order: " + id +
                " products: " + products;
    }
}
