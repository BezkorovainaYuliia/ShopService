package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopService {
    private OrderRepo orderRepo;
    private ProductRepo productRepo = new ProductRepo();

    public static void main(String[] args) {
        //Products
        Product product1 = new Product(1, "Phone", 123);
        Product product2 = new Product(2, "Pen", 43);
        Product product3 = new Product(3, "Tablet", 199);
        Product product4 = new Product(4, "Smart-Watch", 99);
        Product product5 = new Product(5, "Hear phone", 19);
        Product product6 = new Product(6, "Mp3_player", 34);

        //Orders
        Order order1 = new Order(10, new ArrayList<>(Arrays.asList(product1, product2, product4)));
        Order order2 = new Order(11, new ArrayList<>(Arrays.asList(product6, product6, product5)));
        Order order3 = new Order(12, new ArrayList<>(Arrays.asList(product3, product1, product4)));
        Order order4 = new Order(13, new ArrayList<>(Arrays.asList(product1, product2, product5)));
        Order order5 = new Order(14, new ArrayList<>(Arrays.asList(product1, product3, product5)));

        //OrderRepo
        System.out.println(">-------------------------------------------------<");
        System.out.println("ORDER LIST REPO");
        System.out.println(">-------------------------------------------------<");
        OrderRepo orderListRepo = new OrderListRepo();
        orderListRepo.addOrder(10, order1);
        orderListRepo.addOrder(11, order2);
        orderListRepo.addOrder(12, order3);
        orderListRepo.addOrder(13, order4);
        orderListRepo.addOrder(14, order5);


       ShopService shopService = new ShopService(orderListRepo);
       shopService.addProduct(product1);
       shopService.addProduct(product2);
       shopService.addProduct(product3);
       shopService.addProduct(product4);
       shopService.addProduct(product5);
       shopService.addProduct(product6);
        System.out.println(">-------------------------------------------------<");
        System.out.println("I want find a Product by ID 3");
        System.out.println(shopService.getProduct(3));
        System.out.println("I want find a Product by Name");
        System.out.println(shopService.getProductByName("Hear phone"));
        System.out.println(">-------------------------------------------------<");
        System.out.println("What i can bay?");
        for (Product product : shopService.getProducts()) {
        System.out.println(product);
        }
        System.out.println(">-------------------------------------------------<");
        System.out.println("What did I order");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }

        shopService.addOrder(16, order1);
        shopService.addOrder(17, order2);
        shopService.addOrder(18, order3);

        System.out.println("What did I order II");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }

        List<Order>  newOrderList = shopService.getOrders();
        newOrderList.remove(order1); //Order N10
        newOrderList.remove(order2); //Order N11
        System.out.println(">-------------------------------------------------<");
        System.out.println("Without order1 and order2");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }
        System.out.println(">-------------------------------------------------<");

        System.out.println("ORDER MAP REPO");
        System.out.println(">-------------------------------------------------<");
        OrderMapRepo orderMapRepo = new OrderMapRepo();
        orderMapRepo.addOrder(16, order1);
        orderMapRepo.addOrder(17, order2);
        orderMapRepo.addOrder(18, order3);
        orderMapRepo.addOrder(19, order4);
        orderMapRepo.addOrder(20, order5);

        shopService = new ShopService(orderMapRepo);
        shopService.addProduct(product1);
        shopService.addProduct(product2);
        shopService.addProduct(product3);
        shopService.addProduct(product4);
        shopService.addProduct(product5);
        shopService.addProduct(product6);
        System.out.println(">-------------------------------------------------<");
        System.out.println("I want find a Product by ID 3");
        System.out.println(shopService.getProduct(3));
        System.out.println("I want find a Product by Name");
        System.out.println(shopService.getProductByName("Hear phone"));
        System.out.println(">-------------------------------------------------<");
        System.out.println("What i can bay?");
        for (Product product : shopService.getProducts()) {
            System.out.println(product);
        }
        System.out.println(">-------------------------------------------------<");
        System.out.println("What did I order");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }

        shopService.addOrder(16, order1);
        shopService.addOrder(17, order2);
        shopService.addOrder(18, order3);
        System.out.println(">-------------------------------------------------<");
        System.out.println("What did I order II");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }

        List<Order>  newOrderList2 = shopService.getOrders();
        newOrderList.remove(order1); //Order N10
        newOrderList.remove(order2); //Order N11
        System.out.println(">-------------------------------------------------<");
        System.out.println("Without order1 and order2");
        for (Order order : shopService.getOrders()) {
            System.out.println(order);
        }
    }


    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = new ProductRepo();
    }

    public void createOrder(int id, Order order){
        orderRepo.addOrder(id, order);
        if (orderRepo.getAll().isEmpty()){
            System.out.println("No orders found. KAPUT");
        }
    }

    public void addProduct(Product product){
        productRepo.addProduct(product);
    }
    public Product getProduct(int id){
        return productRepo.findProductById(id);
    }

    public Product getProductByName(String productName){
        return productRepo.findProductByName(productName);
    }

    public List<Product> getProducts(){
        return productRepo.getProducts();
    }

    public void addOrder(int id,Order order){
        orderRepo.addOrder(id, order);
    }

    public List<Order> getOrders(){
        return orderRepo.getAll();
    }
}
