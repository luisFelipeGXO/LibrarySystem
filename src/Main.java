/**
 * Main class for testing the Library system.
 * @author Luís
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Harry Potter", "JK Rowling");
        Book book3 = new Book("Holy Bible", "God");

        User user1 = new User("John");
        User user2 = new User("Maria");
        User user3 = new User("Luís");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        library.listBooks();

        library.reserveBook(book1, user1);
        library.reserveBook(book2, user2);
        library.reserveBook(book3, user3);

        library.listBorrowings();

        library.makeReturn(book1);

        library.listBorrowings();
        library.listBooks();

    }
}