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
@Suite.SuiteClasses({Data.DataSuite.class,  Register.RegisterSuite.class,  Login.LoginSuite.class,
    LoanApplication.LoanApplicationSuite.class, LoanBalance.LoanBalanceSuite.class, 
    Payment.PaymentSuite.class, EditCustomerInfo.EditCustomerInfoSuite.class,LiveChat.LiveChatSuite.class})
public class TestHarness {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
