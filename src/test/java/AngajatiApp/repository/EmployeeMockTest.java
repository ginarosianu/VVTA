package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class EmployeeMockTest {

    private EmployeeMock employeeRepository;

    @Before
    public void setUp() throws Exception {
        employeeRepository = new EmployeeMock();
    }

    @After
    public void tearDown() throws Exception {
        employeeRepository = null;
    }

    @Test
    public void TC1() {
        Employee Sica = new Employee( "Marius", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d );
        Employee Mihai = new Employee( "Ion", "Dumitrescu", "1234567890876", DidacticFunction.LECTURER, 2500d );
        employeeRepository.addEmployee( Sica );
        employeeRepository.addEmployee( Mihai );

        employeeRepository.modifyEmployeeFunction( Sica, DidacticFunction.TEACHER );
        DidacticFunction newfunction = employeeRepository.findEmployeeById( Sica.getId()).getFunction();

        assertEquals(newfunction, DidacticFunction.TEACHER);
    }

    @Test
    public void TC2 (){
        Employee Ionel = new Employee("Marius", "Pacuraru", "1234567890876", DidacticFunction.ASISTENT, 2500d);
        Employee Mihai = new Employee("Ion", "Dumitrescu", "1234567890876", DidacticFunction.LECTURER, 2500d);
        Employee Alina = null;

        employeeRepository.addEmployee(Ionel);
        employeeRepository.addEmployee(Mihai);

        String oldEmployeeList = employeeRepository.getEmployeeList().toString();

        employeeRepository.modifyEmployeeFunction(Alina, DidacticFunction.TEACHER);

        assertTrue(oldEmployeeList.equals(employeeRepository.getEmployeeList().toString()));
    }


}