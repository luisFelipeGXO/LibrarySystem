/**
 * Represents a book in the library.
 * @author Luís
 */
public class Book {

    private String bookName;
    private String author;
    private boolean available;

    /**
     * Constructor for creating a Book object.
     * @param bookName The name of the book.
     * @param author The author of the book.
     */
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.available = true;
    }

    /**
     * Sets the availability status of the book.
     * @param available True if the book is available, false otherwise.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Gets the name of the book.
     * @return The name of the book.
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Checks if the book is available for borrowing.
     * @return True if the book is available, false otherwise.
     */
    public  boolean isAvailable() {
        return available;
    }

}
