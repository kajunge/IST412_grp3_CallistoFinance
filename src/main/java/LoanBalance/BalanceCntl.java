
package LoanBalance;

import java.util.Date;

/**
 *
 * @author cjani
 * @author kristinamantha
 */
public class BalanceCntl {
    
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
     */
    public void PaymentHistory(double payment, Date date){
        
    }
    
}
