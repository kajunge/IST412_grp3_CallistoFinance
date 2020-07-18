/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditCustomerInfo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kristinamantha
 */
public class EditCustomerInfoUITest {
    
    public EditCustomerInfoUITest() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing EditCustomerInfoCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    @Test
    public void testSomeMethod() {
        System.out.println("\n*********************************");
        System.out.println("Testing Passed on testSomeMethod()");
        System.out.println("*********************************");
    }
    
    @Test
    public void testLastNameTextFieldError(){
        String str = "Fr@nk99";
        
    }

    /**
     * Test of main method, of class EditCustomerInfoUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EditCustomerInfoUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
