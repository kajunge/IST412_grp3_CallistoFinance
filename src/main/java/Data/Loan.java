/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author cjani
 */
public class Loan {

    private String loanID;
    private String amount;
    private String date;    //change to a proper data field
    
    private Loan(String loanID, String amount, String date){
    this.amount = amount;
    this.date = date;
    this.loanID = loanID;
}

    
}
