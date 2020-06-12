
package com.callisto.finance.ist412_callisto_user;

/**
 *
 * @author kristinamantha
 */
public class Customer {
    
    private long customerID;
    private String customerFirstName;
    private String customerMiddleName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    
    /**
     * This is the default constructor for the Customer class
     */
    public Customer(){
        
    }
    
    /**
     * Returns the customer ID for this transaction.
     * @return A long representing the customer ID for customer.
     */
    public long getCustomerID(){
        return 123456789;
    }
    
    /**
     * Returns the first name for this customer.
     * @return A String representing the customer's first name.
     */
    public String getCustomerFirstName(){
        return "";
    }
    
    /**
     * Returns the middle name for this customer.
     * @return A String representing the customer's middle name.
     */
    public String getCustomerMiddleName(){
        return "";
    }
    
    /**
     * Returns the last name for this customer.
     * @return A String representing the customer's last name.
     */
    public String getCustomerLastName(){
        return "";
    }
    
    /**
     * Returns the address name for this customer.
     * @return A String representing the customer's home address.
     */
    public String getCustomerAddress(){
        return "";
    }
    
    /**
     * Returns the phone number for this customer.
     * @return A String representing the customer's phone number.
     */
    public String getCustomerPhoneNumber(){
        return "";
    }
}
