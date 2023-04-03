package main.java.Junit.test.assertions;

import main.java.Junit.src.Book;
import main.java.Junit.src.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionFalseDemo {
    @Test
    public void assertFalseWithNoMessage(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertFalse(listOfBooks.isEmpty());

    }

    @Test
    public void assertFalseWithMessage(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertFalse(listOfBooks.isEmpty(),"List of books is not empty");

    }

    @Test
    public void assertFalseWithMessageSupplier(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertFalse(listOfBooks.isEmpty(),()->"List of books is not empty");

    }
}
