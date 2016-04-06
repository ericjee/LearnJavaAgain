package employee;

/**
 * Created by eric on 4/6/16.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("Test", "Test", 3, 3600.00);
        EmployeeTest employeeTest = new Salary("John", "Boston", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference --");
        employeeTest.mailCheck();
    }
}
