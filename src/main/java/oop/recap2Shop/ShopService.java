package oop.recap2Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }
    public Order addItemToOrder(List<String> productIds){
        List<Product> orderProducts = new ArrayList<>();
        for (String productId : productIds){
            Product productToOrder = productRepo.getProductById(productId);
            if (productToOrder != null) {
                orderProducts.add(productToOrder);
            } else {
                System.out.println("Product with ID " + productId + " does not exist.");
            }
        }
        Order newOrder = new Order(UUID.randomUUID().toString(), orderProducts);
        return orderListRepo.addOrder(newOrder);
    }

}