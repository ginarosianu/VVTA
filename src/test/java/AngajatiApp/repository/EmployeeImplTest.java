package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import AngajatiApp.validator.EmployeeValidator;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;

public class EmployeeImplTest {

    private EmployeeImpl emp;
    private EmployeeValidator validator = new EmployeeValidator();

    @Before
    public void setUp() {
        emp = new EmployeeImpl();

    }


    @After
    public void tearDown() {
        emp = null;
    }

    @Test
    public void TC1() {
        Employee e = new Employee();
        e.setId( 1 );
        e.setLastName( "pop" );
        e.setFirstName( "ana" );
        e.setCnp( "2770922011864" );
        e.setFunction( DidacticFunction.ASISTENT );
        e.setSalary( 3000.00 );
        assertTrue( emp.addEmployee( e ));
    }


    @Test
    public void TC2() {
        Employee e = new Employee();
        e.setId( 1000 );
        e.setLastName( "pop" );
        e.setFirstName( "ana" );
        e.setCnp( "270A1301254" );
        e.setFunction( DidacticFunction.ASISTENT );
        e.setSalary( 2500.00 );
        assertFalse( emp.addEmployee( e ) );              //verificam daca intr-adevar angajatul nu a fost adaugat

    }
    @Test
    public void TC3() {
        Employee e = new Employee();
        e.setId( 0 );
        e.setLastName( "pop" );
        e.setFirstName( "ana" );
        e.setCnp( "270A1301254" );
        e.setFunction( DidacticFunction.ASISTENT );
        e.setSalary( 2500.00 );
        assertFalse( emp.addEmployee( e ) );              //verificam daca intr-adevar angajatul nu a fost adaugat

    }
//    @Test
//    public void TC3() {
//        Employee e = new Employee();
//        e.setId( 0 );
//        e.setLastName( "pop" );
//        e.setFirstName( "ana" );
//        e.setCnp( "2770922011864" );
//        e.setFunction( DidacticFunction.ASISTENT );
//        e.setSalary( 2500.00 );
//        assertFalse( emp.addEmployee( e ) );              //verificam daca intr-adevar angajatul nu a fost adaugat
//    }
//

    @Test
    public void TC4 ( ) {
        Employee e = new Employee();
        e.setId( 1 );
        e.setLastName( "pop" );
        e.setFirstName( "" );
        e.setCnp( "A770922011864" );
        e.setFunction( DidacticFunction.ASISTENT );
        e.setSalary( 2500.00 );
        assertFalse( emp.addEmployee( e ) );
    }

//    @Test (expected = Exception.class)
//    public void TC5() {
//        Employee e = new Employee();
//        e.setId( 1 );
//        e.setLastName( "pop" );
//        e.setFirstName( "ana" );
//        e.setCnp( "2770922011864" );
//        e.setFunction( DidacticFunction.ASISTENT );
//        e.setSalary( 4500.00 );
//        int noOfEmployees = emp.getEmployeeList().size();
//        assertFalse(  );emp.addEmployee( e );                    //verificam daca intr-adevar angajatul nu a fost adaugat
//        assertEquals( noOfEmployees, emp.getEmployeeList().size() );
//
//    }
}