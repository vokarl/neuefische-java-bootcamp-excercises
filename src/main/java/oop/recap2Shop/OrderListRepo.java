package oop.recap2Shop;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {


   private List<Order> orders = new ArrayList<>();

   public List<Order> getOrders(){
       return orders;
   }
   public Order getOrderById(String id){
       for (Order order : orders){
           if (order.id().equals(id)){
               return order;
           }
       }
       return null;
   }
    public Order addOrder (Order newOrder){
       orders.add(newOrder);
       return newOrder;
}
    public void removeOrder(String id){
       for (Order order : orders){
           if(order.id().equals(id)){
               orders.remove(order);
               return;
           }
       }
    }



}

