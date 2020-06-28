/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author Chris Lefebvre
 * @author kristinamantha
 */
public class CustomerTest implements Serializable{
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("* CustomerTest: testGetEmail()");
        System.out.println("getEmail");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "kam6564@psu.edu";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "kam6564@psu.edu";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        System.out.println("Testing: this is the testSetEmail " + email);
        instance.setEmail(email);
        
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetPassword" + result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setPassword(password);
        System.out.println("Testing: this is the testSetPassword");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        long expResult = 2;
        long result = instance.getCustomerId();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetCustomerID");
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        long customerId = 0L;
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setCustomerId(customerId);
        System.out.println("Testing: this is the testSet");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "Kristina";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetFirstName");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Customer.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setFirstName(firstName);
        System.out.println("Testing: this is the testSetFirstName");
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "Mantha";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetLastName");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setLastName(lastName);
        System.out.println("Testing: this is the testSetLastName");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "123 Main Street";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetAddress");
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setAddress(address);
        System.out.println("Testing: this is the testSetAddress");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Customer.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "123-456-7889";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetPhoneNumber");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Customer.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setPhoneNumber(phoneNumber);
        System.out.println("Testing: this is the testSetPhoneNumber");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanID method, of class Customer.
     */
    @Test
    public void testGetLoanID() {
        System.out.println("getLoanID");
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        long expResult = 2;
        long result = instance.getLoanID();
        assertEquals(expResult, result);
        System.out.println("Testing: this is the testGetLoanID");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanID method, of class Customer.
     */
    @Test
    public void testSetLoanID() {
        System.out.println("setLoanID");
        long loanID = 0L;
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setLoanID(loanID);
        System.out.println("Testing: this is the testSetLoanID");
        //fail("The test case is a prototype.");
    }
    
}
