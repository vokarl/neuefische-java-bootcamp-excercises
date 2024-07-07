package basics;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        Scanner scanObject = new Scanner(System.in);
        String greeting = "Hello World";

String firstName = "Karl";
 System.out.println(greeting +" my name is " + firstName);

 System.out.println("Enter your age: ");
 int userAge = scanObject.nextInt();

 if (userAge >= 30) {
     System.out.println("You are in");
 }else if (userAge <= 30){
     System.out.println("You are out");
  }
    else  {
            System.out.println("You are definaltey out");
}
    //
}}




