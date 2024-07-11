package oop.basic;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int speed;

    public Car(String brand, String model, String color, int yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", speed=" + speed +
                '}';
    }

    public void start(){
        System.out.println("The engine of the " + brand + " has started");
    }
    public void accelerateSpeed(int speed){
        this.speed += speed;
        System.out.println("The speed of the " + brand + " has been raised" + " by " + speed + " kmh." );
    }

}
