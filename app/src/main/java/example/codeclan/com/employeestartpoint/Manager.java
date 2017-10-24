package example.codeclan.com.employeestartpoint;

/**
 * Created by chad on 24/10/2017.
 */

public class Manager extends Employee{
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
