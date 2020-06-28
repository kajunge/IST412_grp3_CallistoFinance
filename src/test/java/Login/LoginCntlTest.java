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
        System.out.println("\n*********************************");
        System.out.println("****   Testing LoginCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isValidPassword method, of class LoginCntl.
     */
    @Test
    public void testIsValidPassword() {
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
        assertEquals(true, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsValidPassword()");
        System.out.println("*********************************");
    }
    
    public void testIsValidUsername(){
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
        assertEquals(true, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsValidUsername()");
        System.out.println("*********************************");
    }
    
}
