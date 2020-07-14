/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditCustomerInfo;

import Data.Customer;
import Data.CustomerList;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Chris Lefebvre
 * @author kristinamantha
 * @author Scott Crowthers
 */
public class EditCustomerInfoCntlTest {

    EditCustomerInfoCntl editCustomerInfoCntlInstance;
    Customer customerInstance;

    public EditCustomerInfoCntlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing EditCustomerInfoCntlTest  ****");
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
     * Test of updateEmail method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateEmail() {
        String email = "email@email.com";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateEmail(email);
        assertEquals(email, instance.getCustomer().getEmail());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdateEmail()");
        System.out.println("*********************************");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
      /*  
        editCustomerInfoCntlInstance = new EditCustomerInfoCntl();
        
        customerInstance = new Customer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7880", 2);
        
        String email = "kam6564@gmail.com";
        String newEmail = "kristina@gmail.com";
        editCustomerInfoCntlInstance.getCustomer().setEmail(email);
       // editCustomerInfoCntlInstance.updateEmail(newEmail);
        //  EditCustomerInfoCntl instance = null;
        //  instance.updateEmail(email);
        //editCustomerInfoCntlInstance = null;

        // fail("The test case is a prototype.");*/
    }

    /**
     * Test of updatePassword method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatePassword() {
        String password = "password";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatePassword(password);
        assertEquals(password, instance.getCustomer().getPassword());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdatePassword()");
        System.out.println("*********************************");
    }

    /**
     * Test of updatefirstName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatefirstName() {
        String firstName = "fName";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatefirstName(firstName);
        assertEquals(firstName, instance.getCustomer().getFirstName());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdatefirstName()");
        System.out.println("*********************************");
    }

    /**
     * Test of updateLastName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateLastName() {
        String lastName = "lName";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateLastName(lastName);
        assertEquals(lastName, instance.getCustomer().getLastName());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdateLastName");
        System.out.println("*********************************");
    }

    /**
     * Test of updateAddress method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateAddress() {
        String address = "123 Main St.";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateAddress(address);
        assertEquals(address, instance.getCustomer().getAddress());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdateAddress() ");
        System.out.println("*********************************");
    }

    /**
     * Test of updatePhoneNumber method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatePhoneNumber() {
        String phoneNumber = "123-456-7890";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatePhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getCustomer().getPhoneNumber());
        System.out.println("*********************************");
        System.out.println("Testing Passed for testUpdatePhoneNumber()");
        System.out.println("*********************************");
    }

    /**
     * Test of getCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testGetCustomer() {
        Customer customer = new Customer("email@email.com", "password", 1234567890, "John", "Doe", "123 Main St.", "123-456-7890", 987654321);
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl(customer);
        Customer expResult = customer;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetCustomer()");
        System.out.println("*********************************");
    }

    /**
     * Test of setCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testSetCustomer() {
        Customer customer = new Customer("email@email.com", "password", 1234567890, "John", "Doe", "123 Main St.", "123-456-7890", 987654321);
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl();
        Customer expResult = customer;
        instance.setCustomer(customer);
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCustomer()");
        System.out.println("*********************************");
    }

}
