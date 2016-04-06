package employee;

/**
 * Created by eric on 4/6/16.
 */
public abstract class EmployeeTest {
    private String name;
    private String address;
    private int number;

    public EmployeeTest(String name, String address, int number) {
        System.out.println("Construting an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public abstract double computePay();

}
