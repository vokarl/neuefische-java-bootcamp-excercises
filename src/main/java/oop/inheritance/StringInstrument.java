package oop.inheritance;

    public class StringInstrument extends Instrument {
        int numberOfStrings;

        @Override
        public String toString() {
            return "StringInstrument{" +
                    "brand='" + brand + '\'' +
                    ", price=" + price +
                    ", numberOfStrings=" + numberOfStrings +
                    '}';
        }

        public StringInstrument(String brand, Double price, int numberOfStrings) {
           super(brand, price);               //nur die von super class nötig
           this.numberOfStrings = numberOfStrings;
       }



    }
