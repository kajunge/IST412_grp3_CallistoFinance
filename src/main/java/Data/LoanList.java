
package Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * This is the Loan List class.
 * @author Chris Lefebvre
 */
public class LoanList {
    
    private ArrayList<Loan> loanArray;
    
    private String loanFile = "src/SerFiles/Loan.ser";
    /**
     *Constructor for LoanList
     */
    public LoanList(){
        
    }
    
    /**
     * Creates a loan profile based on the inputs data and adds it to the loanArray
     * @param loanID - a long representing the load id in a loan profile
     * @param customerID - a long representing the customer id in a loan profile
     * @param amountTotal - a long representing the total amount of the loan in the loan profile
     * @param singlePayment - a long representing the amount payed in a single transaction
     * @param date - the date the loan was created or a payment made
     */
    public void addLoan(long loanID, long customerID, long amountTotal, long singlePayment, String date){
        
    }
    
    /**
     * Edits a loan profile based on the inputs data and adds it to the loanArray
     * @param loanID - a long representing the load id in a loan profile
     * @param customerID - a long representing the customer id in a loan profile
     * @param amountTotal - a long representing the total amount of the loan in the loan profile
     * @param singlePayment - a long representing the amount payed in a single transaction
     * @param date - the date the loan was created or a payment made
     */
    public void editLoan(long loanID, long customerID, long amountTotal, long singlePayment, String date){
        
    }
    
    /**
     * Deletes a loan from the loanArray
     * @param loanID A long representing the loan id number.
     */
    public void deleteLoan(long loanID){
        getLoanArray().remove(loanID);
    }
    
    /**
     *Reads the (persistent) loan File
     */
    public void readCustomerFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(loanFile);
            in = new ObjectInputStream(fis);
            setLoanArray((ArrayList<Loan>) in.readObject());          //needs a serialVersionUID, will reaserch this
            in.close();

            if (!loanArray.isEmpty()) {
                //System.out.println("There are Parents on the list");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * writes the current loan array to the loan file (persistent)
     */
    
    public void writeLoanFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;

        try {
            fos = new FileOutputStream(loanFile);
            out = new ObjectOutputStream(fos);
            out.writeObject(getLoanArray());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * prints the loan file (primarily for debugging
     */
    public void printLoanFile() {
        System.out.println("The Loan List has these Loans");
        for (int i = 0; i < getLoanArray().size(); i++) {
            Loan currentLoan = (Loan) getLoanArray().get(i);
            System.out.println(currentLoan.toString());
        }
    }
    //==========================================================================
    //Getter and Setters
    //==========================================================================
    /**
     * @return the loanArray
     */
    public ArrayList<Loan> getLoanArray() {
        return loanArray;
    }

    /**
     * @param loanArray the loanArray to set
     */
    public void setLoanArray(ArrayList<Loan> loanArray) {
        this.loanArray = loanArray;
    }
}
