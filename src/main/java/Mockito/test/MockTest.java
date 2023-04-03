package Mockito.test;

import Mockito.src.Book;
import Mockito.src.BookRepository;
import Mockito.src.BookService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {

    @Test
    public void testNoOfBooksWithMockito(){
        BookRepository bookRepository=mock(BookRepository.class);
        BookService bookService=new BookService(bookRepository);

        Book book1=new Book("1234","Mockito in action","Ayush",40);
        Book book2=new Book("5678","Mockito part 2","Ayush",50);

        Collection<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);

        when(bookRepository.findAll()).thenReturn(books);
        assertEquals(2,bookService.noOfBooks());
    }
}
