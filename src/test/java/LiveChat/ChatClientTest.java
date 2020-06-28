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
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of execute method, of class ChatClient.
     */
    @Test
    public void testExecute() {
        //System.out.println("execute");
        ChatClient instance = null;
        instance.execute();
        System.out.println("Testing passed testExecute()");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class ChatClient.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "IST412Team3";
        ChatClient instance = new ChatClient("temp", 4040);
        instance.setUserName(userName);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class ChatClient.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        ChatClient instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
