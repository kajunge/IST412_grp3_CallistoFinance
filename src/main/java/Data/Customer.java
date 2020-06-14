package Data;

/**
 *
 * @author cjani
 * @author kristinamantha
 */
public class Customer {

    private String email;
    private String password;
    private long customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private long loanID;

    /**
     * This is the constructor for the Customer class
     * @param customerEmail
     * @param customerPassword
     * @param id
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     * @param loanID 
     */
    private Customer(String customerEmail, String customerPassword, long id,
            String firstName, String lastName, String address, String phoneNumber,
            long loanID) {
        this.email = customerEmail;
        this.password = customerPassword;
        this.customerId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loanID = loanID;
    }

    /**
     * Returns an email address for the customer
     * @return A String representing the email address for the customer
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for the customer
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the password of the customer
     * @return A String representing the password for the customer
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the customer password
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the customer id number for the customer
     * @return A long representing the the customerId
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customer id number
     * @param customerId the customerId to set
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    /** 
     * Returns the first name of the customer
     * @return A String representing the first name of the customer
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the customer
     * @return A String representing the last name of the customer
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the physical address of the customer
     * @return A String representing the physical address of the customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the customer's physical address
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the customer's phone number
     * @return A String representing the customer's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the customer's phone number
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the customer's loan id number
     * @return A long representing the customer's loan id number
     */
    public long getLoanID() {
        return loanID;
    }

    /**
     * Sets the customer's loan id number
     * @param loanID the loanID to set
     */
    public void setLoanID(long loanID) {
        this.loanID = loanID;
    }

}
