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
        System.out.println("\n*********************************");
        System.out.println("****   Testing CustomerTest  ****");
        System.out.println("*********************************");
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
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetEmail()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        String email = "kam6564@psu.edu";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetEmail() " + email);
        System.out.println("*********************************");
        instance.setEmail(email);
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetPassword() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        String password = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setPassword(password);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetPassword()" + password);
        System.out.println("*********************************");
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        long expResult = 2;
        long result = instance.getCustomerId();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetCustomerID()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    public void testSetCustomerId() {
        long customerId = 0L;
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setCustomerId(customerId);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCustomerId()" + customerId);
        System.out.println("*********************************");
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "Kristina";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetFirstName()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setFirstName method, of class Customer.
     */
    @Test
    public void testSetFirstName() {
        String firstName = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setFirstName(firstName);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetFirstName()" + firstName);
        System.out.println("*********************************");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "Mantha";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetLastName()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        String lastName = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setLastName(lastName);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetLastName()" + lastName);
        System.out.println("*********************************");
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "123 Main Street";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetAddress()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        String address = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setAddress(address);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetAddress()" + address);
    }

    /**
     * Test of getPhoneNumber method, of class Customer.
     */
    @Test
    public void testGetPhoneNumber() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        String expResult = "123-456-7889";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetPhoneNumber()" + result);
    }

    /**
     * Test of setPhoneNumber method, of class Customer.
     */
    @Test
    public void testSetPhoneNumber() {
        String phoneNumber = "";
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setPhoneNumber(phoneNumber);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetPhoneNumber()" + phoneNumber);
        System.out.println("*********************************");
    }

    /**
     * Test of getLoanID method, of class Customer.
     */
    @Test
    public void testGetLoanID() {
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        long expResult = 2;
        long result = instance.getLoanID();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetLoanID()" + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setLoanID method, of class Customer.
     */
    @Test
    public void testSetLoanID() {
        long loanID = 0L;
        Customer instance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7889", 2);
        instance.setLoanID(loanID);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetLoanID()" + loanID);
        System.out.println("*********************************");
    }
    
}
