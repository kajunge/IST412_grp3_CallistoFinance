package Login;

import Connection.ConnectionSQL;
import Data.Customer;
import Data.CustomerDataUI;
import Navigation.NavigationUI;
import Data.CustomerList;
import Register.RegisterUI;
import com.mysql.cj.MysqlConnection;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * This is the Login GUI.
 * @author Chris Lefebvre
 * @author kristinamantha
 */
public class LoginUI extends javax.swing.JFrame {

    // Connection conn = ConnectionSQL.connectDB();
    //  Statement stmt = null;
    //   ResultSet rs = null;
    LoginCntl loginCntl;
    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        initComponents();
//=============================================================================
//CustomerList must be moved to loginCntl() at a later time
        CustomerList customerList = new CustomerList();
        loginCntl = new LoginCntl();
//=============================================================================
        // ConnectionSQL.connectDB();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Callisto Finance mFinance Application");
        setUndecorated(true);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(248, 248, 255));
        MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 236, 240), 6, true));

        jPanel1.setBackground(new java.awt.Color(235, 236, 240));

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Callisto Finance");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel2.setText("Email");

        usernameTextField.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(0, 0, 0));
        usernameTextField.setText("kam564@psu.edu");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel3.setText("Password:");

        passwordTextField.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setText("MyPa$$w0rd");
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(235, 236, 240));
        jPanel2.setOpaque(false);

        loginButton.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setMaximumSize(new java.awt.Dimension(80, 29));
        loginButton.setMinimumSize(new java.awt.Dimension(80, 29));
        loginButton.setPreferredSize(new java.awt.Dimension(80, 29));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(235, 236, 240));
        jPanel3.setOpaque(false);

        exitButton.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(passwordTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This will get the contents of the username text field.
     *
     * @param evt
     */
    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    /**
     * This method will change the username textfield to empty when clicked on.
     *
     * @param evt
     */
    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        if (usernameTextField.getText().trim().toLowerCase().equals("enter your username")) {
            usernameTextField.setText("");
            usernameTextField.setForeground(Color.black);
        }

    }//GEN-LAST:event_usernameTextFieldFocusGained

    /**
     * A method that if text field is equal to username or empty, set the "enter
     * your username" in the field on focus lost event text.
     *
     * @param evt
     */
    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost

        if (usernameTextField.getText().trim().equals("")
                || usernameTextField.getText().trim().toLowerCase().equals("enter your username")) {
            usernameTextField.setText("enter your username");
            usernameTextField.setForeground(Color.lightGray);
        }

    }//GEN-LAST:event_usernameTextFieldFocusLost

    /**
     *
     * @param evt
     */
    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    /**
     * A method to get the password text field contents.
     *
     * @param evt
     */
    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained

        String pass = String.valueOf(passwordTextField.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {
            passwordTextField.setText("");
            passwordTextField.setForeground(Color.black);
        }

    }//GEN-LAST:event_passwordTextFieldFocusGained

    /**
     * A method to get password text.
     *
     * @param evt
     */
    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost

        String pass = String.valueOf(passwordTextField.getPassword());

        if (pass.trim().equals("")
                || pass.trim().toLowerCase().equals("password")) {
            passwordTextField.setText("password");
            passwordTextField.setForeground(Color.lightGray);
        }

    }//GEN-LAST:event_passwordTextFieldFocusLost

    private boolean usernameTextFieldError() {    
        
        String input = usernameTextField.getText().toString();       
        Pattern pattern = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(input);        
        boolean value = matcher.matches();
        
        if (value == false && !input.equals("")) {
            usernameTextField.setBackground(Color.red);
            usernameTextField.setForeground(Color.white);
        }
        else{
            usernameTextField.setBackground(Color.white);
            usernameTextField.setForeground(Color.black);
        }
        return value;
    }
    
    /**
     * A method to launch the Customer Details GUI if username/password match.
     *
     * @param evt
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

//        String login = "SELECT * FROM customers WHERE username=? AND password=?";
//        try {
//            ps = conn.prepareStatement(login);
//            ps.setString(1, usernameTextField.getText());
//            ps.setString(2, passwordTextField.getText());
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                new NavigationUI().setVisible(true);
//                dispose();
//            } else {
//                JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
//        }

//==============================================================================
//Chris added
//==============================================================================

        String usernameOutput = "";
        String passwordOutput = "";
        
        boolean tempValue = false;
        //if(authenticator = flase){
        //
        //}
        
        if(usernameTextFieldError() == false){
            usernameOutput = "Your email must include an @ and a domain name (.com, .net, .edu, etc.). \n";
            tempValue = true;
        }
        if(usernameTextField.getText().isEmpty()){
            usernameOutput = "Please enter your email you registered with. \n";
            usernameTextField.setBackground(Color.red);
            usernameTextField.setForeground(Color.white);
            tempValue = true;
        }  
            if(tempValue == true){
                JOptionPane.showMessageDialog(null, usernameOutput, "Login Error", 2);
            }

            if(tempValue == false){
                String email = usernameTextField.getText();
                String pass = passwordTextField.getText();
                
                if (loginCntl.authenticator(email, pass)) {                    
                    new NavigationUI(loginCntl.customerList.setupCurrentUser(email, pass)).setVisible(true);
                    dispose();
//                    JOptionPane.showMessageDialog(null, "Authentication Passed", "Good Pass", 2);
            } else {//Invalid Username or Password
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
                    usernameTextField.setBackground(Color.red);
                    usernameTextField.setForeground(Color.white);
                }  
        }
        
//==============================================================================
//End of HEAD(?) section
//==============================================================================

        /* try {
            String loginSQL = "SELECT * FROM APP.LOGINTABLE WHERE USERNAME ='"+usernameTextField.getText()+"' AND PASSWORD ='"+passwordTextField.getText().toString()+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(loginSQL);

            if (rs.next()) {
                new CustomerDataUI().setVisible(true);
                dispose();
            } else {

                JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }*/
 /*try {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mFinance_Customers", "nbuser", "nbuser");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
        JOptionPane.showMessageDialog(this, "Login was Successful");
        } else {
        JOptionPane.showMessageDialog(this, "Login was Unuccessful");
        }
        } catch (Exception e) {
        }*/
 /*String cust = usernameTextField.getText().trim();
        String pass = passwordTextField.getText();
        if (cust.equalsIgnoreCase("Admin")
        && pass.equals("Administrator")) {
        new CustomerDataUI().setVisible(true);
        dispose();
        } else {
        JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
        }*/
 /*try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mFinance_Customers", "nbuser", "nbuser");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login was Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Login was Unuccessful");

            }
        } catch (Exception e) {

        }*/
