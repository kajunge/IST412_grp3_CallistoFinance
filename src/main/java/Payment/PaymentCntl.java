
package Payment;

import java.util.Date;

/**
 *
 * @author cjani
 * @author kristinamantha
 * This is the Payment Controller class
 */
public class PaymentCntl {
    
    private double amountDue;
    private Date dueDate;
    
    /**
     * This is a method to make a payment
     * @param payment A Double representing the amount to be paid
     */
    public void makePayment(double payment){
        
    }
    
    /**
     * A method that returns true/false depending on whether payment is late.
     * @return A boolean state representing late payment.
     */
    public boolean isLate(){
        return false;
    }
}
