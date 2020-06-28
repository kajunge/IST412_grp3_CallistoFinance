
package Data;

import java.io.Serializable;

/**
 * This is the Loan details class. It has fields containing information
 * about the loan and getters/setters for these fields.
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class Loan implements Serializable{

    private long loanID;
    private long customerID;
    private long amountTotal;
    private long singlePayment;
    private String date;    //change to a proper date field once implementation is started
    
    /**
     * The loan constructor
     * @param loanID - a long representing the id in a loan profile
     * @param customerID - a long representing the customer id in a loan profile
     * @param amountTotal - a long representing the amount remaining in the current loan
     * @param singlePayment - a long representing the amount of a single payment in the current loan
     * @param date - the date that the loan is started/payment is made
     */
    protected Loan(long loanID, long customerID, long amountTotal, long singlePayment, String date){
    this.loanID = loanID;
    this.customerID = customerID;
    this.amountTotal = amountTotal;
    this.singlePayment = singlePayment;
    this.date = date;
    
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
     * returns the customer id
     * @return the customerID
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * sets the customer id
     * @param customerID the customerID to set
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }
    /**
     * Returns the total amount of the customer loan
     * @return A long representing the loan amount
     */
    public long getAmountTotal() {
        return amountTotal;
    }

    /**
     * Sets the total loan amount
     * @param amountTotal A long representing the total amount.
     */
    public void setAmountTotal(long amountTotal) {
        this.amountTotal = amountTotal;
    }

    /**
     * returns the value of a single payment
     * @return the singlePayment
     */
    public long getSinglePayment() {
        return singlePayment;
    }

    /**
     * sets the value of a single payment
     * @param singlePayment the singlePayment to set
     */
    public void setSinglePayment(long singlePayment) {
        this.singlePayment = singlePayment;
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
