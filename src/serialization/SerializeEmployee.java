package serialization;

import java.io.Serializable;

/**
 * Created by eric on 4/7/16.
 */
public class SerializeEmployee implements Serializable {
    public String name;
    public int number;
    public String address;
    public transient int SSN;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " +address);
    }
}
