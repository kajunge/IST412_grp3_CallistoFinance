/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kristinamantha
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Register.RegisterSuite.class, Login.LoginSuite.class, Data.DataSuite.class,
    LoanApplication.LoanApplicationSuite.class, LoanBalance.LoanBalanceSuite.class, 
    Payment.PaymentSuite.class, EditCustomerInfo.EditCustomerInfoSuite.class,LiveChat.LiveChatSuite.class})
public class TestHarness {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Running modules in the following order for testing"
                + " purposes: Register -> Login -> Data -> Loan Application "
                + "Loan Balance -> Payment -> Edit Customer Information ->"
                + " LiveChat.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
