package oop.libraryDeleteAddArrayItemsOOP;


public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book();
        books[0].setTitle("The Great Gatsby");
        books[0].setAuthor("F. Scott Fitzgerald");
        books[0].setIsbn("978-0-300-18179-9");
        books[1] = new Book();
        books[1].setTitle("The Catcher in the Rye");
        books[1].setAuthor("J. D. Salinger");
        books[1].setIsbn("978-0-300-18180-0");

        Library library = new Library(books);
        System.out.println(library);

       library.addBook(new Book("der hobbit", "jrr tolkien", "232-2-232-13212-2"));
        System.out.println(library);

        library.removeBook(books[0]);

        System.out.println(library);
    }
}