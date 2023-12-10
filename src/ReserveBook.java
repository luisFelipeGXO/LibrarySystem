/**
 * Represents a reservation of a book by a user in the library.
 * @author Luís
 */
public class ReserveBook {

    private Book book;
    private User user;

    /**
     * Constructor for creating a ReserveBook object.
     * @param book The reserved book.
     * @param user The user making the reservation.
     */
    public ReserveBook(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    /**
     * Gets the reserved book.
     * @return The reserved book.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Gets the user who made the reservation.
     * @return The user who made the reservation.
     */
    public User getUser() {
        return user;
    }

}
