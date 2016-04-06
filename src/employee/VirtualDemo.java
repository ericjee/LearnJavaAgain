package employee;



/**
 * Created by eric on 4/6/16.
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("Eric", "Ambehta, UP", 3, 3600.00);
        EmployeeTest employee = new Salary("John", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference --");
        employee.mailCheck();
    }
}
