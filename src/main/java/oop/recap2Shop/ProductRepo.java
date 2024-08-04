package oop.recap2Shop;
import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo (){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
    public void getProductToConsole() {
        System.out.println("all Products:");
        for (Product product : products) {
            System.out.println(product);
        };
    }
    public Product getProductById(String id){
        for (Product product : products){
            if (product.id().equals(id)){
                return product;
            }
        }
        return null;
    }

    public Product addProduct(Product newProduct){
        products.add(newProduct);
        return newProduct;
    }

    public void removeProductById(String id){
        for (Product product : products){
            if (product.id().equals(id)){
                products.remove(product);
                return;
            }        }
    }
}
