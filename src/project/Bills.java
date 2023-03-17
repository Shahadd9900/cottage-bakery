
package project;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.ManagerOption;

/**
 *
 * @author Dana
 */
public class Bills extends javax.swing.JFrame {

    /**
     * Creates new form Bills
     */
    public Bills() {
        initComponents();
        this.setVisible(true);
        this.setSize(870,567);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterButton = new javax.swing.JButton();
        priceTextField = new javax.swing.JTextField();
        enterLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        billTextArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        javax.swing.JButton backButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bills");
        getContentPane().setLayout(null);

        enterButton.setBackground(new java.awt.Color(255, 250, 243));
        enterButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        enterButton.setForeground(new java.awt.Color(101, 58, 15));
        enterButton.setText("Enter");
        enterButton.setToolTipText("");
        enterButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton);
        enterButton.setBounds(60, 340, 110, 50);

        priceTextField.setBackground(new java.awt.Color(255, 250, 243));
        priceTextField.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(101, 58, 15));
        priceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        getContentPane().add(priceTextField);
        priceTextField.setBounds(20, 250, 220, 40);

        enterLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        enterLabel.setForeground(new java.awt.Color(102, 51, 0));
        enterLabel.setText("Enter Price of Bills :");
        getContentPane().add(enterLabel);
        enterLabel.setBounds(20, 190, 240, 60);

        jScrollPane1.setBackground(new java.awt.Color(243, 235, 220));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        billTextArea.setEditable(false);
        billTextArea.setBackground(new java.awt.Color(255, 250, 243));
        billTextArea.setColumns(20);
        billTextArea.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        billTextArea.setForeground(new java.awt.Color(101, 58, 15));
        billTextArea.setRows(5);
        billTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        jScrollPane1.setViewportView(billTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 130, 560, 320);

        titleLabel.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(titleLabel);
        titleLabel.setBounds(280, 40, 500, 60);

        backButton.setBackground(new java.awt.Color(255, 250, 243));
        backButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(101, 58, 15));
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(101, 58, 15), 3, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(693, 470, 130, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        if(!priceTextField.getText().equals("")){
            int price = Integer.parseInt(priceTextField.getText());
            File file = new File("out.txt");



            try(Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery", "Bakery", "Bakery");
                Statement st = connection.createStatement() ;
                )
            {
                ResultSet rs = st.executeQuery("SELECT DISTINCT CID , FNAME , LNAME ,MAIL FROM CUSTOMER , ORDERS WHERE CID = CUSTOMER_ID AND TOTALPRICE >= " 
                        + price );
                try{
                    FileWriter fw = new FileWriter(file);
                    PrintWriter pw = new PrintWriter(fw);
                    while(rs.next())
                    { 
                    pw.println( rs.getDouble(1) + " "+ rs.getString(2) + 
                            " " + rs.getString(3) + " "+rs.getString(4) );
                    }

                    pw.close();
                    Scanner read = new Scanner(file);
                    String col1="" , col2="" , col3="" , col4="" ;
                    titleLabel.setText("Customers with orders price that are  "+ price +" $ or more:"); 
                    while(read.hasNext())
                    {
                        col1 = col1+"\t\t"+read.next();
                        col2 = col2+"\t\t"+read.next();
                        col3 = col3+"\t\t"+read.next();
                        col4 = col4+"\t"+read.next();

                    }
                    billTextArea.setText("Customer IDs:\n " + col1 +"\n----------------------\nFrist Names: "+col2+"\n----------------------\nLast Names: "
                                +col3+"\n----------------------\n Emails:"+col4 );


                    } 
                catch (IOException ex) {
                Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);
                }



            } catch (SQLException ex) {
                Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        else{
            JOptionPane.showMessageDialog(this, "Please Enter the bill prices ");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ManagerOption().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea billTextArea;
    javax.swing.JButton enterButton;
    javax.swing.JLabel enterLabel;
    javax.swing.JTextField priceTextField;
    javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
