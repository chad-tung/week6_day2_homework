package example.codeclan.com.employeestartpoint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Manager clothesManager;
    Engineer engineer;
    Admin admin;
    Director director;


    @Before
    public void before() {
        clothesManager = new Manager(1, "Alex", "b669jn", 35000.0, "Clothes");
        engineer = new Engineer(2, "Chad", "c782in", 24000.0);
        admin = new Admin(3, "Lucy", "d245pw", 25000.0);
        director = new Director(4, "Zac", "a452hn", 55000.0, "Clothes", 200000.0);
    }

    @Test
    public void testGetId() {
        assertEquals(1, clothesManager.getEmpId());
        assertEquals(2, engineer.getEmpId());
        assertEquals(3, admin.getEmpId());
        assertEquals(4, director.getEmpId());
    }

    @Test
    public void testGetName() {
        assertEquals("Alex", clothesManager.getName());
        assertEquals("Chad", engineer.getName());
        assertEquals("Lucy", admin.getName());
        assertEquals("Zac", director.getName());
    }

    @Test
    public void testGetSsn() {
        assertEquals("b669jn", clothesManager.getSsn());
        assertEquals("c782in", engineer.getSsn());
        assertEquals("d245pw", admin.getSsn());
        assertEquals("a452hn", director.getSsn());
    }

    @Test
    public void testGetSalary() {
        assertEquals(35000.0, clothesManager.getSalary(), 0.1);
        assertEquals(24000.0, engineer.getSalary());
        assertEquals(25000.0, admin.getSalary());
        assertEquals(55000.0, director.getSalary());

    }

    @Test
    public void testGetDept() {
        assertEquals("Clothes", clothesManager.getDeptName());
        assertEquals("Clothes", director.getDeptName());
    }

    @Test
    public void testGetBudget() {
        Assert.assertEquals(200000.0, director.getBudget(), 0.1);
    }

    @Test
    public void testCanIncreaseSalary() {
        director.raiseSalary(5000);
        assertEquals(60000.0, director.getSalary(), 0.1);
        admin.raiseSalary(5000);
        assertEquals(30000.0, admin.getSalary(), 0.1);
    }

    @Test
    public void testCanSetName() {
        engineer.setName("Ben");
        assertEquals("Ben", engineer.getName());
    }

    @Test
    public void testDataValidation() {
        engineer.setName(null);
        assertEquals("Chad", engineer.getName());
        engineer.raiseSalary(-10000.0);
        assertEquals(24000.0, engineer.getSalary(), 0.1);
    }
}
