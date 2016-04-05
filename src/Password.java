import java.io.Console;
import java.util.Arrays;

/**
 * Created by eric on 3/15/16.
 */
public class Password {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.err.println("No Console");
            System.exit(1);
        }

        String login = console.readLine("Please Enter your login: ");
        char[] oldPassword = console.readPassword("Enter your old password: ");

        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                char[] newPassword1 = console.readPassword("Enter your new password: ");
                char[] newPassword2 = console.readPassword("Enter new password again: ");
                noMatch = !Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    console.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    console.format("Password for %s changed.%n", login);
                }
            } while (noMatch);
        }

        Arrays.fill(oldPassword,' ');
    }

    static boolean verify(String login, char[] password) {
        return true;
    }

    static void change(String oldPassword, char[] newPassword1) {};
}
