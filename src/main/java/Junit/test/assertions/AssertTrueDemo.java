package main.java.Junit.test.assertions;

import main.java.Junit.src.Book;
import main.java.Junit.src.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {

    @Test
    public void assertTrueWithNoMessage(){
        BookService bookService = new BookService();
        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty());

    }

    @Test
    public void assertTrueWithMessage(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty(),"List of books is not empty");

    }

    @Test
    public void assertTrueWithMessageSupplier(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty(),()->"List of books is not empty");

    }
}
