
package LiveChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This is the Live Chat client side. It will allow a client to connect to 
 * the server and chat with a live representative.
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
     * @param hostname A String representing the client hostname.
     * @param port An int representing the port number.
     */
    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
        
        hostname = "temp";
        port = 4040;
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
     * A method to return the username
     * @return returns the userName
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
