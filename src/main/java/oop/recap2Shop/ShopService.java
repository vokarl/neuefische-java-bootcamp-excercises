package oop.recap2Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    /*tricky-- parameter = liste Product ids- neue product list,
    aus product Ids (Bestellentscheidung), für jedes einzelne produkt
     -> in variable pr.ToOrder das gesamte Product aus dem Product repo holen und speichern
     -> jedes gefundene product der orderProducts liste hinzufügen}
     -> instanz einer Order erstellen und EINE id verg. orderProducts liste hinzufügen
      newOrder zu orderList repo hinzufügen */

    public Order addItemToOrder(List<String> productIds){
        List<Product> orderProducts = new ArrayList<>();
        for (String productId : productIds){
            Product productToOrder = productRepo.getProductById(productId);
            orderProducts.add(productToOrder);
        }
        Order newOrder = new Order(UUID.randomUUID().toString(), orderProducts);
        return orderListRepo.addOrder(newOrder);
    }

}