package example.codeclan.com.employeestartpoint;

import static android.R.attr.id;

/**
 * Created by user on 28/08/2017.
 */

public abstract class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public boolean checkName(String name) {
        return name == null;
    }

    public void setName(String name) {
        if (!checkName(name)) {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }

    }
}