//        String cust = usernameTextField.getText().trim();
//        String pass = passwordTextField.getText();
//
//        if (cust.equalsIgnoreCase("Admin")
//                && pass.equals("Administrator")) {
//            new CustomerDataUI().setVisible(true);
//            dispose();
//        } else {
//            JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Error", 2);
//        }
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * A method to launch the Registration GUI.
     *
     * @param evt
     */
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        new RegisterUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * A method to exit the program.
     *
     * @param evt
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    private int xMouse, yMouse;

    /**
     * A method that gets the X and Y location of the mouse click on jLabel1.
     *
     * @param evt An event that gets the X and Y location of the mouse click on
     * jLabel1.
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * A method that moves the application to the X and Y location of mouse
     * drag.
     *
     * @param evt
     */
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

//        Customer customer = new Customer();
//
//        customer.setCustomerId(1234);
//        customer.setFirstName("Kristina");
//        customer.setLastName("Mantha");
//        customer.setEmail("kam564@psu.edu");
//        customer.setAddress("313 Nittany Lane");
//        customer.setPhoneNumber("352-123-5555");
//        customer.setPassword("MyPa$$w0rd");
//        customer.setLoanID(555512);
//
//        try {
//
//            FileOutputStream fileOut = new FileOutputStream("src/main/resources/SerFiles/Customer.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(customer);
//            out.close();
//            fileOut.close();
//            System.out.println("***********************************************************");
//            System.out.println("Serialized data is saved in /resources/SerFiles/Customer.ser");
//            System.out.println("***********************************************************");
//
//        } catch (IOException i) {
//            i.printStackTrace();
//        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
