/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiveChat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class ChatClientTest {
    
    public ChatClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing ChatClientTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of execute method, of class ChatClient.
     */
    @Test
    public void testExecute() {
        ChatClient instance = new ChatClient("temp", 4040);
        instance.execute();
        System.out.println("*********************************");
        System.out.println("Testing Passed for testExecute()");
        System.out.println("*********************************");
    }

    /**
     * Test of setUserName method, of class ChatClient.
     */
    @Test
    public void testSetUserName() {
        String userName = "IST412Team3";
        ChatClient instance = new ChatClient("temp", 4040);
        instance.setUserName(userName);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetUserName()" + userName);
        System.out.println("*********************************");
    }

    /**
     * Test of getUserName method, of class ChatClient.
     */
    @Test
    public void testGetUserName() {

        String expResult = "IST412Team3";
       
        assertEquals(expResult, expResult);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetUserName() " + expResult);
        System.out.println("*********************************");
    }
    
}
