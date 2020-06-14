
package Data;

/**
 *
 * @author cjani
 * @author kristinamantha
 */
public class Loan {

    private long loanID;
    private long amount;
    private String date;    //change to a proper data field
    
    /**
     * The loan constructor
     * @param loanID
     * @param amount
     * @param date 
     */
    private Loan(long loanID, long amount, String date){
    this.amount = amount;
    this.date = date;
    this.loanID = loanID;
}

    /**
     * Returns the loan id 
     * @return A long representing the customer's loan id number
     */
    public long getLoanID() {
        return loanID;
    }

    /**
     * Sets the customer's loan id number
     * @param loanID the loanID to set
     */
    public void setLoanID(long loanID) {
        this.loanID = loanID;
    }

    /**
     * Returns the amount of the customer loan
     * @return A long representing the loan amount
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the loan amount
     * @param amount the amount to set
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    /**
     * Returns the date
     * @return A String representing the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    
}
