package Mockito.src;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookService {

   BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

  public int noOfBooks(){
        return bookRepository.findAll().size();
    }

    public List<Book> getNewBookWithDiscount(int discount,int days){
        List<Book> newBooks=bookRepository.findNewBooks(days);

        for(Book book:newBooks){
            int price = book.getPrice();
            int newPrice = price - (discount*price/100);
            book.setPrice(newPrice);
        }

        return  newBooks;
    }

}
