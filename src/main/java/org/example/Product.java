package org.example;


public record Product(int id, String nameProduct, int quantity, int price) {
    public Product{
        if (id < 0) {throw new IllegalArgumentException("id ist zero");}
        if (nameProduct == null) { throw new IllegalArgumentException("name is null"); }
        if (price == 0) { throw new IllegalArgumentException("price is null"); }
        if (quantity < 0) {throw new IllegalArgumentException("quantity is zero");}
    }

    public Product withQuantity(int quantity){
        return new Product(id, nameProduct, quantity, price);
    }

    public Product withPrice(int price){
        return new Product(id, nameProduct, quantity, price);
    }

    @Override
    public String toString() {
        return "Product has " +
                "id: " + id +
                ". It's " + nameProduct +
                ". Quantity: " + quantity +
                " It has a price " + price;
    }
}
