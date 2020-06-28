/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isValidPassword method, of class LoginCntl.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String[] passwords = {"", " ", "pass"};
        LoginCntl instance = new LoginCntl();
        boolean expResult = false;
        boolean result;
        for(String pass : passwords){
            result = instance.isValidPassword(pass);
            System.out.println(pass + ": ");
            assertEquals(expResult, result);
        }
        result = instance.isValidPassword("password");
        System.out.println("password: ");
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testIsValidUsername(){
        System.out.println("isValidUsername");
        String[] usernames = {"", " ", "me"};
        LoginCntl instance = new LoginCntl();
        boolean expResult = false;
        boolean result;
        for(String user : usernames){
            result = instance.isValidPassword(user);
            System.out.println(user + ": ");
            assertEquals(expResult, result);
        }
        result = instance.isValidPassword("user");
        System.out.println("user: ");
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
