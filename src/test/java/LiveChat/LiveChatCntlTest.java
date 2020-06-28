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
public class LiveChatCntlTest {
    
    public LiveChatCntlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\n*********************************");
        System.out.println("****   Testing LiveChatCntlTest  ****");
        System.out.println("*********************************");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

//    /**
//     * Test of getType method, of class LiveChatCntl.
//     */
//    @Test
//    public void testGetType() {
//        //System.out.println("getType");
//        LiveChatCntl instance = new LiveChatCntl();
//        LiveChatCntl.MessageType expResult= null;
//        LiveChatCntl.MessageType result = instance.getType();
//        assertEquals(expResult, result);
//        System.out.println("Testing passed testGetType()" + result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setType method, of class LiveChatCntl.
//     */
//    @Test
//    public void testSetType() {
//        //System.out.println("setType");
//        LiveChatCntl.MessageType type = null;
//        LiveChatCntl instance = new LiveChatCntl();
//        instance.setType(type);
//        System.out.println("Testing passed testSetTpye()");
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of getContent method, of class LiveChatCntl.
     */
    @Test
    public void testGetContent() {
        LiveChatCntl instance = new LiveChatCntl("temp content", "IST412Team3");
        String expResult = "temp content";
        String result = instance.getContent();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed testGetContent() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setContent method, of class LiveChatCntl.
     */
    @Test
    public void testSetContent() {
        String content = "temp content";
        LiveChatCntl instance = new LiveChatCntl("temp content", "IST412Team3");
        instance.setContent(content);
        System.out.println("*********************************");
        System.out.println("Testing Passed testSetContent()");
        System.out.println("*********************************");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSender method, of class LiveChatCntl.
     */
    @Test
    public void testGetSender() {
        LiveChatCntl instance = new LiveChatCntl("temp content", "IST412Team3");
        String expResult = "IST412Team3";
        String result = instance.getSender();
        assertEquals(expResult, result);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testGetSender() " + result);
        System.out.println("*********************************");
    }

    /**
     * Test of setSender method, of class LiveChatCntl.
     */
    @Test
    public void testSetSender() {
        String sender = "IST412Team3";
        LiveChatCntl instance = new LiveChatCntl("temp content", "IST412Team3");
        instance.setSender(sender);
        System.out.println("*********************************");
        System.out.println("Testing Passed for testSetSender()");
        System.out.println("*********************************");
    }
    
}
