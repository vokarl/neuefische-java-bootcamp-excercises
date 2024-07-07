package OOP;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed = 0;

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYearOfManufacture(){
        return yearOfManufacture;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYearOfManufacture(int yearOfManufacture){
        this.yearOfManufacture = yearOfManufacture;
    }

    public void start(){
        System.out.println("engine started ");
    }
    public void speed(int speed){
        this.speed += speed;
        System.out.println("The speed of the " + brand + "has been raised" + " by " + speed + " kmh." );
    }

}
