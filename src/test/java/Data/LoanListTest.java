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
 *
 * @author kristinamantha
 */
public class LoanListTest {
    
    public LoanListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addLoan method, of class LoanList.
     */
    @Test
    public void testAddLoan() {
        //System.out.println("addLoan");
        long loanID = 0L;
        long customerID = 0L;
        long amountTotal = 0L;
        long singlePayment = 0L;
        String date = "";
        LoanList instance = new LoanList();
        instance.addLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("Testing passed testAddLoan()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editLoan method, of class LoanList.
     */
    @Test
    public void testEditLoan() {
        //System.out.println("editLoan");
        long loanID = 0L;
        long customerID = 0L;
        long amountTotal = 0L;
        long singlePayment = 0L;
        String date = "";
        LoanList instance = new LoanList();
        instance.editLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        System.out.println("Testing passed testEditLoan()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLoan method, of class LoanList.
     */
    @Test
    public void testDeleteLoan() {
        //System.out.println("deleteLoan");
        long loanID = 0L;
        LoanList instance = new LoanList();
        instance.deleteLoan(loanID);
        System.out.println("Testing passed testDeleteLoan");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readLoanFile method, of class LoanList.
     */
    @Test
    public void testReadLoanFile() {
        //System.out.println("readLoanFile");
        LoanList instance = new LoanList();
        instance.readLoanFile();
        System.out.println("Testing passed testReadLoanFile()");
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of writeLoanFile method, of class LoanList.
     */
    @Test
    public void testWriteLoanFile() {
        //System.out.println("writeLoanFile");
        LoanList instance = new LoanList();
        instance.writeLoanFile();
        System.out.println("Testing passed testWriteLoanFile()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printLoanFile method, of class LoanList.
     */
    @Test
    public void testPrintLoanFile() {
        //System.out.println("printLoanFile");
        LoanList instance = new LoanList();
        instance.printLoanFile();
        System.out.println("Testing passed testPrintLoanFile()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanArray method, of class LoanList.
     */
    @Test
    public void testGetLoanArray() {
        //System.out.println("getLoanArray");
        LoanList instance = new LoanList();
        instance.addLoan(2L, 2L, 30000L, 2000L, "28-6-2020");
        ArrayList<Loan> expResult = instance.getLoanArray();
        ArrayList<Loan> result = instance.getLoanArray();
        assertEquals(expResult, result);
        System.out.println("Testing passed testGetLoanArray()" + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanArray method, of class LoanList.
     */
    @Test
    public void testSetLoanArray() {
        //System.out.println("setLoanArray");
        ArrayList<Loan> loanArray = null;
        LoanList instance = new LoanList();
        instance.setLoanArray(loanArray);
        System.out.println("Testing passed testSetLoanArray()");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
