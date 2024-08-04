package oop.recap2Shop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void getOrders() {
        //GIVEN
        //WHEN
        //THEN
    }

    @Test
    void getOrderById() {
        //GIVEN
        //WHEN
        //THEN
    }

    @Test
    void addOrder() {
    //GIVEN
        OrderListRepo repo = new OrderListRepo();
        Product product = new Product("1", "Apfel");
        Order newOrder = new Order("1", List.of(product));
    //WHEN
        Order actual = repo.addOrder(newOrder);
    //THEN
        Product product1 = new Product ("1", "Apfel");
        Order expected = new Order("1", List.of(product1));
        assertEquals(actual, expected);
        assertEquals(repo.getOrderById("1"), expected);

    }

    @Test
    void removeOrder() {
        //GIVEN
        //WHEN
        //THEN
    }
}