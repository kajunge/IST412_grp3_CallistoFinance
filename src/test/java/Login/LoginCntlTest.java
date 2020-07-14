/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kristinamantha
 * @author Scott Crowthers
 */
public class LoginCntlTest {
    
    public LoginCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing LoginCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

//    /**
//     * Test of isValidPassword method, of class LoginCntl.
//     */
//    @Test
//    public void testIsValidPassword() {
//        String[] passwords = {"", " ", "pass"};
//        LoginCntl instance = new LoginCntl();
//        boolean expResult = false;
//        boolean result;
//        for(String pass : passwords){
//            result = instance.isValidPassword(pass);
//            System.out.println(pass + ": ");
//            assertEquals(expResult, result);
//        }
//        result = instance.isValidPassword("password");
//        assertEquals(true, result);
//        System.out.println("*********************************");
//        System.out.println("Testing Passed for testIsValidPassword()");
//        System.out.println("*********************************");
//    }
//    
//    public void testIsValidUsername(){
//        String[] usernames = {"", " ", "me"};
//        LoginCntl instance = new LoginCntl();
//        boolean expResult = false;
//        boolean result;
//        for(String user : usernames){
//            result = instance.isValidPassword(user);
//            System.out.println(user + ": ");
//            assertEquals(expResult, result);
//        }
//        result = instance.isValidPassword("user");
//        assertEquals(true, result);
//        System.out.println("*********************************");
//        System.out.println("Testing Passed for testIsValidUsername()");
//        System.out.println("*********************************");
//    }

    /**
     * Test of authenticator method, of class LoginCntl.
     */
    @Test
    public void testAuthenticator() {
        System.out.println("authenticator");
        String userEmail = "";
        String password = "";
        LoginCntl instance = new LoginCntl();
        boolean expResult = false;
        boolean result = instance.authenticator(userEmail, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forgottenPassword method, of class LoginCntl.
     */
    @Test
    public void testForgottenPassword() {
        System.out.println("forgottenPassword");
        String userEmail = "";
        LoginCntl instance = new LoginCntl();
        instance.forgottenPassword(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forgottenEmail method, of class LoginCntl.
     */
    @Test
    public void testForgottenEmail() {
        System.out.println("forgottenEmail");
        String securityQuestionResponse = "";
        int ssNum = 0;
        LoginCntl instance = new LoginCntl();
        instance.forgottenEmail(securityQuestionResponse, ssNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
