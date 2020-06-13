/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerData;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author cjani
 */
public class CustomerList {
    
    private ArrayList<Customer> customerArray;
    
    private String customerFile = "src/SerFiles/Customer.ser";
    
    public CustomerList(){
        
    }
    
    public void addCustomer(){
        
    }
    public void editCustomer(){
        
    }
    public void deleteCustomer(int i){
        getCustomerArray().remove(i);
    }
    
    public void readCustomerFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;

        try {
            fis = new FileInputStream(customerFile);
            in = new ObjectInputStream(fis);
            setCustomerArray((ArrayList<Customer>) in.readObject());          //needs a serialVersionUID, will reaserch this
            in.close();

            if (!customerArray.isEmpty()) {
                //System.out.println("There are Parents on the list");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //==========================================================================
    //Getter and Setters
    //==========================================================================
    /**
     * @return the customerArray
     */
    public ArrayList<Customer> getCustomerArray() {
        return customerArray;
    }

    /**
     * @param customerArray the customerArray to set
     */
    public void setCustomerArray(ArrayList<Customer> customerArray) {
        this.customerArray = customerArray;
    }


}
