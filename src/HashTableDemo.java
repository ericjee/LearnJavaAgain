import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by eric on 4/6/16.
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String string;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        names = balance.keys();
        while (names.hasMoreElements()) {
            string = (String)names.nextElement();
            System.out.println(string + ": " + balance.get(string));
        }
        System.out.println();

        bal = (Double) balance.get("Zara");
        balance.put("Zara", bal + 1000);
        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }
}
