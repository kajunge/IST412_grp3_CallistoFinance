/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristinamantha
 */
public class PaymentCntlTest {
    
    public PaymentCntlTest() {
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
     * Test of makePayment method, of class PaymentCntl.
     */
    @Test
    public void testMakePayment() {
        System.out.println("makePayment");
        double payment = 0.0;
        PaymentCntl instance = new PaymentCntl();
        instance.makePayment(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLate method, of class PaymentCntl.
     */
    @Test
    public void testIsLate() {
        System.out.println("isLate");
        PaymentCntl instance = new PaymentCntl();
        boolean expResult = false;
        boolean result = instance.isLate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
