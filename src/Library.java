/**
 * Represents a library with books, users, and reservations.
 * @author Luís
 */

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<User> users;
    private List<ReserveBook> reserveBooks;

    /**
     * Constructor for creating a Library object.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.reserveBooks = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds a user to the library.
     * @param user The user to be added.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Reserves a book for a user.
     * @param book The book to be reserved.
     * @param user The user reserving the book.
     */
    public void reserveBook(Book book, User user) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            ReserveBook rb = new ReserveBook(book, user);
            reserveBooks.add(rb);
            System.out.println("Book reserved with sucess!");
        } else {
            System.out.println("Book is not disponible for noan.");
        }
    }

    /**
     * Makes a return for a borrowed book.
     * @param book The book to be returned.
     */
    public void makeReturn(Book book) {
        book.setAvailable(true);
        reserveBooks.removeIf(reserveBook -> reserveBook.getBook().equals(book));
        System.out.println("Return completed successfully!");
    }

    /**
     * Lists all the books in the library.
     */
    public void listBooks() {
        System.out.println("List of books:");
        for(Book book : books) {
            System.out.println("Title: " + book.getBookName() + ", Author: " + book.getAuthor() +
                    ", Available: " + (book.isAvailable() ? "Yes" : "No"));
        }
    }

    /**
     * Lists all the current borrowings in the library.
     */
    public void listBorrowings() {
        System.out.println("List of borrowings:");
        for(ReserveBook reserveBook : reserveBooks) {
            System.out.println("Book: " + reserveBook.getBook().getBookName() +
                    ", User: " + reserveBook.getUser().getUserName());
        }
    }
}
