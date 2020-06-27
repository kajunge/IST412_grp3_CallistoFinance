
package LoanApplication;

import java.security.PublicKey;
import com.groupdocs.signature.Signature;


/**
 * This is the Loan Application Controller. It is used to handle
 * new loan applications and electronic signatures.
 * @author cjani
 * @author kristinamantha
 * 
 * 
 * @api - https://products.groupdocs.com/signature/java
 * @api download/pom code - https://downloads.groupdocs.com/signature/java
 */
public class LoanApplicationCntl {
    
    /**
     * Initial LoanApplicationCntl constructor.
     */
    public LoanApplicationCntl(){
        
    }
    /**
     * A method to create a pdf and then add the inputted fields to the document
     * @param id - represents the user id
     * @param firstName - a String representing the user's first name
     * @param lastName - a String representing the user's Last name
     * @param loanAmount - a double representing the loan amount
     * @param interest - a double representing the loan interest
     */
    public void pdfCreator(long id, String firstName, String lastName, double loanAmount, double interest){
        
    }
    
    /**
     * A method to initialize the signature object, preparing it to verify a signature.
     * @return - return type will vary depending on future implemntation (most likely a pdf)
     * //@param publicKey A PublicKey for thee users electronic signature.
     * @param pdfName - A String representing the name of the pdf file that the user signs
     */
    public final void electronicSignature(String pdfName){
//        Signature signature = new Signature("sample.pdf");
//
//        TextSignOptions options = new TextSignOptions("John Smith");
//        // set signature position
//        options.setLeft(100);
//        options.setTop(100);
//
//        // set signature rectangle
//        options.setWidth(100);
//        options.setHeight(30);
//
//        // set text color and Font
//        options.setForeColor(Color.RED);
//        SignatureFont signatureFont = new SignatureFont();
//        signatureFont.setSize(12);
//        signatureFont.setFamilyName("Comic Sans MS");
//        options.setFont(signatureFont);
//        options.setSignatureImplementation(TextSignatureImplementation.Sticker)
//
//        // sign document to file
//        signature.sign("sample_signed.pdf", options);
       
    }
}
