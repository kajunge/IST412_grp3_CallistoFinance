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
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of generateKey method, of class RegisterCntl.
     */
    @Test
    public void testGenerateKey() {
        //System.out.println("generateKey");
        RegisterCntl instance = new RegisterCntl();
        String expResult = "X3rt725cp9S2X";
        String result = instance.generateKey();
        assertEquals(expResult, result);
        System.out.println("Testing passed testGenerateKey() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmail method, of class RegisterCntl.
     */
    @Test
    public void testSendEmail() {
        //System.out.println("sendEmail");
        String userEmail = "IST412Team3@gmail.com";
        RegisterCntl instance = new RegisterCntl();
        instance.sendEmail(userEmail);
        System.out.println("Testing passed testSendEmail");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verifyEmail method, of class RegisterCntl.
     */
    @Test
    public void testVerifyEmail() {
        //System.out.println("verifyEmail");
        String userEmail = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.verifyEmail(userEmail);
        assertEquals(expResult, result);
        System.out.println("Testing passed testVerifyEmail " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidEmail method, of class RegisterCntl.
     */
    @Test
    public void testIsValidEmail() {
        //System.out.println("isValidEmail");
        String email = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidEmail(email);
        assertEquals(expResult, result);
        System.out.println("Testing passed testIsValidEmail() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method, of class RegisterCntl.
     */
    @Test
    public void testIsValidPassword() {
        //System.out.println("isValidPassword");
        String password = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
        assertEquals(expResult, result);
        System.out.println("Testing passed testIsValidPassword() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsername method, of class RegisterCntl.
     */
    @Test
    public void testIsValidUsername() {
        //System.out.println("isValidUsername");
        String username = "";
        RegisterCntl instance = new RegisterCntl();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
        assertEquals(expResult, result);
        System.out.println("Testing passed testIsValidUsername() " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
