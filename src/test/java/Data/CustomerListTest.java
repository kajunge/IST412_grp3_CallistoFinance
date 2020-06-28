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
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class CustomerListTest {
    
    //private ArrayList<Customer> customerArray;
    
    public CustomerListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //customerArray = new ArrayList<Customer>();
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
        String email = "IST412Team3@gmail.com";
        String password = "Password";
        long customerId = 1L;
        String firstName = "Chris";
        String lastName = "Lefebvre";
        String address = "123 Main St";
        String phoneNumber = "123-456-7890";
        long loanID = 1L;
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
        String email = "NotIST412Team3@gmail.com";
        String password = "NotPassword";
        long customerId = 2L;
        String firstName = "Kristina";
        String lastName = "Mantha";
        String address = "987 Second St";
        String phoneNumber = "098-765-4321";
        long loanID = 2L;
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
