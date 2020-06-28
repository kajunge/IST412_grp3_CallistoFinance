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
 * @author Chris Lefebvre
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
     //   System.out.println("addCustomer");
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
        System.out.println("Testing passed testAddCustomer()");
    }

    /**
     * Test of editCustomer method, of class CustomerList.
     */
    @Test
    public void testEditCustomer() {
    //    System.out.println("addCustomer");
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
        System.out.println("Testing passed testEditCustomer()");
        //System.out.println("");
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerList.
     */
    @Test
    public void testDeleteCustomer() {
    //    System.out.println("deleteCustomer");
        long customerID = 0L;
        CustomerList instance = new CustomerList();
        instance.deleteCustomer(customerID);
        System.out.println("Testing passed testDeleteCustomer()");
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readCustomerFile method, of class CustomerList.
     */
    @Test
    public void testReadCustomerFile() {
    //    System.out.println("readCustomerFile");
        CustomerList instance = new CustomerList();
        instance.readCustomerFile();
        System.out.println("Testing passed testReadCustomerFile()");
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of writeCustomerFile method, of class CustomerList.
     */
    @Test
    public void testWriteCustomerFile() {
    //    System.out.println("writeCustomerFile");
        CustomerList instance = new CustomerList();
        instance.writeCustomerFile();
        System.out.println("Testing passed testWriteCustomerFile()");

        //fail("The test case is a prototype.");
    }

    /**
     * Test of printCustomerFile method, of class CustomerList.
     */
    @Test
    public void testPrintCustomerFile() {
    //    System.out.println("printCustomerFile");
        CustomerList instance = new CustomerList();
        instance.printCustomerFile();
        System.out.println("Testing passed testPrintCustomerFile()");
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerArray method, of class CustomerList.
     */
    @Test
    public void testGetCustomerArray() {
    //    System.out.println("getCustomerArray");
    
        CustomerList instance = new CustomerList();
        instance.addCustomer("kam6564@psu.edu", "password", 2, "Kristina", "Mantha", "123 Main Street", "123-456-7880", 2);
        ArrayList<Customer> expResult = instance.getCustomerArray();
        ArrayList<Customer> result = instance.getCustomerArray();
        assertEquals(expResult, result);
        System.out.println("Testing passed testGetCustomerArray()" + result.toString());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerArray method, of class CustomerList.
     */
    @Test
    public void testSetCustomerArray() {
    //    System.out.println("setCustomerArray");
        ArrayList<Customer> customerArray = null;
        CustomerList instance = new CustomerList();
        instance.setCustomerArray(customerArray);
        System.out.println("Testing passed testSetCustomerArray()");
       // fail("The test case is a prototype.");
    }
    
}
