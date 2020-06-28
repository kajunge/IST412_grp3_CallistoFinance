/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import org.junit.AfterClass;
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

        System.out.println("This is the CustomerListTest");
          // fail("The test case is a prototype.");
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
        System.out.println("This the the testEditCustomer");
       // fail("The test case is a prototype.");
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
        System.out.println("this is the testDeleteCustomer");
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readCustomerFile method, of class CustomerList.
     */
    @Test
    public void testReadCustomerFile() {
        System.out.println("readCustomerFile");
        CustomerList instance = new CustomerList();
        instance.readCustomerFile();
        System.out.println("this is the testReadCustomerFile");
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of writeCustomerFile method, of class CustomerList.
     */
    @Test
    public void testWriteCustomerFile() {
        System.out.println("writeCustomerFile");
        CustomerList instance = new CustomerList();
        instance.writeCustomerFile();
        System.out.println("this is the testWriteCustomerFile");

        //fail("The test case is a prototype.");
    }

    /**
     * Test of printCustomerFile method, of class CustomerList.
     */
    @Test
    public void testPrintCustomerFile() {
        System.out.println("printCustomerFile");
        CustomerList instance = new CustomerList();
        instance.printCustomerFile();
        System.out.println("this is the testPrintCustomerFile");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerArray method, of class CustomerList.
     */
    @Test
    public void testGetCustomerArray() {
        System.out.println("getCustomerArray");
    
        CustomerList instance = new CustomerList();
        instance.addCustomer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7880", 2);
        ArrayList<Customer> expResult = instance.getCustomerArray();
        ArrayList<Customer> result = instance.getCustomerArray();
        assertEquals(expResult, result);
        System.out.println("this is the testGetCustomerArray");
        //fail("The test case is a prototype.");
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
        System.out.println("this is the testSetCustomerArray");
       // fail("The test case is a prototype.");
    }
    
}
