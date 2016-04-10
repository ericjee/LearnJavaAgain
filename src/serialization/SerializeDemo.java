package serialization;

import employee.EmployeeTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by eric on 4/7/16.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        SerializeEmployee employee = new SerializeEmployee();
        employee.name = "Reyan Ali";
        employee.address = "Test address";
        employee.SSN = 111122333;
        employee.number = 123;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
