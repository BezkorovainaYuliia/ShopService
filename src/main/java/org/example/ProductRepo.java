package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;


    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

     public void addProducts(List<Product> products) {
        this.products.addAll(products);
     }

     public void removeProduct(Product product) {
        products.remove(product);
     }
     public void removeProducts(List<Product> products) {
        this.products.removeAll(products);
     }

     public Product findProductById(int id) {
        Product findedProduct = null;
        for (Product product : products) {
            if (product.id() == id){
                findedProduct = product;
            }
        }
        return findedProduct;
     }

    public Product findProductByName(String nameProduct) {
        for (Product product : products) {
            if (product.nameProduct().equals(nameProduct)){
                return product;
            }
        }
        return null;
    }

     public List<Product> getProducts() {
        return products;
     }

    @Override
    public String toString() {
        return "ProductRepo has " +
                "products " + products;
    }
}