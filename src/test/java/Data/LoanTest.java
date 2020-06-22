/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
public class LoanTest {
    
    public LoanTest() {
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
     * Test of getLoanID method, of class Loan.
     */
    @Test
    public void testGetLoanID() {
        System.out.println("getLoanID");
        Loan instance = null;
        long expResult = 0L;
        long result = instance.getLoanID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanID method, of class Loan.
     */
    @Test
    public void testSetLoanID() {
        System.out.println("setLoanID");
        long loanID = 0L;
        Loan instance = null;
        instance.setLoanID(loanID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerID method, of class Loan.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Loan instance = null;
        long expResult = 0L;
        long result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class Loan.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        long customerID = 0L;
        Loan instance = null;
        instance.setCustomerID(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountTotal method, of class Loan.
     */
    @Test
    public void testGetAmountTotal() {
        System.out.println("getAmountTotal");
        Loan instance = null;
        long expResult = 0L;
        long result = instance.getAmountTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmountTotal method, of class Loan.
     */
    @Test
    public void testSetAmountTotal() {
        System.out.println("setAmountTotal");
        long amountTotal = 0L;
        Loan instance = null;
        instance.setAmountTotal(amountTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSinglePayment method, of class Loan.
     */
    @Test
    public void testGetSinglePayment() {
        System.out.println("getSinglePayment");
        Loan instance = null;
        long expResult = 0L;
        long result = instance.getSinglePayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSinglePayment method, of class Loan.
     */
    @Test
    public void testSetSinglePayment() {
        System.out.println("setSinglePayment");
        long singlePayment = 0L;
        Loan instance = null;
        instance.setSinglePayment(singlePayment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Loan.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Loan instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Loan.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Loan instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
