/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class LoanListTest {
    
    public LoanListTest() {
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
     * Test of addLoan method, of class LoanList.
     */
    @Test
    public void testAddLoan() {
        long loanID = 0L;
        long customerID = 0L;
        long amountTotal = 0L;
        long singlePayment = 0L;
        String date = "";
        LoanList instance = new LoanList();
        instance.addLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("\n*********************************");       
        System.out.println("Testing Passed for testAddLoan()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of editLoan method, of class LoanList.
     */
    @Test
    public void testEditLoan() {
        long loanID = 0L;
        long customerID = 0L;
        long amountTotal = 0L;
        long singlePayment = 0L;
        String date = "";
        LoanList instance = new LoanList();
        instance.editLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testEditLoan()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of deleteLoan method, of class LoanList.
     */
    @Test
    public void testDeleteLoan() {
        long loanID = 0L;
        LoanList instance = new LoanList();
        instance.deleteLoan(loanID);
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testDeleteLoan()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of readLoanFile method, of class LoanList.
     */
    @Test
    public void testReadLoanFile() {
        LoanList instance = new LoanList();
        instance.readLoanFile();
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testReadLoanFile()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of writeLoanFile method, of class LoanList.
     */
    @Test
    public void testWriteLoanFile() {
        LoanList instance = new LoanList();
        instance.writeLoanFile();
        System.out.println("\n*********************************");
        System.out.println("Testing Passed testWriteLoanFile()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of printLoanFile method, of class LoanList.
     */
    @Test
    public void testPrintLoanFile() {
        LoanList instance = new LoanList();
        instance.printLoanFile();
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testPrintLoanFile()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of getLoanArray method, of class LoanList.
     */
    @Test
    public void testGetLoanArray() {
        LoanList instance = new LoanList();
        instance.addLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        ArrayList<Loan> expResult = instance.getLoanArray();
        ArrayList<Loan> result = instance.getLoanArray();
        assertEquals(expResult, result);
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testGetLoanArray()");
        System.out.println("\n*********************************");
    }

    /**
     * Test of setLoanArray method, of class LoanList.
     */
    @Test
    public void testSetLoanArray() {
        ArrayList<Loan> loanArray = null;
        LoanList instance = new LoanList();
        instance.setLoanArray(loanArray);
        System.out.println("\n*********************************");
        System.out.println("Testing Passed for testSetLoanArray()");
        System.out.println("\n*********************************");
    }
    
}
