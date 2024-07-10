package oop.recap2;
import java.util.ArrayList;
import java.util.List;


public class ProductRepo {

    public static void main(String[] args){
        Product product1 = new Product (11233, "shampoo", 3.32, 32);
        Product product2 = new Product (2332, "toothbrush", 1.23, 42);
        Product product3 = new Product (0323, "tweezer", 7.24, 25);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);


        System.out.println(products);
    }
}

