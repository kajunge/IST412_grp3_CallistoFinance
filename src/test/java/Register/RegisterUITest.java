/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

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
public class RegisterUITest {
    
    public RegisterUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing RegisterUITest  ****");
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

    /**
     * Test of main method, of class RegisterUI.
     */
    @Test
    public void testMain() {
    //    System.out.println("main");
        String[] args = null;
        RegisterUI.main(args);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testMain()");
        System.out.println("*********************************");
    }
    
}
