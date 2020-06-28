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
@Suite.SuiteClasses({Payment.PaymentSuite.class, LiveChat.LiveChatSuite.class, LoanBalance.LoanBalanceSuite.class, EditCustomerInfo.EditCustomerInfoSuite.class, LoanApplication.LoanApplicationSuite.class, Register.RegisterSuite.class, Data.DataSuite.class, Login.LoginSuite.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
