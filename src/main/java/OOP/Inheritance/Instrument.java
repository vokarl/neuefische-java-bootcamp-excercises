package OOP.Inheritance;

public class Instrument {
   public String brand;
    public Double price;

    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Instrument(String brand, Double price) {
    this.brand = brand;
    this.price = price;



}

}
