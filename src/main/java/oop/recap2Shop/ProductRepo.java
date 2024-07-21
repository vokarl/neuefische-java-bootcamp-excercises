package oop.recap2Shop;
import java.util.ArrayList;
import java.util.List;


public class ProductRepo {

   private List<Product> products;// Liste erzeugen

    public ProductRepo(){
        products = new ArrayList<>();
        products.add(new Product("1","Apfel"));
    }


    public List<Product> getProducts() {  //getter, um alle Produkte anzeigen zu können
        return products;
    }

    public Product getProductById(String id){    //Produkt anzeigen per id
        for(Product product : products){
            if(product.id().equals(id)){
                return product;
            }
        }
          return null;

    }

    public Product addProduct(Product newProduct){
            products.add(newProduct);    // add = methode von List - braucht return
            return newProduct;
    }

    public void removeProduct(String id){
        for (Product product : products){
            if(product.id().equals(id)){
                products.remove(product);
                return;
            }
        }
    }


}

