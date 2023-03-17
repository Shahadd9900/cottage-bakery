/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.Customer;
import project.Project;
import project.WelcomeFrame;

/**
 *
 * @author Dana
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
    }
    WelcomeFrame welecomeFrame = new WelcomeFrame();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        lnameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        FemaleRadioButton = new javax.swing.JRadioButton();
        maleRadioButton = new javax.swing.JRadioButton();
        usernameTextField = new javax.swing.JTextField();
        FnameTextField = new javax.swing.JTextField();
        LnameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        previousButton = new javax.swing.JButton();
        SendButton = new javax.swing.JButton();
        phoneCheckBox = new javax.swing.JCheckBox();
        phone2TextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0,80
        ));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Sign up: ");

        usernameLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("User Name:");

        passLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password:");

        fnameLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        fnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fnameLabel.setText("First Name:");

        lnameLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lnameLabel.setText("Last Name:");

        genderLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");

        FemaleRadioButton.setBackground(new java.awt.Color(102, 51, 0));
        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        FemaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRadioButton.setSelected(true);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        maleRadioButton.setBackground(new java.awt.Color(102, 51, 0));
        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        maleRadioButton.setText("Male");
        maleRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usernameTextField.setBackground(new java.awt.Color(255, 250, 243));
        usernameTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(101, 58, 15));
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        FnameTextField.setBackground(new java.awt.Color(255, 250, 243));
        FnameTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        FnameTextField.setForeground(new java.awt.Color(101, 58, 15));
        FnameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        FnameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LnameTextField.setBackground(new java.awt.Color(255, 250, 243));
        LnameTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        LnameTextField.setForeground(new java.awt.Color(101, 58, 15));
        LnameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        LnameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        passwordTextField.setBackground(new java.awt.Color(255, 250, 243));
        passwordTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(101, 58, 15));
        passwordTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        passwordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        phoneTextField.setEditable(true);
        phoneTextField.setBackground(new java.awt.Color(255, 250, 243));
        phoneTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(101, 58, 15));
        phoneTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        phoneTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneTextField.setEnabled(true);

        previousButton.setBackground(new java.awt.Color(255, 250, 243));
        previousButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        previousButton.setForeground(new java.awt.Color(101, 58, 15));
        previousButton.setText("Previous");
        previousButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        previousButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        SendButton.setBackground(new java.awt.Color(255, 250, 243));
        SendButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        SendButton.setForeground(new java.awt.Color(101, 58, 15));
        SendButton.setText("Send");
        SendButton.setToolTipText("");
        SendButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        SendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        phoneCheckBox.setBackground(new java.awt.Color(102, 51, 0));
        phoneCheckBox.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        phoneCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        phoneCheckBox.setText("phone2:");
        phoneCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                phoneCheckBoxItemStateChanged(evt);
            }
        });

        phone2TextField.setEditable(false);
        phone2TextField.setBackground(new java.awt.Color(255, 250, 243));
        phone2TextField.setForeground(new java.awt.Color(101, 58, 15));
        phone2TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        phone2TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phone2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2TextFieldActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");

        addressTextField.setBackground(new java.awt.Color(255, 250, 243));
        addressTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        addressTextField.setForeground(new java.awt.Color(101, 58, 15));
        addressTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        addressTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ageLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age:");

        ageTextField.setBackground(new java.awt.Color(255, 250, 243));
        ageTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ageTextField.setForeground(new java.awt.Color(101, 58, 15));
        ageTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        ageTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        phoneLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Phone:");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        emailTextField.setBackground(new java.awt.Color(255, 250, 243));
        emailTextField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(101, 58, 15));
        emailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnameLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(FnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(LnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(passwordTextField))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGap(73, 73, 73)
                                        .addComponent(addressLabel)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(emailTextField)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderLabel)
                                    .addComponent(phoneLabel))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(phoneCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(phone2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(FemaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maleRadioButton)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passLabel)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameLabel)
                            .addComponent(FnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameLabel)
                            .addComponent(LnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(FemaleRadioButton)
                            .addComponent(maleRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneCheckBox)
                                .addComponent(phone2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(previousButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendButton)
                        .addGap(25, 25, 25))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 50, 740, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        welecomeFrame.setVisible(true);

    }//GEN-LAST:event_previousButtonActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        String fname , lname , address , username , password;
        String gender , phoneNo1 , phoneNo2 = "None" , email ;
        int age = 0  ,cid;
        boolean passlowerCase= false , passupperCase=false  , passischar=false , passisDigit=false , phone1 = true;
        username = usernameTextField.getText() ;
        password = passwordTextField.getText();
        fname = FnameTextField.getText();
        lname = LnameTextField.getText();
        address = addressTextField.getText();
        try{
        age = Integer.parseInt(ageTextField.getText());
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(this,"Please enter Age in numbers  ");}
        email = emailTextField.getText();
        phoneNo1 = phoneTextField.getText();
        for(int i = 0 ; i < phoneNo1.length() ; i++)
        {
            if(Character.isDigit(phoneNo1.charAt(i))){phone1 = true;}
            else{phone1 = false ; break;}
                
                    }
        try(Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery", "Bakery", "Bakery");
            Statement addCustomerSt = connection.createStatement();
            Statement addCAccountSt = connection.createStatement();
            Statement addCPhoneSt = connection.createStatement();
            Statement getIDStatement = connection.createStatement();
            )
        {
           
            for(int i=0 ; i<password.length() ;i++)
            {
                if(Character.isDigit(password.charAt(i))){ passisDigit = true ;}
                if(Character.isLowerCase(password.charAt(i))) {passlowerCase = true ;}
                if(Character.isUpperCase(password.charAt(i))){passupperCase = true;}    
            }
            if(password.contains("@") || password.contains("#") || password.contains("&") || password.contains("?")|| password.contains("_")
               ||password.contains(".") || password.contains("<") || password.contains("$")||password.contains(":")) 
            {passischar = true ;}
           
        if(
                !"".equals(usernameTextField.getText()) && !"".equals(passwordTextField.getText())
                && !"".equals(FnameTextField.getText()) && !"".equals(LnameTextField.getText()) &&!"".equals(emailTextField.getText())
                && !"".equals(addressTextField.getText()) && !"".equals(ageTextField.getText()) && !"".equals(phoneTextField.getText())    
          ){
            if(password.length() >= 8 && passlowerCase && passupperCase && passischar && passisDigit)
            {
                if(phone1)
                { if(FemaleRadioButton.isSelected())
                {gender = "F";}
                else {gender = "M";}
                int addCustomer =  addCustomerSt.executeUpdate("INSERT INTO Customer (AGE , GENDER , FNAME , LNAME,ADDRESS , MAIL) values "
                        + "("+age +",'"+gender+"','"+fname+"','"+lname+"','"+address+"','"+email+"')");

                try (ResultSet rs = getIDStatement.executeQuery("SELECT CID FROM CUSTOMER WHERE FNAME = '"+fname+"' AND LNAME = '"+lname+"'"))
                {
                    if(rs.next())
                    {
                        cid = rs.getInt(1);
                        phoneNo1 = phoneTextField.getText();
                        int addCPhone2 = 0;
                        if(phoneCheckBox.isSelected())
                        {
                            phone2TextField.setEditable(true);
                            if(!"".equals(phone2TextField.getText()))
                            {
                                phoneNo2 = phone2TextField.getText();
                                addCPhone2 = addCPhoneSt.executeUpdate("INSERT INTO Customer_phone (PHONENUMBER , CID) VALUES "
                                        + "('"+ phoneNo2+ "',"+ cid+")");
                            }
                        }
                        int addCustomerAcc = addCAccountSt.executeUpdate("INSERT INTO Customer_Account (USERNAME , PASSWORD , CID) values "
                                + "('"+username+"','" + password + "',"+cid+")");
                        int addCPhone1 = addCPhoneSt.executeUpdate("INSERT INTO Customer_phone (PHONENUMBER , CID) VALUES"
                                + " ('"+ phoneNo1+ "',"+ cid+")");

                        if(addCustomer==1 && addCustomerAcc == 1 && (addCPhone1 == 1 || addCPhone2 ==1 )){
                            JOptionPane.showMessageDialog(this, "Customer added successfully....");
                            // add customer to customer arraylist
                            Project.addCustomer(new Customer(cid ,address,phoneNo1 , phoneNo2 , fname, lname, gender, age , username , password , email));
                            reset();
                            this.setVisible(false);
                            welecomeFrame.setVisible(true);
                        }
                    }
                    else {JOptionPane.showMessageDialog(this, "Try again");}

                }
}
                else
                {JOptionPane.showMessageDialog(this, "Please Enter Digit only for phone number!..");}
            }
            else {
                
                JOptionPane.showMessageDialog(this, "Password should be :\n1- at least 8 length size\n2- Have capital and small letters"
                + "\n3- Password should have numbers\n4- differen characters : (@ , # , & , ? , _ , . , < , $ , :) ");
            }
        }
        else{JOptionPane.showMessageDialog(this, "Fill all the information!..");}
            connection.close();
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void phoneCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_phoneCheckBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED)
        phone2TextField.setEditable(true);
        else
            phone2TextField.setEditable(false);
            
    }//GEN-LAST:event_phoneCheckBoxItemStateChanged

    private void phone2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2TextFieldActionPerformed
        // TODO add your handling code here:
        boolean digit = true;
        String check;
        do{
            digit = true;
        for(int i=0 ; i < phone2TextField.getText().length() ; i++)
        {
            if(!Character.isDigit(phone2TextField.getText().charAt(i)))
            {
                digit = false; 
                check = JOptionPane.showInputDialog(this , "Please enter numbers only");
                phone2TextField.setText(check);
                break;
            }
        }
        }
        while (digit == false);
    }//GEN-LAST:event_phone2TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }
     public void reset(){
      usernameTextField.setText("");
      passwordTextField.setText("");
      phoneTextField.setText("");
      phoneCheckBox.setSelected(false);
      phone2TextField.setText("");
      phone2TextField.setEditable(false);
      addressTextField.setText("");
      FnameTextField.setText("");
      LnameTextField.setText("");
      ageTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JRadioButton FemaleRadioButton;
    javax.swing.JTextField FnameTextField;
    javax.swing.JTextField LnameTextField;
    javax.swing.JButton SendButton;
    javax.swing.JLabel addressLabel;
    javax.swing.JTextField addressTextField;
    javax.swing.JLabel ageLabel;
    javax.swing.JTextField ageTextField;
    javax.swing.JTextField emailTextField;
    javax.swing.JLabel fnameLabel;
    javax.swing.JLabel genderLabel;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel2;
    javax.swing.JLabel lnameLabel;
    javax.swing.JRadioButton maleRadioButton;
    javax.swing.JLabel passLabel;
    javax.swing.JTextField passwordTextField;
    javax.swing.JTextField phone2TextField;
    javax.swing.JCheckBox phoneCheckBox;
    javax.swing.JLabel phoneLabel;
    javax.swing.JTextField phoneTextField;
    javax.swing.JButton previousButton;
    javax.swing.JLabel usernameLabel;
    javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
