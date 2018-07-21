package test6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    @Test
    public void testCalculateAppriasal() {
        employee.setName("Sefa");
        employee.setAge(23);
        employee.setMonthlySalary(7500);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Ahmet");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}
