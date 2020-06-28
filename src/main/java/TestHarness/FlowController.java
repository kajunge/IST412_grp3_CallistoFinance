/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHarness;

/**
 *
 * @author Chris Lefebvre
 */
public class FlowController {
    
    public FlowController(){
        
        DataTest dataTest = new DataTest();
        RegisterTest registerTest = new RegisterTest();
        LoginTest loginTest = new LoginTest();
        ApplicationTest applicationTest = new ApplicationTest();
        BalanceTest balanceTest = new BalanceTest();
        PaymentTest paymentTest = new PaymentTest();
        
        EditTest editTest = new EditTest();
        ChatTest chatTest = new ChatTest();       
        
    }
    
}
