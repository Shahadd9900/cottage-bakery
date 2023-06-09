/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*; 
/**
 *
 * @author Haya alzahim
 */

public class ShoppingCart extends javax.swing.JFrame {
       
public static List<Orders> orderList=new ArrayList<>();
static String[] orderArray;
public static StringBuilder order=new StringBuilder();
static double total=0.0;
static int numOfItems=0;
Customer customer = Project.getCustomer();
String host="smtp.gmail.com";  
final String user="cottagebakery.java@gmail.com";  
final String password="cottage.123321";
String to = customer.getEmail();

    /**
     * Creates new form ShoppingCart
     */
    public ShoppingCart() {
        initComponents();
        jScrollPane1.getViewport().setOpaque(false);
        checkOutButton.setVisible(false);
        editOrderButton.setVisible(false);
        this.setVisible(true);
        this.setSize(800,570);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editOrderButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        checkOutButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        editOrderButton.setBackground(new java.awt.Color(243, 235, 220));
        editOrderButton.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        editOrderButton.setForeground(new java.awt.Color(102, 51, 0));
        editOrderButton.setText("Edit Order");
        editOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editOrderButton.setFocusable(false);
        editOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editOrderButton);
        editOrderButton.setBounds(500, 460, 110, 30);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 240, 80, 80);

        jScrollPane1.setBackground(new java.awt.Color(243, 235, 220));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(243, 235, 220));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Palatino Linotype", 0, 25)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(139, 78, 19));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n\n               \n                                   Your basket is empty .\n                             Start adding some pastries !");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new java.awt.Color(139, 78, 19));
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 190, 640, 240);

        checkOutButton.setBackground(new java.awt.Color(243, 235, 220));
        checkOutButton.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        checkOutButton.setForeground(new java.awt.Color(102, 51, 0));
        checkOutButton.setText("Check out");
        checkOutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkOutButton.setFocusable(false);
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkOutButton);
        checkOutButton.setBounds(630, 460, 110, 30);

        jButton5.setBackground(new java.awt.Color(243, 235, 220));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 51, 0));
        jButton5.setText("Back");
        jButton5.setToolTipText("To go to the order page");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 460, 90, 30);

        jLabel4.setBackground(new java.awt.Color(243, 235, 220));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(54, 170, 670, 270);

        jLabel3.setBackground(new java.awt.Color(243, 235, 220));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Basket");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 80, 110, 40);
        jLabel3.getAccessibleContext().setAccessibleName("Basket ( Products)  SR");

        jLabel5.setBackground(new java.awt.Color(243, 235, 220));
        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("( 0 Products)                                     0 SR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 90, 470, 30);

        jLabel2.setBackground(new java.awt.Color(243, 235, 220));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 70, 600, 60);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255,80));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 140, 740, 370);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 10, 120, 130);

        jLabel1.setBackground(new java.awt.Color(145, 67, 0));
        jLabel1.setForeground(new java.awt.Color(145, 67, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/breadresize.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Order o=new Order();
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void editOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrderButtonActionPerformed
        // TODO add your handling code here:

        orderArray =new String[ShoppingCart.orderList.size()];
        for (int i=0; i<ShoppingCart.orderList.size(); i++){
            orderArray[i]=ShoppingCart.orderList.get(i).toString();           
}
        this.setVisible(false);
        ModifyOrder m=new ModifyOrder();
        m.setVisible(true);
        m.setSize(670,350);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_editOrderButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        // TODO add your handling code here:
       
        String orderInfo=String.format("Order Details: \n\n%s\n\nTotal: %.2f SR\n\n Do you want to confirm your order?", 
                jTextArea1.getText(), total);
        int ans=JOptionPane.showConfirmDialog(null, orderInfo , "Order Confirmation", JOptionPane.YES_NO_OPTION);
        if (ans==JOptionPane.YES_OPTION){
            // send to email the order 
        
        int pro_ID=0,ordNum=0;
        ResultSet resultSet=null;
        try(
            Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery", "Bakery", "Bakery");
            PreparedStatement INSERTOrder=connection.prepareStatement("INSERT INTO Orders VALUES (?,?,?)");
            PreparedStatement INSERTConsistOf=connection.prepareStatement("INSERT INTO Consist_Of VALUES (?,?,?,?)");
            PreparedStatement FIND_ID=connection.prepareStatement("SELECT Pro_ID FROM Product WHERE Pro_Name=?");
            PreparedStatement FIND_ORDER_NUM=connection.prepareStatement("SELECT orderNumber FROM Orders");
            ){
            resultSet=FIND_ORDER_NUM.executeQuery();
                    while (resultSet.next()){
                        ordNum=resultSet.getInt(1);
                    }
                    ordNum+=1;
                    Orders.numberOfOrders=ordNum;
                    INSERTOrder.setInt(1,Orders.numberOfOrders);
                    INSERTOrder.setInt(2, customer.getID());
                    INSERTOrder.setDouble(3,total);
                    INSERTOrder.executeUpdate();
                    
                for (int i=0; i<ShoppingCart.orderList.size(); i++){
    
                    FIND_ID.setString(1 ,ShoppingCart.orderList.get(i).getProductName());
      
                    resultSet=FIND_ID.executeQuery();
                    while (resultSet.next()){
                        pro_ID=resultSet.getInt(1);
                    }
                    INSERTConsistOf.setInt(1,Orders.numberOfOrders );
                    INSERTConsistOf.setInt(2, pro_ID);
                    INSERTConsistOf.setString(3,ShoppingCart.orderList.get(i).getFlavor());
                    INSERTConsistOf.setString(4,ShoppingCart.orderList.get(i).getToppings());
                    INSERTConsistOf.executeUpdate();
                    
                }
               for(int i = 0 ; i< ShoppingCart.orderList.size() ; i++){
                   Project.addOrder(orderList.get(i));
               }
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try{
            if(resultSet!=null)
            resultSet.close();}
            catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
            //Get the session object  
        Properties props = new Properties(); 
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host",host);    
        props.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(props,  
         new javax.mail.Authenticator() {  
           protected PasswordAuthentication getPasswordAuthentication() {  
         return new PasswordAuthentication(user,password);  
           }  
         });
        try {  
                MimeMessage message = new MimeMessage(session);  
                message.setFrom(new InternetAddress(user));  
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
                message.setSubject("Confirmed Order from Cottage Bakery -Order information-");  
                String messageE = "Order Confirmed!\n\n------------------------\n\nYour order number(This is your order ID code): "+ Orders.numberOfOrders +
                        " \nYour order total price: "+total+" $ \n\n------------------------\n\nThis Number code will"
                        + "help you to: \n1- cancel your order\n2-show your order details\n\n\n       Thank you for your order :) !";
                message.setText(messageE) ;  

               //send the message  
                Transport.send(message);  

     } catch (MessagingException e) {e.printStackTrace();} 
        
            JOptionPane.showMessageDialog(null,String.format("Order Confirmed!\n "
                    + "Your order number(This is your order ID code): %d \n Thank you for your order !",Orders.numberOfOrders));
            ShoppingCart.orderList.clear();
            ShoppingCart.numOfItems=0;
            ShoppingCart.order.setLength(0);
            ModifyOrder.updateOrder();
            jTextArea1.setText("");
            this.setVisible(false);
            new CustomerOption().setVisible(true);
        }

    }//GEN-LAST:event_checkOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton checkOutButton;
    public static javax.swing.JButton editOrderButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
