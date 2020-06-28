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
        System.out.println("\n*********************************");
        System.out.println("****   Testing BalanceUITest  ****");
        System.out.println("*********************************");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculateInterest method, of class BalanceCntl.
     */
    @Test
    public void testCalculateInterest() {
        int p = 2000;
        int t = 5;
        double r = 0.08;
        int n = 12;
        BalanceCntl instance = new BalanceCntl();
        double expResult = 979.6914166032102;
        double result = instance.calculateInterest(2000, 5, 0.08, 12);
        assertEquals(expResult, result, 0.0);
        System.out.println("*********************************");
        System.out.println("Test Passed for testCalculateInterest() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of PaymentHistory method, of class BalanceCntl.
     */
    @Test
    public void testPaymentHistory() {
        
        double payment = 100.00;
        Date date = new Date();
        BalanceCntl instance = new BalanceCntl();
        String expResult = "Payment: " + payment + ", Date: " + date;
     
        String result = instance.PaymentHistory(payment, date);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Test Passed for testPaymentHistory() " + result);
        System.out.println("*********************************");
    }

}
