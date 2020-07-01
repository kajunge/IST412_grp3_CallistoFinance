/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class RegisterCntlTest {
    
    public RegisterCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing RegisterCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of generateKey method, of class RegisterCntl.
     */
    @Test
    public void testGenerateKey() {
        RegisterCntl instance = new RegisterCntl();
        String expResult = "X3rt725cp9S2X";
        String result = instance.generateKey();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGenerateKey() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of sendEmail method, of class RegisterCntl.
     */
    @Test
    public void testSendEmail() {
        String userEmail = "IST412Team3@gmail.com";
        RegisterCntl instance = new RegisterCntl();
        instance.sendEmail(userEmail);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSendEmail()");
        System.out.println("*********************************");
    }

    /**
     * Test of verifyEmail method, of class RegisterCntl.
     */
    @Test
    public void testVerifyEmail() {
        String userEmail = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.verifyEmail(userEmail);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testVerifyEmail() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of isValidEmail method, of class RegisterCntl.
     */
    @Test
    public void testIsValidEmail() {
        String email = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidEmail(email);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsValidEmail() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of isValidPassword method, of class RegisterCntl.
     */
    @Test
    public void testIsValidPassword() {
        String password = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsValidPassword() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of isValidUsername method, of class RegisterCntl.
     */
    @Test
    public void testIsValidUsername() {
        String username = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testIsValidUsername() " + result);
        System.out.println("*********************************");
    }
    
}
