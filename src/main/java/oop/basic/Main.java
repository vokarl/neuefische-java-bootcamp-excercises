package oop.basic;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Hyunday", "Nexo","blue",2023, 0 );
        Car anotherCar = new Car("Toyota", "Yaris", "red", 2023, 0);
        Person person1 = new Person ("Joe", 45, "male");
        Person person2 = new Person ("Cara", 44, "female");

        System.out.println(anotherCar);

        myCar.start();
        myCar.accelerateSpeed(78);

        person1.greeting();
        person2.greeting();
    }
}
