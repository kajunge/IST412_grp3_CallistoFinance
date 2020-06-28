
package Login;

/**
 * This is the Loan Controller Class. It contains methods that allow a user
 * to login to the Callisto mFinance app.
 * @author Chris Lefebvre
 * @author kristinamantha
 * @author Scott Crowthers
 */
public class LoginCntl {
    
    /**
     * This is the initial constructor
     */
    public LoginCntl(){
        
    }
    /**
     * A method to verify username
     * @param username A String representing customer's username
     * @return A boolean return depending on whether username is valid.
     */
    private boolean isValidUsername(String username){
        // TODO: check to make sure username is not taken
        return username.length() >= 3 && !(username.contains(" "));
    }
    
    /**
     * A method to verify password
     * @param password A String representing the user password
     * @return This returns the validity of the password
     */
    public boolean isValidPassword(String password){
        // TODO: add requirment of 1 uppercase and 1 number
        return password.length() >= 8;
    }
}
