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
        int p = 1;
        int t = 1;
        double r = 0.0;
        int n = 1;
        BalanceCntl instance = new BalanceCntl();
        double expResult = 0.0;
        double result = instance.calculateInterest(p, t, r, n);
        assertEquals(expResult, result, 0.0);
        System.out.println("Test passed testCalculateInterest() " + result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of PaymentHistory method, of class BalanceCntl.
     */
    @Test
    public void testPaymentHistory() {
        System.out.println("PaymentHistory");
        double payment = 0.0;
        Date date = "01-01-2020";
        BalanceCntl instance = new BalanceCntl();
        String expResult = "Payment: 0.0, Date: 01-01-2020";
        String result = instance.PaymentHistory(payment, date);
        assertEquals(expResult, result);
        System.out.println("Test passed testPaymentHistory() " + result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
