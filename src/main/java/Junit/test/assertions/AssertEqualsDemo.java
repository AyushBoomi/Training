package Junit.test.assertions;

import Junit.src.Book;
import Junit.src.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertEqualsDemo {

    @Test
    public void assertTrueWithNoMessage(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        Book designPatternBook = new Book("2","Design patterns with wrox","Wrox");
        List<Book> listOfBooks = bookService.books();

        assertEquals("1",javaBook.getBookId());

    }

    @Test
    public void assertTrueWithMessage(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertEquals("4",javaBook.getBookId(),"Book is not present");

    }

    @Test
    public void assertTrueWithMessageSupplier(){
        BookService bookService = new BookService();
        Book javaBook = new Book("1","Head First Java","Wrox");
        bookService.addBook(javaBook);
        List<Book> listOfBooks = bookService.books();

        assertEquals("1",javaBook.getBookId(),()->"Book is not present");

    }
}
