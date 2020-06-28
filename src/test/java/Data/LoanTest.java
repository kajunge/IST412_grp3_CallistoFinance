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
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLoanID method, of class Loan.
     */
    @Test
    public void testGetLoanID() {
        System.out.println("* LoanTest: testGetLoanID()");
        System.out.println("getLoanID");
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2L;
        long result = instance.getLoanID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanID method, of class Loan.
     */
    @Test
    public void testSetLoanID() {
        System.out.println("setLoanID");
        long loanID = 2L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("Testing: this is teh testSetLoanID " + loanID);
        instance.setLoanID(loanID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerID method, of class Loan.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2L;
        long result = instance.getCustomerID();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetCustomerID " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class Loan.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        long customerID = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setCustomerID(customerID);
        System.out.println("Testing: this is the testSetCustomerID");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountTotal method, of class Loan.
     */
    @Test
    public void testGetAmountTotal() {
        System.out.println("getAmountTotal");
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 30000L;
        long result = instance.getAmountTotal();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetAmountTotal " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAmountTotal method, of class Loan.
     */
    @Test
    public void testSetAmountTotal() {
        System.out.println("setAmountTotal");
        long amountTotal = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setAmountTotal(amountTotal);
        System.out.println("Testing: this is the testSetAmountTotal()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSinglePayment method, of class Loan.
     */
    @Test
    public void testGetSinglePayment() {
        System.out.println("getSinglePayment");
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        long expResult = 2000L;
        long result = instance.getSinglePayment();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetSinglePayment() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSinglePayment method, of class Loan.
     */
    @Test
    public void testSetSinglePayment() {
        System.out.println("setSinglePayment");
        long singlePayment = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setSinglePayment(singlePayment);
        System.out.println("Testing: this is the testSetSinglePayment() ");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Loan.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        String expResult = "28-6-2020";
        String result = instance.getDate();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetDate() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Loan.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Loan instance = new Loan(2L, 2L, 30000L, 2000L, "28-6-2020");
        instance.setDate(date);
        System.out.println("Testing: this is the testSetDate() ");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
