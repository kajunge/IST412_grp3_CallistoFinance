/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiveChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Chris Lefebvre
 * 
 * @author https://www.codejava.net/java-se/networking/how-to-create-a-chat-console-application-in-java-using-socket
 */
public class ChatClient {
    private String hostname;
    private int port;
    private String userName;
 
    /**
     *Constructor for ChatClient
     * @param hostname
     * @param port
     */
    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }
    
    /**
     *Executes the client side of the socket communication for Live Chat
     */
    public void execute() {
        try {
            Socket socket = new Socket(hostname, port);
 
            System.out.println("Connected to the chat server");
 
//            new ReadThread(socket, this).start();   //ReadThread is a currently unmade class based on Cdejava.net article
//            new WriteThread(socket, this).start();  //WriteThread is a currently unmade class
 
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        } 
    }
    
    /**
     * Sets the username
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * returns the userName
     */
    public String getUserName() {
        return this.userName;
    }
 
 
//    public static void main(String[] args) {
//        if (args.length < 2) return;
// 
//        String hostname = args[0];
//        int port = Integer.parseInt(args[1]);
// 
//        ChatClient client = new ChatClient(hostname, port);
//        client.execute();
//    }
 
}
