package OOP.Inheritance;



public class Main {
    public static void main(String[] args) {
        System.out.println("Unsere Instrumente: ");

    StringInstrument violin = new StringInstrument("Harley Benton" , 100.00, 4);
    StringInstrument guitar = new StringInstrument("GuitarX", 600.00,6);
   Instrument epiano = new Instrument("yamaha", 800.00);

   print(violin);
        print(guitar);
        print(epiano);

        Instrument myFavourite = violin;
        System.out.println("Mein Lieblingsinstrument: ");
        print(myFavourite);

    }
    public static void print(Instrument instrument) {
        System.out.println(instrument);
    }

}
