/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kristinamantha
 * @author Chris LeFebvre
 */
public class PaymentCntlTest {
    
    public PaymentCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing PaymentCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of makePayment method, of class PaymentCntl.
     */
    @Test
    public void testMakePayment() {
        double payment = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 25000;
        double result = instance.makePayment(payment, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testMakePayment() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of isLate method, of class PaymentCntl.
     */
    @Test
    public void testIsLate() {
        PaymentCntl instance = new PaymentCntl();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dueDate = new Date();
        Date currentDate = new Date();
                
        try{
            
            dueDate = sdf.parse("2010-01-31");
            currentDate = sdf.parse("2009-12-31");
        }catch(ParseException e){}   
        
        boolean expResult = true;
        boolean result = instance.isLate(dueDate, currentDate);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsLate() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of lateFee method, of class PaymentCntl.
     */
    @Test
    public void testLateFee() {
        double loanInterest = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 500;
        double result = instance.lateFee(loanInterest, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testLateFee() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of amountDue method, of class PaymentCntl.
     */
    @Test
    public void testAmountDue() {
        double loanInterest = 0.0;
        double previousTotal = 0.0;
        PaymentCntl instance = new PaymentCntl();
        double expResult = 4500;
        double result = instance.amountDue(loanInterest, previousTotal);
        assertEquals(expResult, result, 0.0);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testAmountDue() " + result);
        System.out.println("*********************************");
    }
    
}
