package AngajatiApp;

import AngajatiApp.model.Employee;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee e1;
    private Employee e2;
    private Employee e3;
    private Employee e4;
    //private Employee e5;

    @Before
    public void setUp() {
        e1 = new Employee();
        e1.setFirstName( "Ionescu" );
        e1.setCnp( "2770922011864" );
        e2 = new Employee();
        e2.setFirstName( "Popescu" );
        e3 = new Employee();
        e3.getId();
        e4 = new Employee();
        e4.getCnp();

        System.out.println( "Before test" );
    }

    @After
    public void tearDown() {
        e1 = null;
        e2 = null;
        e3 = null;
        System.out.println( "After test" );
    }

    @Test
    public void testGetFirstname() {
        assertEquals( "Ionescu", e1.getFirstName() );
    }


    @Test
    public void testGetCNP() {
        assertEquals( "2770922011864", e1.getCnp() );
    }

    @Test
    public void testConstructor() {

        assertNotEquals( "verificam daca s-a creat angajatul 3", e3, null );
    }

    @Test //de ce nu merge?
    public void testSetCNP () {
        e3.setCnp("2770922011864");
        assertEquals( "2770922011864", e3.getCnp());
    }

    @BeforeClass
    public static void setUpAll() {
        System.out.println( "Before all tests - at the begining of the tests" );
    }

    @AfterClass
    public static void tearDownAll() {
        System.out.println( "After all tests - at the end of the tests" );
    }

    @Test(timeout = 40)
    public void testSpeed() {
        try {
            Thread.sleep( 18 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Test(timeout=100)//failed
//    public void infinity() {
//        while(true);}

//    @Test (timeout=10)//passed
//    public void testDivision() {
//        System.out.println("\ntestDivision");
//        try {
//            e1.div(e2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        assertEquals(-14, e1.getNumerator());
//        assertEquals(125, e2.getDenominator());
//    }
//    @Test
//    public void infiniteLoop() {
//        while (true) {}
//    }

    @Test
    public void run1() throws InterruptedException {
        Thread.sleep(100);
    }

    @Ignore
    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void whenExceptionThrown_thenRuleIsApplied() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("For input string");
        Integer.parseInt("1a");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList <Object>().get(0);
    }
}