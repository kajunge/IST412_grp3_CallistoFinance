/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kristinamantha
 */
public class CustomerListTest {
    
    public CustomerListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class CustomerList.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String email = "";
        String password = "";
        long customerId = 0L;
        String firstName = "";
        String lastName = "";
        String address = "";
        String phoneNumber = "";
        long loanID = 0L;
        CustomerList instance = new CustomerList();
        instance.addCustomer(email, password, customerId, firstName, lastName, address, phoneNumber, loanID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCustomer method, of class CustomerList.
     */
    @Test
    public void testEditCustomer() {
        System.out.println("editCustomer");
        String email = "";
        String password = "";
        long customerId = 0L;
        String firstName = "";
        String lastName = "";
        String address = "";
        String phoneNumber = "";
        long loanID = 0L;
        CustomerList instance = new CustomerList();
        instance.editCustomer(email, password, customerId, firstName, lastName, address, phoneNumber, loanID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerList.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        long customerID = 0L;
        CustomerList instance = new CustomerList();
        instance.deleteCustomer(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readCustomerFile method, of class CustomerList.
     */
    @Test
    public void testReadCustomerFile() {
        System.out.println("readCustomerFile");
        CustomerList instance = new CustomerList();
        instance.readCustomerFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeCustomerFile method, of class CustomerList.
     */
    @Test
    public void testWriteCustomerFile() {
        System.out.println("writeCustomerFile");
        CustomerList instance = new CustomerList();
        instance.writeCustomerFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCustomerFile method, of class CustomerList.
     */
    @Test
    public void testPrintCustomerFile() {
        System.out.println("printCustomerFile");
        CustomerList instance = new CustomerList();
        instance.printCustomerFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerArray method, of class CustomerList.
     */
    @Test
    public void testGetCustomerArray() {
        System.out.println("getCustomerArray");
        CustomerList instance = new CustomerList();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomerArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerArray method, of class CustomerList.
     */
    @Test
    public void testSetCustomerArray() {
        System.out.println("setCustomerArray");
        ArrayList<Customer> customerArray = null;
        CustomerList instance = new CustomerList();
        instance.setCustomerArray(customerArray);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
