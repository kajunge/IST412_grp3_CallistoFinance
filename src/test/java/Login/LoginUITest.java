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
 */
public class LoginUITest {
    
    public LoginUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing LoginUITest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class LoginUI.
     */
    @Test
    public void testMain() {
        String[] args = null;
        LoginUI.main(args);
        System.out.println("*********************************");
        System.out.println("Testing Passed on testMain()");
        System.out.println("*********************************");
    }
    
}
