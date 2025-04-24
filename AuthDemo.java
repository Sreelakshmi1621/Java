import java.util.Scanner;

// Step 1: Define a user-defined exception
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Step 2: Main class with authentication logic
public class AuthDemo{

    // Hardcoded correct credentials
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "pass123";

    // Step 3: Method to authenticate the user
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(CORRECT_USERNAME) || !password.equals(CORRECT_PASSWORD)) {
            throw new AuthenticationException("Authentication failed: Invalid username or password.");
        }
    }

    // Step 4: Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Login ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticate(username, password);
            System.out.println("Login successful! Welcome, " + username + "!");
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
