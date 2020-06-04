package example1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic= new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();
    @Test
    public void testCalculateAppraisal(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal,0.0);
    }
    @Test
    public void testCalculateYearlySalary(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary=empBusinessLogic.calculateYearSalary(employee);
        assertEquals(96000,salary,0.0);
    }
}
