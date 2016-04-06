import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by eric on 4/6/16.
 */
public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String string;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        states = capitals.keySet();
        Iterator iterator = states.iterator();
        while (iterator.hasNext()) {
            string = (String) iterator.next();
            System.out.println("The capital of " + string + " is " +
                    capitals.getProperty(string) + ".");
        }
        System.out.println();

        string = capitals.getProperty("Floridia", "Not Found");
        System.out.println("The capital of Florida is " +
                string + ".");

    }
}
