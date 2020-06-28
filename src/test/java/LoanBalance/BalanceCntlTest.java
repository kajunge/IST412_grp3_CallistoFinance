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
 * @author gkhalil
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
     //   System.out.println("calculateInterest");
        int p = 2000;
        int t = 5;
        double r = 0.08;
        int n = 12;
        BalanceCntl instance = new BalanceCntl();
        double expResult = 979.6914166032102;
        double result = instance.calculateInterest(2000, 5, 0.08, 12);
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
    //    System.out.println("PaymentHistory");
        
        //Date date = "28-6-2020";
        //String expResult = "Payment: 100.00, Date: 28-6-2020";
        
        double payment = 100.00;
        Date date = new Date();
        BalanceCntl instance = new BalanceCntl();
        String expResult = "Payment: " + payment + ", Date: " + date;
     
        String result = instance.PaymentHistory(payment, date);
        assertEquals(expResult, result);
        System.out.println("Test passed testPaymentHistory() " + result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
