import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by eric on 4/5/16.
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' to quit.");
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
