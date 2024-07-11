package oop.basic;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void greeting(){
        System.out.println("Hello, my name is " + name + " and I´m a " + age + " years old " + gender);
    }


}