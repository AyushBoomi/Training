package Mockito.test;

import Mockito.src.Book;
import Mockito.src.BookRepository;
import Mockito.src.BookService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StubTest {
@Test
    public void testNewBookWithDiscount(){
        BookRepository bookRepository=mock(BookRepository.class);
        BookService bookService=new BookService(bookRepository);

        Book book1=new Book("1234","Mockito in action","Ayush",500);
        Book book2=new Book("5678","Mockito part 2","Ayush",400);

        List<Book> newBooks=new ArrayList<>();
        newBooks.add(book1);
        newBooks.add(book2);

        when(bookRepository.findNewBooks(7)).thenReturn(newBooks);
        List<Book> newBookWithDiscount =  bookService.getNewBookWithDiscount(10,7);

        assertEquals(2,newBookWithDiscount.size());
        assertEquals(450,newBookWithDiscount.get(0).getPrice());
        assertEquals(360,newBookWithDiscount.get(1).getPrice());


    }
}
