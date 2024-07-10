package oop.recordBigDecimal.record;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("John Doe", 35, "123 Main St");
        Owner owner2 = new Owner("Jane Smith", 28, "456 Elm St");
        Species speciesTypeP = new Species ("Pan troglodytes",4000);
        Species speciesTypeL = new Species("Lacerta bilineata", 300);
        Species speciesTypeS = new Species("Panthera leo",  6000);
        Species speciesTypeH = new Species("Crocuta crocuta",  5000);
        Species speciesTypeSC = new Species("Scorpiones",  400);
        Species speciesTypeCR = new Species("Crocodylus niloticus",  50000);



        Animal chimpanzee12 = new Animal("p342-h12-7", "Lucy", speciesTypeP,29, owner1);
        Animal emeraldLizard23 = new Animal("s123-e45-8", "Spike", speciesTypeL, 3, owner1);
        Animal lion8 = new Animal("l456-e78-9", "Simba", speciesTypeS, 12, owner2);
        Animal hyena12 = new Animal("h789-e01-2", "Scar", speciesTypeH, 2, owner1);
        Animal scorpion3 = new Animal("sc001-e02-3", "Stingy", speciesTypeSC, 4, owner2);
        Animal crocodile2 = new Animal("k234-e56-4", "Snappy", speciesTypeCR, 33, owner1);
        Animal xxx = new Animal("h789-e01-2", "Scar", speciesTypeH, 2, owner2);


  /*      System.out.println("animal1 equals animal2?    " + chimpanzee12.equals(scorpion3));
        System.out.println("Is xxx and hyena12 same?   " + xxx.equals(hyena12));
        System.out.println("lion no.8: " +lion8.toString());*/


        Animal chimpanzee12Owner = new Animal(chimpanzee12.ID(), chimpanzee12.Name(), speciesTypeP, chimpanzee12.age(), owner1 );
        System.out.println("chimp no.8: " +chimpanzee12Owner.toString());
    }
}




/*
Bonus: Zoo

If you have already completed the main task, you can try this bonus task.

    Implement a "Zoo" Record that has a list of all Animals and can calculate the total food requirement
    of all animals in the Zoo.
*/

