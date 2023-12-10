/**
 * Represents a library user.
 * @author Luís
 */
public class User {

    private String userName;

    /**
     * Constructor for creating a User object.
     * @param userName The name of the user.
     */
    public User(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the name of the user.
     * @return The name of the user.
     */
    public String getUserName() {
        return userName;
    }
}
