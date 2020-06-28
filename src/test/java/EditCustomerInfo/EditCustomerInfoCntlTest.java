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
        String password = "";
        EditCustomerInfoCntl instance = null;
        instance.updatePassword(password);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updatefirstName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatefirstName() {
        System.out.println("updatefirstName");
        String firstName = "";
        EditCustomerInfoCntl instance = null;
        instance.updatefirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastName method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateLastName() {
        System.out.println("updateLastName");
        String lastName = "";
        EditCustomerInfoCntl instance = null;
        instance.updateLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdateAddress() {
        System.out.println("updateAddress");
        String address = "";
        EditCustomerInfoCntl instance = null;
        instance.updateAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhoneNumber method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testUpdatePhoneNumber() {
        System.out.println("updatePhoneNumber");
        String phoneNumber = "";
        EditCustomerInfoCntl instance = null;
        instance.updatePhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class EditCustomerInfoCntl.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        EditCustomerInfoCntl instance = new EditCustomerInfoCntl();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
