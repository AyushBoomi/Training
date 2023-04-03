package Mockito.src;


public class Book {
    public String bookId;
    public String title;
    public int price;

    public Book(String bookId, String title, String publisher,int price) {
        this.bookId = bookId;
        this.title = title;
        this.publisher = publisher;
        this.price=price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String publisher;
}
