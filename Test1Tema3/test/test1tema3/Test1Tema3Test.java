/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test1tema3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Clase para testear el factorial y la multiplicación
 *
 * @author laura
 */
public class Test1Tema3Test {

    public Test1Tema3Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of multiplica method, of class Test1Tema3.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Test1Tema3.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test con timeout del método multiplica
     */
    @Test(timeout = 10)
    public void testMultiplicaTimeout() {
        System.out.println("multiplica");
        int a = 35000;
        int b = 35000;
        int result = Test1Tema3.multiplica(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Test1Tema3.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Test1Tema3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Test1Tema3.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int num = 3;
        int expResult = 6;
        int result = Test1Tema3.factorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test a factorial en caso de que pase un número negativoc, lanzará una ecepción.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNeg() {
        System.out.println("factorial");
        int num = -1;
        int result = Test1Tema3.factorial(num);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
