
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
     * A method to verify if the inputted email is associated with a user account
     * @param userEmail A String representing customer's inputted username
     * @return A boolean return depending on whether username is valid.
     */
    private boolean isValidEmail(String userEmail){
        // TODO: check to make sure username is not taken - incorrect location, this should check if email is associated with a user
        //return userEmail.length() >= 3 && !(userEmail.contains(" "));
        return false;
    }
    
//    /**
//     * A method to verify password
//     * @param password A String representing the user password
//     * @return This returns the validity of the password
//     */
//    public boolean isValidPassword(String password){
//        // TODO: checks if password is the correct password associated with the given email
//        return password.length() >= 8;
//    }
    /**
     * A method to verify email and password
     * @param userEmail A String representing customer's email
     * @param password A String representing the customers password
     * @return A boolean return depending on whether combination of user name and password are correct
     */
    public boolean authenticator(String userEmail, String password){
        
        return false;
    }
    
    public void forgottenPassword(String userEmail){
        
    }
    public void forgottenEmail(String securityQuestionResponse, int ssNum){
        
    }
}
