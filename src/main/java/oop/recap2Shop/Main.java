package oop.recap2Shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        OrderListRepo orderListRepo = new OrderListRepo();
        ShopService shopService = new ShopService(productRepo, orderListRepo);

        // add products to productRepository
        Product product1 = new Product("1", "Soap");
        Product product2 = new Product("2", "water");
        productRepo.addProduct(product1);
        productRepo.addProduct(product2); // Ich dachte so würden die prod. zum repo hinzugefügt,

        productRepo.getProductToConsole();

        List<Product> allProducts = productRepo.getProducts();




        //place a new order
        List<String> productIdsForOrder = new ArrayList<>();
        productIdsForOrder.add("1");
        productIdsForOrder.add("2");




        Order newOrder = shopService.addItemToOrder(productIdsForOrder);
        orderListRepo.addOrder(newOrder);

        List<Order> firstOrd = orderListRepo.getOrders();


        System.out.println(firstOrd);

    }



}