
package Data;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author cjani
 * @author kristinamaantha
 */
public class CustomerList {
    
    private ArrayList<Customer> customerArray;
    
//    private String customerFile = "src/SerFiles/Customer.ser";
    
    /**
     *Constructor for the CustomerList array
     */
    public CustomerList(){
        
    }
    
    /**
     *  Creates a customer profile based on the inputted data and adds it to the ArrayList
     * @param email - a String representing the email in a customer profile
     * @param password - a String representing the password in a customer profile
     * @param customerId - a long representing the customer id in a customer profile
     * @param firstName - a String representing the customer's first name in the customer profile
     * @param lastName - a String representing the customer's last name in the customer profile
     * @param address - a String representing the customer's address in the customer profile
     * @param phoneNumber - a String representing the customer's phone number in the customer profile
     * @param loanID - a String representing the customer's loan id in the customer profile
     */
    public void addCustomer(String email, String password, long customerId, String firstName, String lastName, String address, String phoneNumber, long loanID){
        
    }

     /**
     *  Edits a customer profile based on the inputted data in the arrayList
     * @param email - a String representing the email in a customer profile
     * @param password - a String representing the password in a customer profile
     * @param customerId - a long representing the customer id in a customer profile
     * @param firstName - a String representing the customer's first name in the customer profile
     * @param lastName - a String representing the customer's last name in the customer profile
     * @param address - a String representing the customer's address in the customer profile
     * @param phoneNumber - a String representing the customer's phone number in the customer profile
     * @param loanID - a String representing the customer's loan id in the customer profile
     */
    public void editCustomer(String email, String password, long customerId, String firstName, String lastName, String address, String phoneNumber, long loanID){
        
    }

    /**
     *Deletes a customer from the customerArray
     * @param customerID - a long representing the costumer id in a customer profile to be deleted
     */
    public void deleteCustomer(long customerID){
        getCustomerArray().remove(customerID);
    }
    
//    /**
//     *
//     */
//    public void readCustomerFile(){
//        FileInputStream fis = null;
//        ObjectInputStream in = null;
//
//        try {
//            fis = new FileInputStream(customerFile);
//            in = new ObjectInputStream(fis);
//            setCustomerArray((ArrayList<Customer>) in.readObject());          //needs a serialVersionUID, will reaserch this
//            in.close();
//
//            if (!customerArray.isEmpty()) {
//                //System.out.println("There are Parents on the list");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //==========================================================================
    //Getter and Setters
    //==========================================================================
    /**
     * Returns an ArrayList of customers
     * @return An ArrayList representing the customers
     */
    public ArrayList<Customer> getCustomerArray() {
        return customerArray;
    }

    /**
     * Sets the CustomerArray
     * @param customerArray the customerArray to set
     */
    public void setCustomerArray(ArrayList<Customer> customerArray) {
        this.customerArray = customerArray;
    }


}
