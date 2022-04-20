package OOPIIAssignment_2017001245;

import java.io.Serializable;

public class Book implements Serializable {

    private int BookID;
    private String AuthorName;
    private String Title;
    private String PublishedDate;
    private float Price;
    private int Quantity;

    public Book() {
        BookID = 0;
        AuthorName = "";
        Title = "";
        PublishedDate = "";
        Price = 0.0f;
        Quantity = 0;
    }
    public Book(int bookID, String authorName, String title, String publishedDate, float price, int quantity) {
        BookID = bookID;
        AuthorName = authorName;
        Title = title;
        PublishedDate = publishedDate;
        Price = price;
        Quantity = quantity;
    }
    public Book(Book book) {
        BookID = book.BookID;
        AuthorName = book.AuthorName;
        Title = book.Title;
        PublishedDate = book.PublishedDate;
        Price = book.Price;
        Quantity = book.Quantity;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        PublishedDate = publishedDate;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", AuthorName='" + AuthorName + '\'' +
                ", Title='" + Title + '\'' +
                ", PublishedDate='" + PublishedDate + '\'' +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                '}';
    }
}
