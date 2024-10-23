package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private String username;

    public LogoutInputData(String username) {
        // DONE: save the current username in an instance variable and add a getter.
        this.username = username;
    }

    /**
     * Return the currently stored username for the logout use case.
     * @return said username
     */
    public String getUsername() {
        return username;
    }

}
