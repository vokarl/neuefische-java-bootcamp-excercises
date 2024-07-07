package oop.libraryDeleteAddArrayItemsOOP;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash( isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
/*
Step 1: Create a class 'Book' with the properties 'title', 'author', and 'isbn'. Implement getter and setter methods for these properties.

Step 2: Override the toString method of the 'Book' class to display the book information in a readable format.
Step 3: Create a class 'Library' with an array of 'Book' objects.
        Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.
Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.
Post the link to your GitHub repo where you solved the task together. inputfield
If you have already completed this task earlier, you may work on the bonus task on the next page.

Bonus

Have you quickly mastered the main task? Additionally, work on this voluntary bonus task.

Implement methods to add and delete books from the library.*/
