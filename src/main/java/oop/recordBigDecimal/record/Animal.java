package oop.recordBigDecimal.record;

import java.util.Objects;

public record Animal(String ID, String Name, String Species, int age) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(ID, animal.ID) && Objects.equals(Name, animal.Name) && Objects.equals(Species, animal.Species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, Species, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Species='" + Species + '\'' +
                ", age=" + age +
                '}';
    }
}







/*

Now let's test the automatically generated methods.

In a main method, create multiple Animals.
Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

Coding: Nesting

Now we will use a Record as an attribute of another Record.

Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).
Let each Animal have an Owner.*/
