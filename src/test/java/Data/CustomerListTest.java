/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
 */
public class CustomerListTest {
    
    
    public CustomerListTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing CustomerListTest  ****");
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
     * Test of addCustomer method, of class CustomerList.
     */
    @Test
    public void testAddCustomer() {
        String email = "";
        String password = "";
        long customerId = 1L;
        String firstName = "";
        String lastName = "";
        String address = "";
        String phoneNumber = "";
        long loanID = 1L;
        CustomerList instance = new CustomerList();
        instance.addCustomer("kam6564@psu.edu", "password", 2, "Kristina ", "Mantha", "123 Main Street", "123-456-7880", 2);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testAddCustomer()");
        System.out.println("*********************************");
    }

    /**
     * Test of editCustomer method, of class CustomerList.
     */
    @Test
    public void testEditCustomer() {
        String email = "";
        String password = "";
        long customerId = 1L;
        String firstName = "";
        String lastName = "";
        String address = "";
        String phoneNumber = "";
        long loanID = 1L;
        CustomerList instance = new CustomerList();
        instance.editCustomer("kam6564@psu.edu", "password", 2, "Kristina New", "Mantha", "123 Main Street", "123-456-7880", 2);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testEditCustomer()");
        System.out.println("*********************************");
        
    }

    /**
     * Test of deleteCustomer method, of class CustomerList.
     */
    @Test
    public void testDeleteCustomer() {
        long customerID = 0L;
        CustomerList instance = new CustomerList();
        instance.deleteCustomer(customerID);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testDeleteCustomer()");
        System.out.println("*********************************");
      
    }

    /**
     * Test of readCustomerFile method, of class CustomerList.
     */
    @Test
    public void testReadCustomerFile() {
        CustomerList instance = new CustomerList();
        instance.readCustomerFile();
        System.out.println("*********************************");
        System.out.println("Testing Passed for testReadCustomerFile()");
        System.out.println("*********************************");
      
    }

    /**
     * Test of writeCustomerFile method, of class CustomerList.
     */
    @Test
    public void testWriteCustomerFile() {
        CustomerList instance = new CustomerList();
        instance.writeCustomerFile();
        System.out.println("*********************************");
        System.out.println("Testing Passed for testWriteCustomerFile()");
        System.out.println("*********************************");
    }

    /**
     * Test of printCustomerFile method, of class CustomerList.
     */
    @Test
    public void testPrintCustomerFile() {
        CustomerList instance = new CustomerList();
        instance.printCustomerFile();
        System.out.println("*********************************");
        System.out.println("Testing Passed for testPrintCustomerFile()");
        System.out.println("*********************************");
    }

    /**
     * Test of getCustomerArray method, of class CustomerList.
     */
    @Test
    public void testGetCustomerArray() {    
        CustomerList instance = new CustomerList();
        instance.addCustomer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7880", 2);
        ArrayList<Customer> expResult = instance.getCustomerArray();
        ArrayList<Customer> result = instance.getCustomerArray();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetCustomerArray()");
        System.out.println("*********************************");
    }

    /**
     * Test of setCustomerArray method, of class CustomerList.
     */
    @Test
    public void testSetCustomerArray() {
        ArrayList<Customer> customerArray = null;
        CustomerList instance = new CustomerList();
        instance.setCustomerArray(customerArray);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetCustomerArray()");
        System.out.println("*********************************");
    }
    
}
