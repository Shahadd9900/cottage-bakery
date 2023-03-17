/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
import project.Customer;
import project.CustomerOption;
import project.Project;
import project.WelcomeFrame;
/**
 *
 * @author Dana
 */
public class CustomerLogin extends javax.swing.JFrame {
    Customer cus = new Customer();

    /**
     * Creates new form CustomerLogin
     */
    public CustomerLogin() {
        initComponents();
        this.setVisible(true);
        this.setSize(900,670);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        enterButton1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        ResetButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JButton backButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in ");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0,80));

        enterButton1.setBackground(new java.awt.Color(255, 250, 243));
        enterButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        enterButton1.setForeground(new java.awt.Color(102, 51, 0));
        enterButton1.setText("Enter");
        enterButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        enterButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Name:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        usernameTextField.setBackground(new java.awt.Color(255, 250, 243));
        usernameTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(102, 51, 0));
        usernameTextField.setText("Enter your username");
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(255, 250, 243));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 51, 0));
        passwordField.setText("jTextField1");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ResetButton.setBackground(new java.awt.Color(255, 250, 243));
        ResetButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(102, 51, 0));
        ResetButton.setText("Reset");
        ResetButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        ResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo2.png"))); // NOI18N

        backButton.setBackground(new java.awt.Color(255, 250, 243));
        backButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(101, 58, 15));
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 40, 430, 513);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
    passwordField.setText("");
       
    usernameTextField.setText("");

    }//GEN-LAST:event_ResetButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       this.setVisible(false);
       new WelcomeFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButton1ActionPerformed
      /* CustomerOption in = new CustomerOption();
        this.setVisible(false);
        in.setVisible(true);*/

        String username = usernameTextField.getText() ;
        String pass ="";
        String PASS_DB="";
        String USERNAME_DB="";
        String fname="" , lname="" , address="" , gender="" , phNo1="" , phNo2 = "None" , email = "";
        int cid=-1 , age=-1  ;
        ResultSet rsU;
        ResultSet rsP;
        for(char x: passwordField.getPassword()){pass+=x;}
        //boolean found = false;

        try(Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery ", "Bakery", "Bakery");
            Statement statement = connection.createStatement();
            Statement customerSt = connection.createStatement();
            Statement customerPhSt = connection.createStatement();){

            rsP = statement.executeQuery("SELECT PASSWORD FROM CUSTOMER_ACCOUNT WHERE USERNAME='"+username+"'");
            rsP.next();
            String passDB = rsP.getString(1);
            rsU = statement.executeQuery("SELECT USERNAME FROM CUSTOMER_ACCOUNT WHERE USERNAME='"+username+"'");
            rsU.next();
            String userDB = rsU.getString(1);

            if(pass.equals(passDB) && username.equals(userDB)){
                //ResultSet rsCPh;

                try (ResultSet rsC = customerSt.executeQuery("SELECT CUSTOMER.CID , AGE , GENDER , FNAME , LNAME , ADDRESS , MAIL FROM CUSTOMER , "
                        + "CUSTOMER_ACCOUNT WHERE USERNAME = '"+username+"' AND CUSTOMER.CID = CUSTOMER_ACCOUNT.CID");
                    ResultSet rsCPh = customerPhSt.executeQuery("SELECT PHONENUMBER FROM CUSTOMER_PHONE , "
                            + "CUSTOMER_ACCOUNT WHERE USERNAME = '"+username+"' AND CUSTOMER_PHONE.CID = CUSTOMER_ACCOUNT.CID");
                ) {

                    if(rsC.next()){
                        cid = rsC.getInt("CID");
                        age = rsC.getInt("AGE");
                        gender = rsC.getString("GENDER");
                        fname = rsC.getString("FNAME");
                        lname = rsC.getString("LNAME");
                        address = rsC.getString("ADDRESS");
                        email = rsC.getString("MAIL");
                    }
                    else {JOptionPane.showMessageDialog(this,"Customer info didnt appear! " );}
                    if(rsCPh.next())
                    {
                        phNo1 = rsCPh.getString("PHONENUMBER");
                        if(rsCPh.next())
                        {
                            phNo2 = rsCPh.getString("PHONENUMBER");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Phone number didnt appear! " );
                    }

                    if(    (cid != -1) && (age !=-1) && (gender !="") && (fname !="") &&
                        (lname !="") && (address !="") && (phNo1 !="")
                        && (pass !="") && (username !="") && (email != "")
                    )
                    {
                        cus = new Customer(cid, address, phNo1 ,phNo2 ,fname, lname, gender,
                            age , USERNAME_DB , PASS_DB , email);
                        Project.addCustomer(cus);
                        JOptionPane.showMessageDialog(this,"Welecome dear " + fname +" (: " , "Successful Login " , JOptionPane.PLAIN_MESSAGE);
                        CustomerOption in = new CustomerOption();
                        this.setVisible(false);
                        in.setVisible(true);
                    }
                    else {JOptionPane.showMessageDialog(this, "Sorry there is an error :( ");}
                    
                    rsC.close();
                    rsCPh.close();
                } catch (SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username or password is not correct!");
            }
            rsU.close();
            rsP.close();
            statement.close();
            customerSt.close();
            customerPhSt.close();

        }catch(SQLException e){
           JOptionPane.showMessageDialog(this, "Username or password is not correct!");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_enterButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton ResetButton;
    javax.swing.JButton enterButton1;
    javax.swing.JPasswordField passwordField;
    javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
