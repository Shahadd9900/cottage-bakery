/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.ModifyOrder;
import project.Order;
import project.Orders;
import project.ShoppingCart;
/**
 *
 * @author Haya alzahim
 */
public class Donut extends javax.swing.JFrame {
String[] donuts={"Yeast Donuts", "Donut Holes", "Filled Donuts","Long johns Donuts"};
static String flavor="", toppings="";


    /**
     * Creates new form Cake
     */
    public Donut() {
        initComponents();
        this.setVisible(true);
        this.setSize(865,565);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(255, 250, 243));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yeast Donuts", "Donut Holes", "Filled Donuts", "Long johns Donuts" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(310, 210, 240, 40);

        jButton3.setBackground(new java.awt.Color(255, 250, 243));
        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(101, 58, 15));
        jButton3.setText("Confirm");
        jButton3.setToolTipText("to confirm your selection");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(680, 440, 110, 30);

        jLabel6.setBackground(new java.awt.Color(255, 250, 243));
        jLabel6.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 58, 15));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Toppings");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 350, 150, 50);

        jLabel5.setBackground(new java.awt.Color(255, 250, 243));
        jLabel5.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 58, 15));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Flavors");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 280, 150, 50);

        jButton1.setBackground(new java.awt.Color(255, 250, 243));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(101, 58, 15));
        jButton1.setText("Back");
        jButton1.setToolTipText("To go back to the previous page");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 430, 90, 30);

        jButton2.setBackground(new java.awt.Color(255, 250, 243));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/catr-PNG.png"))); // NOI18N
        jButton2.setToolTipText("To go to the shopping cart");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 40, 60, 50);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0,80));
        jPanel2.setForeground(new java.awt.Color(102, 0, 0));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 235, 220));
        jLabel3.setText("Donuts options");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 90, 350, 0);

        jRadioButton1.setBackground(new java.awt.Color(232, 218, 198));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(232, 218, 198));
        jRadioButton1.setText("Chocolate");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setFocusable(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(380, 290, 122, 29);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(232, 218, 198));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Classic");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setFocusable(false);
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(230, 290, 104, 29);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(232, 218, 198));
        jRadioButton3.setText("Red Velvet");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.setFocusable(false);
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(530, 290, 126, 29);

        jCheckBox1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(232, 218, 198));
        jCheckBox1.setText("Sprinkles");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(220, 360, 95, 29);

        jCheckBox2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(232, 218, 198));
        jCheckBox2.setText("Nuts");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);
        jCheckBox2.setOpaque(false);
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(340, 360, 65, 29);

        jCheckBox3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(232, 218, 198));
        jCheckBox3.setText("Fruits");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setFocusable(false);
        jCheckBox3.setOpaque(false);
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(440, 360, 71, 29);

        jCheckBox4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(232, 218, 198));
        jCheckBox4.setText("Chocolate Chips");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setFocusable(false);
        jCheckBox4.setOpaque(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(530, 360, 151, 29);

        jLabel7.setBackground(new java.awt.Color(114, 66, 18,80));
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 350, 490, 50);

        jLabel4.setBackground(new java.awt.Color(114, 66, 18,80));
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 280, 490, 50);

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Donuts3.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Order order=new Order();
        order.setVisible(true); 
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ShoppingCart f=new ShoppingCart();
        ModifyOrder.updateOrder();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double price=0;
        try(
            Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery", "Bakery", "Bakery");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT Pro_Price FROM Product WHERE Pro_ID="+(jComboBox1.getSelectedIndex()+4))
            ){
                while (resultSet.next()){
                    price=resultSet.getDouble(1);
                }
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        
        if(ShoppingCart.numOfItems==0){
            ShoppingCart.order.append("\n  "+donuts[jComboBox1.getSelectedIndex()]);}
        else{
            ShoppingCart.order.append("\n\n  "+donuts[jComboBox1.getSelectedIndex()]);
        }
        ShoppingCart.numOfItems++;
        
        if (jRadioButton1.isSelected()){
            flavor=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected()){
            flavor=jRadioButton2.getText();
        }
        else if(jRadioButton3.isSelected()){
            flavor=jRadioButton3.getText();
        }
        toppings="";
        if (jCheckBox1.isSelected()){
            toppings+=jCheckBox1.getText();
        }
        if (jCheckBox2.isSelected()){
            if(jCheckBox1.isSelected()){
            toppings+=", "+jCheckBox2.getText();}
            else{
                toppings+=jCheckBox2.getText();
            }
        }
        if (jCheckBox3.isSelected()){
            if(jCheckBox1.isSelected()||jCheckBox2.isSelected()){
            toppings+=", "+jCheckBox3.getText();}
            else{
                toppings+=jCheckBox3.getText();
            }
        }
        if (jCheckBox4.isSelected()){
            if(jCheckBox1.isSelected()||jCheckBox2.isSelected()||jCheckBox3.isSelected()){
            toppings+=", "+jCheckBox4.getText();}
            else{
                toppings+=jCheckBox4.getText();
            }
        }
        ShoppingCart.total+=price;
        ShoppingCart.orderList.add(new Orders(Orders.numberOfOrders+1, donuts[jComboBox1.getSelectedIndex()], flavor, toppings, price));
        ShoppingCart.order.append(String.format("%n      Flavor: %s                                                %.2f SR%n      Toppings: %s ",flavor,price,toppings));
       
        Order o=new Order();
        o.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Donut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}