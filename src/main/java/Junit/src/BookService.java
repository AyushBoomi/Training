package main.java.Junit.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> listOfBooks=new ArrayList<>();

    public void addBook(Book book){
        listOfBooks.add(book);
    }

    public List<Book> books(){
        return Collections.unmodifiableList(listOfBooks);
    }

    Book getBookById(String bookId){
        for(Book book:listOfBooks){
            if(bookId.equals(book.getBookId())){
                return book;
            }
        }

        return null;
    }

}
