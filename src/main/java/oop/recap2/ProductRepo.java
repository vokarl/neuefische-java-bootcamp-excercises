package oop.recap2;
import java.util.ArrayList;
import java.util.List;


public class ProductRepo {
    List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }
    public static void main(String[] args){
        Product product1 = new Product (11233, "shampoo", 3.32, 32);
        Product product2 = new Product (2332, "toothbrush", 1.23, 42);
        Product product3 = new Product (0323, "tweezer", 7.24, 25);

 ProductRepo productRepo1 = new ProductRepo();
productRepo1.add(product1);

    }
}

