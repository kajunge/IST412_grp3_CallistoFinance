/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditCustomerInfo;

import Data.Customer;
import Data.CustomerList;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
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
        System.out.println("* EditCustomerInfoCntlTest: Before method setUpClass()");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("* EditCustomerInfoCntlTest: After method tearDownClass()");

    }

    /**
     * Test of updateEmail method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateEmail() {
        System.out.println("updateEmail");
        String email = "email@email.com";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateEmail(email);
        assertEquals(email, instance.getCustomer().getEmail());
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
        System.out.println("updatePassword");
        String password = "password";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatePassword(password);
        assertEquals(password, instance.getCustomer().getPassword());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updatefirstName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatefirstName() {
        System.out.println("updatefirstName");
        String firstName = "fName";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatefirstName(firstName);
        assertEquals(firstName, instance.getCustomer().getFirstName());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateLastName() {
        System.out.println("updateLastName");
        String lastName = "lName";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateLastName(lastName);
        assertEquals(lastName, instance.getCustomer().getLastName());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateAddress() {
        System.out.println("updateAddress");
        String address = "123 Main St.";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updateAddress(address);
        assertEquals(address, instance.getCustomer().getAddress());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhoneNumber method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatePhoneNumber() {
        System.out.println("updatePhoneNumber");
        String phoneNumber = "123-456-7890";
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl( new Customer("", "", 0, "", "", "", "", 0));
        instance.updatePhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getCustomer().getPhoneNumber());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Customer customer = new Customer("email@email.com", "password", 1234567890, "John", "Doe", "123 Main St.", "123-456-7890", 987654321);
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl(customer);
        Customer expResult = customer;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    /**
     * Test of setCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = new Customer("email@email.com", "password", 1234567890, "John", "Doe", "123 Main St.", "123-456-7890", 987654321);
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl();
        Customer expResult = customer;
        instance.setCustomer(customer);
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
