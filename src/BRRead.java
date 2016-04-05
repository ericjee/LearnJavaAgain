import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by eric on 4/5/16.
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while ( c != 'q');
    }
}
