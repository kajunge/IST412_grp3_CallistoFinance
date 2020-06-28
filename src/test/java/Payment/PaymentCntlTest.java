/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import org.junit.AfterClass;
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

    /**
     * Test of makePayment method, of class PaymentCntl.
     */
    @Test
    public void testMakePayment() {
        //System.out.println("makePayment");
        double payment = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 25000;
        double result = instance.makePayment(payment, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("Testing passed testMakePayment " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isLate method, of class PaymentCntl.
     */
    @Test
    public void testIsLate() {
        //System.out.println("isLate");
        PaymentCntl instance = new PaymentCntl();
        boolean expResult = false;
        boolean result = instance.isLate();
        assertEquals(expResult, result);
        System.out.println("Testing passed testIsLate() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lateFee method, of class PaymentCntl.
     */
    @Test
    public void testLateFee() {
        //System.out.println("lateFee");
        double loanInterest = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 500;
        double result = instance.lateFee(loanInterest, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("Testing testLateFee() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of amountDue method, of class PaymentCntl.
     */
    @Test
    public void testAmountDue() {
        //System.out.println("amountDue");
        double loanInterest = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 4500;
        double result = instance.amountDue(loanInterest, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("Testing passed testAmountDue() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
