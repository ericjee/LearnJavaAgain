package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by eric on 4/7/16.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        SerializeEmployee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (SerializeEmployee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Not found");
            e.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("SSN: " +employee.SSN);
    }
}
