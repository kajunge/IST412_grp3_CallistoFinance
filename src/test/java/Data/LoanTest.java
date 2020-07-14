/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getLoanID method, of class Loan.
     */
    @Test
    public void testGetLoanID() {
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setCustomerID(customerID);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCustomerID()");
        System.out.println("*********************************");
    }

//    /**
//     * Test of getAmountTotal method, of class Loan.
//     */
//    @Test
//    public void testGetAmountTotal() {
//        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
//        long expResult = 30000L;
//        long result = instance.getAmountTotal();
//        assertEquals(expResult, result);
//        System.out.println("*********************************");
//        System.out.println("Testing Passed for testGetAmountTotal() " + result);
//        System.out.println("*********************************");
//    }
//
//    /**
//     * Test of setAmountTotal method, of class Loan.
//     */
//    @Test
//    public void testSetAmountTotal() {
//        long amountTotal = 0L;
//        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
//        instance.setAmountTotal(amountTotal);
//        System.out.println("*********************************");
//        System.out.println("Testing Passed for testSetAmountTotal()");
//        System.out.println("*********************************");
//    }

    /**
     * Test of getSinglePayment method, of class Loan.
     */
    @Test
    public void testGetSinglePayment() {
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
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
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setDate(date);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetDate() ");
        System.out.println("*********************************");
    }

    /**
     * Test of getPrincipalAmount method, of class Loan.
     */
    @Test
    public void testGetPrincipalAmount() {
        System.out.println("getPrincipalAmount");
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        long expResult = 30000L;
        long result = instance.getPrincipalAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetPrincipalAmount() ");
        System.out.println("*********************************");
    }

    /**
     * Test of setPrincipalAmount method, of class Loan.
     */
    @Test
    public void testSetPrincipalAmount() {
        System.out.println("setPrincipalAmount");
        long principalAmount = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setPrincipalAmount(principalAmount);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetPrincipalAmount() ");
        System.out.println("*********************************");
    }

    /**
     * Test of getCurrentTotal method, of class Loan.
     */
    @Test
    public void testGetCurrentTotal() {
        System.out.println("getCurrentTotal");
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        long expResult = 20000L;
        long result = instance.getCurrentTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetCurrentTotal() ");
        System.out.println("*********************************");
    }

    /**
     * Test of setCurrentTotal method, of class Loan.
     */
    @Test
    public void testSetCurrentTotal() {
        System.out.println("setCurrentTotal");
        long currentTotal = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setCurrentTotal(currentTotal);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCurrentTotal() ");
        System.out.println("*********************************");
    }

    /**
     * Test of getLoanLength method, of class Loan.
     */
    @Test
    public void testGetLoanLength() {
        System.out.println("getLoanLength");
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        long expResult = 36L;
        long result = instance.getLoanLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetLoanLength() ");
        System.out.println("*********************************");
    }

    /**
     * Test of setLoanLength method, of class Loan.
     */
    @Test
    public void testSetLoanLength() {
        System.out.println("setLoanLength");
        long loanLength = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setLoanLength(loanLength);
        // TODO review the generated test code and remove the default call to fail.
       System.out.println("*********************************");
        System.out.println("Testing Passed for testStLoanLength() ");
        System.out.println("*********************************");
    }

    /**
     * Test of getAnnualRate method, of class Loan.
     */
    @Test
    public void testGetAnnualRate() {
        System.out.println("getAnnualRate");
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        double expResult = 0.0;
        double result = instance.getAnnualRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetAnnualRate() ");
        System.out.println("*********************************");
    }

    /**
     * Test of setAnnualRate method, of class Loan.
     */
    @Test
    public void testSetAnnualRate() {
        System.out.println("setAnnualRate");
        double annualRate = 0.0;
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setAnnualRate(annualRate);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetAnnualRate() ");
        System.out.println("*********************************");
    }

    /**
     * Test of getCompoundNum method, of class Loan.
     */
    @Test
    public void testGetCompoundNum() {
        System.out.println("getCompoundNum");
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        long expResult = 1L;
        long result = instance.getCompoundNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for restGetCompoundNum() ");
        System.out.println("*********************************");
    }

    /**
     * Test of setCompoundNum method, of class Loan.
     */
    @Test
    public void testSetCompoundNum() {
        System.out.println("setCompoundNum");
        long compoundNum = 0L;
        Loan instance = new Loan(2L, 2L, 30000L, 20000L, 36L, 0.0, 1L, 10000L, "28-6-2020");
        instance.setCompoundNum(compoundNum);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCompoundNum()");
        System.out.println("*********************************");
    }
    
}
