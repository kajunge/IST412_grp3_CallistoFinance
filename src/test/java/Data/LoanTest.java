/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author Chris Lefebvre
 * @author kristinamantha
 */
public class LoanTest implements Serializable{
    
    public LoanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing LoanListTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLoanID method, of class Loan.
     */
    @Test
    public void testGetLoanID() {
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2L;
        long result = instance.getLoanID();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetLoanID() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setLoanID method, of class Loan.
     */
    @Test
    public void testSetLoanID() {
        long loanID = 2L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("Testing: this is teh testSetLoanID " + loanID);
        instance.setLoanID(loanID);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetLoanID()");
        System.out.println("*********************************");
    }

    /**
     * Test of getCustomerID method, of class Loan.
     */
    @Test
    public void testGetCustomerID() {
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2L;
        long result = instance.getCustomerID();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetCustomerID() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setCustomerID method, of class Loan.
     */
    @Test
    public void testSetCustomerID() {
        long customerID = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setCustomerID(customerID);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCustomerID()");
        System.out.println("*********************************");
    }

    /**
     * Test of getAmountTotal method, of class Loan.
     */
    @Test
    public void testGetAmountTotal() {
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 30000L;
        long result = instance.getAmountTotal();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetAmountTotal() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setAmountTotal method, of class Loan.
     */
    @Test
    public void testSetAmountTotal() {
        long amountTotal = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setAmountTotal(amountTotal);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetAmountTotal()");
        System.out.println("*********************************");
    }

    /**
     * Test of getSinglePayment method, of class Loan.
     */
    @Test
    public void testGetSinglePayment() {
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2000L;
        long result = instance.getSinglePayment();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetSinglePayment() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setSinglePayment method, of class Loan.
     */
    @Test
    public void testSetSinglePayment() {
        long singlePayment = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setSinglePayment(singlePayment);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetSinglePayment()");
        System.out.println("*********************************");
    }

    /**
     * Test of getDate method, of class Loan.
     */
    @Test
    public void testGetDate() {
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        String expResult = "28-6-2020";
        String result = instance.getDate();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetDate() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setDate method, of class Loan.
     */
    @Test
    public void testSetDate() {
        String date = "";
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setDate(date);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetDate() ");
        System.out.println("*********************************");
    }
    
}
