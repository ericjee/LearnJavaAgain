import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by eric on 4/6/16.
 */
public class EnumerationTester {
    public static void main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("TuesDay");
        dayNames.add("Wednesday");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
