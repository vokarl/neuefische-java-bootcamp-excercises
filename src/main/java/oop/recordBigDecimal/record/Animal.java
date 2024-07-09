package oop.recordBigDecimal.record;

public record Animal(String ID, String Name, String Species, int age) {


}







/*
Create a new project in IntelliJ and lay the foundation for the Java Record Zoo Project.
Create a Java record "Animal" that should have properties for ID, Name, Species, and Age. Choose suitable field names.

Make a commit. Please post the link to your GitHub repository where you solved this task together. inputfield
Coding: Calling Record Methods

Now let's test the automatically generated methods.

In a main method, create multiple Animals.
Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

Coding: Nesting

Now we will use a Record as an attribute of another Record.

Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).
Let each Animal have an Owner.*/
