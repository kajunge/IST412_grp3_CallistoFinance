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

/**
 * @author Chris Lefebvre
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
        //System.out.println("pdfCreator");
        long id = 0L;
        String firstName = "";
        String lastName = "";
        double loanAmount = 0.0;
        double interest = 0.0;
        LoanApplicationCntl instance = new LoanApplicationCntl();
        
        PDDocument expResult = new PDDocument();
       // String expResult = "";
        try{                   
            PDPage my_page = new PDPage();
            expResult.addPage(my_page);            
            
            //Saving the document
            expResult.save("src/main/resources/OutputFilesTest/my_doc.pdf");
            System.out.println("PDF created");

            //Closing the document
            expResult.close();
        }catch(IOException e){            
        }         

        //PDDocument result = instance.pdfCreator(id, firstName, lastName, loanAmount, interest);
        PDDocument result = instance.pdfCreator(id, firstName, lastName, loanAmount, interest);
        assertEquals(expResult.getDocumentId(), result.getDocumentId());
        System.out.println("Testing Passed testPdfCreator()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of electronicSignature method, of class LoanApplicationCntl.
     */
    @Test
    public void testElectronicSignature() {
        //System.out.println("electronicSignature");
        String pdfName = "src/main/resources/OutputFilesTest/my_doc.pdf";
        LoanApplicationCntl instance = new LoanApplicationCntl();
        instance.electronicSignature(pdfName);
        System.out.println("Testing Passed testElectronicSignatre()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
