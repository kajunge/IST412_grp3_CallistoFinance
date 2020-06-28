/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanBalance;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristinamantha
 */
public class BalanceCntlTest {
    
    public BalanceCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculateInterest method, of class BalanceCntl.
     */
    @Test
    public void testCalculateInterest() {
        System.out.println("calculateInterest");
        int p = 0;
        int t = 0;
        double r = 0.0;
        int n = 0;
        BalanceCntl instance = null;
        double expResult = 0.0;
        double result = instance.calculateInterest(p, t, r, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PaymentHistory method, of class BalanceCntl.
     */
    @Test
    public void testPaymentHistory() {
        System.out.println("PaymentHistory");
        double payment = 0.0;
        Date date = null;
        BalanceCntl instance = null;
        String expResult = "";
        String result = instance.PaymentHistory(payment, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
