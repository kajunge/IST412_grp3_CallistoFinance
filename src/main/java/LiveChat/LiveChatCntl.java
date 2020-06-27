package LiveChat;

/**
 * This is the Live Chat Controller class. This class provides the methods that
 * allow the chat client to send messages to the server.
 *
 * @author Chris Lefebvre
 * @author Scott
 * @author kristinamantha
 */
public class LiveChatCntl {

    public LiveChatCntl() {
        
    }
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

