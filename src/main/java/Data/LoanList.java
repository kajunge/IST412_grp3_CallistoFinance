
package Data;

import java.util.ArrayList;

/**
 *
 * @author Chris Lefebvre
 */
public class LoanList {
    
    private ArrayList<Loan> loanArray;
    
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
