/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoanApplication;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristinamantha
 */
public class LoanApplicationCntlTest {
    
    public LoanApplicationCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of pdfCreator method, of class LoanApplicationCntl.
     */
    @Test
    public void testPdfCreator() {
        System.out.println("pdfCreator");
        long id = 0L;
        String firstName = "";
        String lastName = "";
        double loanAmount = 0.0;
        double interest = 0.0;
        LoanApplicationCntl instance = new LoanApplicationCntl();
        PDDocument expResult = null;
        PDDocument result = instance.pdfCreator(id, firstName, lastName, loanAmount, interest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of electronicSignature method, of class LoanApplicationCntl.
     */
    @Test
    public void testElectronicSignature() {
        System.out.println("electronicSignature");
        String pdfName = "";
        LoanApplicationCntl instance = new LoanApplicationCntl();
        instance.electronicSignature(pdfName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
