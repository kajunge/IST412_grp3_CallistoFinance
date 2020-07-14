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

import java.security.PublicKey;
import com.groupdocs.signature.Signature;
import com.groupdocs.signature.domain.SignatureFont;
import com.groupdocs.signature.domain.enums.TextSignatureImplementation;
import com.groupdocs.signature.options.sign.TextSignOptions;
import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

/**
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class LoanApplicationCntlTest {
    
    public LoanApplicationCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing LoanApplicationCntlTest  ****");
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
     * Test of pdfCreator method, of class LoanApplicationCntl.
     */
    @Test
    public void testPdfCreator() {
        long id = 0L;
        String firstName = "firstName";
        String lastName = "lastName";
        long loanAmount = 30000L;
        double interest = 0.05;
        LoanApplicationCntl instance = new LoanApplicationCntl();
        String pdfName = (String.valueOf(id) + lastName + firstName);
         
        PDDocument expResult = new PDDocument();
       // String expResult = "";
        try{                   
            PDPage my_page = new PDPage();
            expResult.addPage(my_page);            
            
            //Saving the document
            expResult.save("src/main/resources/OutputFilesTest/" + pdfName + ".pdf");
            System.out.println("PDF created");

            //Closing the document
            expResult.close();
        }catch(IOException e){            
        }         

        //PDDocument result = instance.pdfCreator(id, firstName, lastName, loanAmount, interest);
        PDDocument result = instance.pdfCreator(id, firstName, lastName, loanAmount, interest);
        assertEquals(expResult.getDocumentId(), result.getDocumentId());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testPdfCreator()");
        System.out.println("*********************************");
    }

    /**
     * Test of electronicSignature method, of class LoanApplicationCntl.
     */
    @Test
    @Ignore
    public void testElectronicSignature() {
        //System.out.println("electronicSignature");
        String pdfName = "src/main/resources/OutputFilesTest/my_doc.pdf";
        LoanApplicationCntl instance = new LoanApplicationCntl();
        instance.electronicSignature(pdfName);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testElectronicSignatre()");
        System.out.println("*********************************");
    }
    
}
