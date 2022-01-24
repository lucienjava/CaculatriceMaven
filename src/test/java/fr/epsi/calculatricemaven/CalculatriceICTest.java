/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.calculatricemaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 33676
 */
public class CalculatriceICTest {
    
    public CalculatriceICTest() {
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
     * Test of addition method, of class CalculatriceIC.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 1.0;
        double b = 2.0;
        CalculatriceIC instance = new CalculatriceIC();
        double expResult = 3.0;
        double result = instance.addition(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of soustraction method, of class CalculatriceIC.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        double a = 1.0;
        double b = 2.0;
        CalculatriceIC instance = new CalculatriceIC();
        double expResult = -1.0;
        double result = instance.soustraction(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiplication method, of class CalculatriceIC.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double a = 3.0;
        double b = 2.0;
        CalculatriceIC instance = new CalculatriceIC();
        double expResult = 6.0;
        double result = instance.multiplication(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of division method, of class CalculatriceIC.
     */
    @Test
    public void testDivision() throws Exception {
        System.out.println("division");
        double a = 10.0;
        double b = 2.0;
        CalculatriceIC instance = new CalculatriceIC();
        double expResult = 5.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);

    }
 @Test(expected = fr.epsi.calculatricemaven.ExceptionByZero.class)
    public void testDivisionbyZero() throws Exception {
        System.out.println("division by zero");
        double a = 10.0;
        double b = .00;
        CalculatriceIC instance = new CalculatriceIC();
        double expResult = 5.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);

    }

}
