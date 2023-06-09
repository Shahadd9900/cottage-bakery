/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
import project.Employee;
import project.EmployeeOption;
import project.Project;


/**
 *
 * @author A. Alharbi
 */
public class EmployeeLogin extends javax.swing.JFrame {
        static Employee emp = new Employee();
    /**
     * Creates new form EmployeeLogin
     */
    public EmployeeLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0,80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logo2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        jTextField1.setBackground(new java.awt.Color(255, 250, 243));
        jTextField1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 51, 0));
        jTextField1.setText("Enter Username");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));

        jPasswordField1.setBackground(new java.awt.Color(255, 250, 243));
        jPasswordField1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 51, 0));
        jPasswordField1.setText("jTextField1");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));

        jButton1.setBackground(new java.awt.Color(255, 250, 243));
        jButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("Enter");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(240, 60, 490, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = jTextField1.getText() ;
        String pass ="";
        String PASS_DB="";
        String USERNAME_DB="";
        String fname="" , lname="" , address="" ;
        int eid=-1 , age=-1 , manager_id = -1 ;
        double hours = -1, salary_per_hour = -1 ;
        ResultSet rsU;
        ResultSet rsP;
        for(char x: jPasswordField1.getPassword()){pass+=x;}
        //boolean found = false;

        try(Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Cottege_Bakery", "Bakery", "Bakery");
            Statement statement = connection.createStatement();
            Statement empSt = connection.createStatement();
            Statement empPhSt = connection.createStatement();){
           
            rsP = statement.executeQuery("SELECT PASSWORD FROM EMPLOYEE_ACCOUNT , EMPLOYEE WHERE USERNAME = '"+username+"' AND EID = EMPLOYEE_ID AND MAG_ID IS NOT NULL ");
            rsP.next();
            String passDB = rsP.getString(1);
            rsU = statement.executeQuery("SELECT USERNAME FROM EMPLOYEE_ACCOUNT , EMPLOYEE WHERE USERNAME='"+username+"' AND EID = EMPLOYEE_ID AND MAG_ID IS NOT NULL ");
            rsU.next();
            String userDB = rsU.getString(1);

            if(pass.equals(passDB) && username.equals(userDB)){
                //ResultSet rsCPh;

                try (ResultSet rsE = empSt.executeQuery("SELECT * FROM EMPLOYEE , EMPLOYEE_ACCOUNT WHERE USERNAME = '"+username+"' AND"
                        + " Employee_ID = EID");
                ) {

                    if(rsE.next()){
                        eid = rsE.getInt("Employee_ID");
                        age = rsE.getInt("AGE");
                        hours = rsE.getDouble("HOURS");
                        fname = rsE.getString("FNAME");
                        lname = rsE.getString("LNAME");
                        address = rsE.getString("ADDRESS");
                        salary_per_hour = rsE.getDouble("SALARY_PER_HOUR");
                        manager_id = rsE.getInt("MAG_ID");
                        PASS_DB = rsE.getString("PASSWORD");
                        USERNAME_DB = rsE.getString("USERNAME");
                        
                    }
                    else {JOptionPane.showMessageDialog(this,"Manager info didnt appear! " );}
                    
                    if(    (eid != -1) && (age !=-1) && (hours !=-1) &&(manager_id !=-1)&& (fname !="") &&
                        (lname !="") && (address !="")
                        && (pass.equals(PASS_DB)) && (username.equals(USERNAME_DB))
                    )
                    {
                        
                        emp = new Employee(salary_per_hour, hours, address, eid, fname, lname, age, username, pass , manager_id   );
                        JOptionPane.showMessageDialog(this,"Welcome " +fname +" " + lname+" , keep the hard work !!!!! " );
                        Project.setEmployee(emp);
                        this.setVisible(false);
                        new EmployeeOption().setVisible(true);
                    }
                    else {JOptionPane.showMessageDialog(this, "Sorry >> ");}
                    rsE.close();
                } catch (SQLException e){JOptionPane.showMessageDialog(this,"Invalid password or username !");}

            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username or password is not correct!");
            }
            rsU.close();
            rsP.close();


        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Username or password is not correct!" );

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new AdminFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        jTextField1.setText("");

        jPasswordField1.setText("");
    }//GEN-LAST:event_ResetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton ResetButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
