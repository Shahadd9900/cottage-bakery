/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import javax.swing.JFrame;
import project.ModifyOrder;
import project.ShoppingCart;

/**
 *
 * @author Haya alzahim
 */
public class CakeModify extends javax.swing.JFrame {

    /**
     * Creates new form CakeModify
     */
    public CakeModify() {
        initComponents();
        getContentPane().setBackground(new Color(243,235,220));
        this.setSize(670,350);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 235, 220));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 10, 170, 130);

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 58, 15));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modify Order");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 50, 215, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 250, 243));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Chocolate");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.setFocusable(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(210, 150, 93, 27);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 250, 243));
        jRadioButton2.setText("Vanilla");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setFocusable(false);
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(310, 150, 75, 27);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 250, 243));
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
        jRadioButton3.setBounds(400, 150, 95, 27);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 250, 243));
        jRadioButton4.setText("Lemon");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.setFocusable(false);
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(540, 150, 69, 27);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(101, 58, 15));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Flavors");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 140, 109, 40);

        jCheckBox3.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 250, 243));
        jCheckBox3.setText("Fruits");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setFocusable(false);
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(540, 200, 61, 27);

        jCheckBox4.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 250, 243));
        jCheckBox4.setText("Chocolate Chips");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setFocusable(false);
        jCheckBox4.setOpaque(false);
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(400, 200, 129, 27);

        jCheckBox2.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 250, 243));
        jCheckBox2.setText("Nuts");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);
        jCheckBox2.setOpaque(false);
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(310, 200, 53, 27);

        jCheckBox1.setFont(new java.awt.Font("Roboto Slab SemiBold", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 250, 243));
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
        jCheckBox1.setBounds(210, 200, 83, 27);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 58, 15));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Toppings");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 190, 120, 40);

        jLabel4.setBackground(new java.awt.Color(102, 51, 0,80));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 200, 410, 30);

        jLabel8.setBackground(new java.awt.Color(102, 51, 0,80));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 150, 410, 30);

        jButton5.setBackground(new java.awt.Color(243, 235, 220));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 51, 0));
        jButton5.setText("Confirm");
        jButton5.setToolTipText("To confirm your selection");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(280, 260, 110, 30);

        jButton6.setBackground(new java.awt.Color(243, 235, 220));
        jButton6.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 51, 0));
        jButton6.setText("Back");
        jButton6.setToolTipText("To go to the previous page");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 260, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        if (jRadioButton1.isSelected()){
            Cake.flavor=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected()){
            Cake.flavor=jRadioButton2.getText();
        }
        else if(jRadioButton3.isSelected()){
            Cake.flavor=jRadioButton3.getText();
        }
        else if(jRadioButton4.isSelected()){
            Cake.flavor=jRadioButton4.getText();
        }
        
        Cake.toppings="";
        if (jCheckBox1.isSelected()){
            Cake.toppings+=jCheckBox1.getText();
        }
        if (jCheckBox2.isSelected()){
            if(jCheckBox1.isSelected()){
            Cake.toppings+=", "+jCheckBox2.getText();}
            else{
                Cake.toppings+=jCheckBox2.getText();
            }
        }
        if (jCheckBox3.isSelected()){
            if(jCheckBox1.isSelected()||jCheckBox2.isSelected()){
            Cake.toppings+=", "+jCheckBox3.getText();}
            else{
                Cake.toppings+=jCheckBox3.getText();
            }
        }
        if (jCheckBox4.isSelected()){
            if(jCheckBox1.isSelected()||jCheckBox2.isSelected()||jCheckBox3.isSelected()){
            Cake.toppings+=", "+jCheckBox4.getText();}
            else{
                Cake.toppings+=jCheckBox4.getText();
            }
        }
         ModifyOrder.modifiedPro.setFlavor(Cake.flavor);
         ModifyOrder.modifiedPro.setToppings(Cake.toppings);
         ShoppingCart f=new ShoppingCart();
         ModifyOrder.updateOrder();
         f.setVisible(true);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ModifyOrder o=new ModifyOrder();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CakeModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CakeModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CakeModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CakeModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CakeModify().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
