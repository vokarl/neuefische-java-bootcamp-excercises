package OOP.libraryDeleteAddArrayItemsOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;



public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Library() {
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }

    public void removeBook(Book book) {
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        bookList.remove(book);
        books = bookList.toArray(new Book[0]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}