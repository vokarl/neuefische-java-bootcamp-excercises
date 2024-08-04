package oop.recap2Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private Map<String, Order> orders = new HashMap<>();


    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(String id) {
        return orders.get(id);
    }

    @Override
    public Order addOrder(Order newOrder) {
        orders.put(newOrder.id(), newOrder); //tricky - put gibt alte bestellung zurück daher neues return nötig
        return newOrder;
    }

    @Override
    public void removeOrderById(String id) {
        orders.remove(id);
    }
}


/*Nur als alternative zum orderlistrepo*/