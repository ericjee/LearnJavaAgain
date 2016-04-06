import java.util.HashMap;
import java.util.Map;

/**
 * Created by eric on 4/6/16.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Zara", "8");
        map.put("Test", 1.23);
        map.put("Ayan", "12");
        map.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t" + map);
    }
}
