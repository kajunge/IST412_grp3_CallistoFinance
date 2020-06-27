
package LoanBalance;

import java.util.Date;
import Data.Customer;
/**
 * This is the Loan Balance Controller Class. This provides methods to display payment 
 * and balance information about a loan.
 * @author cjani
 * @author kristinamantha
 */
public class BalanceCntl {
    
     private Customer customer;
     
    public BalanceCntl(Customer customer){
        this.customer = customer;
    }
    
    /**
     * A method to calculate compound interest
     * @param p An int representing the principle amount.
     * @param t An int representing the amount of time money is borrowed for.
     * @param r A double representing the annual interest rate.
     * @param n An in representing the number of times that interest is compounded per unit t.
     * @return Returns a double representing the compounded interest over time.
     */
    public double calculateInterest(int p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r/n), n * t);
        double cinterest = amount - p;
        return cinterest;
    }
    
    /**
     * A method to show customer payment history
     * @param payment A double showing the payment.
     * @param date A Date showing when the payment was made.
     * @return returns a double representing thh payment
     */
    public String PaymentHistory(double payment, Date date){
        String payment_information;
        payment_information = "Payment: " + payment + ", Date: " + date;
        return payment_information;
    }
    
}
