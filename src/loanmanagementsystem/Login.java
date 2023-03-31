/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanmanagementsystem;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Acer
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    //Static Admin username & password
    public static String admin = "admin";
    public static String adminpassword = "admin";

    public Login() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUserName = new javax.swing.JTextField();
        Login_Btn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6_msg = new javax.swing.JLabel();
        jTxtPassword = new javax.swing.JPasswordField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setBackground(new java.awt.Color(0, 255, 204));
        jExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jExit.setForeground(new java.awt.Color(0, 0, 51));
        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_48px.png"))); // NOI18N
        jExit.setBorderPainted(false);
        jExit.setContentAreaFilled(false);
        jExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel1.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 50, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract2_50px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Loan Management System Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jTxtUserName.setBackground(new java.awt.Color(204, 255, 255));
        jTxtUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTxtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 30));

        Login_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login_50px.png"))); // NOI18N
        Login_Btn.setText("Login");
        Login_Btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login_64px.png"))); // NOI18N
        Login_Btn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login_64px.png"))); // NOI18N
        Login_Btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login_64px.png"))); // NOI18N
        Login_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 220, 70));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 220, -1));
        jPanel1.add(jLabel6_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 20));

        jTxtPassword.setBackground(new java.awt.Color(204, 255, 255));
        jTxtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTxtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 208, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void adminLog() {
        jLabel6_msg.setForeground(Color.GREEN);
        jLabel6_msg.setText("Login Success For Admin");
        state.adminOn = true;
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        jProgressBar1.setValue(i);
                        Thread.sleep(5);
                        if (i == 100) {
                            Login.this.dispose();
                            new Loan().setVisible(true);
                        }
                    }
                } catch (Exception e) {
                    jLabel6_msg.setText("Invalid Username or Password");
                }
            }
        });
        t.start();
    }
    
    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        //Exit Button Code
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // This Minimize button codde
        setState(Frame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Login_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_BtnActionPerformed
        if (jTxtUserName.getText().equals(admin) && new String(jTxtPassword.getPassword()).equals(adminpassword)) {

            //static admin
            adminLog();
        } else {
            JOptionPane.showMessageDialog(Login_Btn, "Please Enter Correct Username & Password");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_BtnActionPerformed

    private void jTxtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUserNameActionPerformed
        jTxtPassword.grabFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUserNameActionPerformed

    private void jTxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPasswordActionPerformed
        Login_Btn.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_Btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6_msg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPasswordField jTxtPassword;
    private javax.swing.JTextField jTxtUserName;
    // End of variables declaration//GEN-END:variables
}
