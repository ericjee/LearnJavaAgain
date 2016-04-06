package employee;

import employee.EmployeeTest;

/**
 * Created by eric on 4/6/16.
 */
public class Salary extends EmployeeTest {

    public double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return  salary/52;
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
        + " with salary " + salary);
    }
}
