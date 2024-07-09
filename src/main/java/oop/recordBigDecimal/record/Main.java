package oop.recordBigDecimal.record;

public class Main {
    public static void main(String[] args) {
        Animal chimpanzee12 = new Animal("p342-h12-7", "Lucy", "Pan troglodytes.",29);
        Animal emeraldLizard23 = new Animal("s123-e45-8", "Spike", "Lacerta bilineata",3);
        Animal lion8 = new Animal("l456-e78-9", "Simba", "Panthera leo",12);
        Animal hyena12 = new Animal("h789-e01-2", "Scar", "Crocuta crocuta",2);
        Animal scorpion3 = new Animal("sc001-e02-3", "Stingy", "Scorpiones",4);
        Animal crocodile2 = new Animal("k234-e56-4", "Snappy", "Crocodylus niloticus",33);
        Animal xxx = new Animal("h789-e01-2", "Scar", "Crocuta crocuta",2);

        System.out.println("animal1 equals animal2?    " + chimpanzee12.equals(scorpion3));
        System.out.println("Is xxx and hyena12 same?   " + xxx.equals(hyena12));

        System.out.println(lion8);
    }
}
