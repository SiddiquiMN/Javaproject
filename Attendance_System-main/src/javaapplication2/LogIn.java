
package javaapplication2;

import java.awt.Toolkit;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 *
 * @author HP
 */
public class LogIn extends javax.swing.JFrame {

    private static LogIn ob1;
    public LogIn() {
        initComponents();
        setIcon();
    }
    

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        userPassword = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        user_name = new javax.swing.JLabel();
        logInButton = new javax.swing.JLabel();
        userIconRight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/mist_large.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendence System");
        setIconImages(null);
        setLocation(new java.awt.Point(0, 10));
        setMinimumSize(new java.awt.Dimension(900, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1990, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/MIST_Logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 40, 230, 250);

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(370, 480, 220, 58);

        password.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        password.setText("PASSWORD");
        getContentPane().add(password);
        password.setBounds(130, 480, 210, 50);

        userPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/pass2.png"))); // NOI18N
        getContentPane().add(userPassword);
        userPassword.setBounds(100, 490, 24, 24);

        userNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameTextField);
        userNameTextField.setBounds(370, 350, 220, 67);

        user_name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        user_name.setText("USER ID");
        getContentPane().add(user_name);
        user_name.setBounds(160, 360, 150, 50);

        logInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button Sign In.png"))); // NOI18N
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInButtonMouseExited(evt);
            }
        });
        getContentPane().add(logInButton);
        logInButton.setBounds(390, 580, 140, 87);

        userIconRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/user_name2.png"))); // NOI18N
        getContentPane().add(userIconRight);
        userIconRight.setBounds(100, 350, 64, 78);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 350, 240, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 470, 250, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/BG2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1670, 850));
        jLabel1.setMinimumSize(new java.awt.Dimension(1670, 850));
        jLabel1.setPreferredSize(new java.awt.Dimension(1670, 850));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1670, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseClicked
        String s1=userNameTextField.getText();
        String s2=passwordTextField.getText();

        try {
            Workbook workbook=new XSSFWorkbook(new FileInputStream("teacherInfo.xlsx"));
            Sheet sheet=workbook.getSheetAt(0);
            int rowCount= sheet.getPhysicalNumberOfRows();
            ////System.out.println(rowCount);
            int columCount=sheet.getRow(0).getLastCellNum();
            int i;
            for( i=0;i<rowCount;i++)
            {
                XSSFRow row=(XSSFRow) sheet.getRow(i);
                String userID=row.getCell(1).toString();
                String pass=row.getCell(2).toString();

                if(s1.equals(userID) && s2.equals(pass))
                {
                    ChoosingPage ch;
                    ch = new ChoosingPage(i);

                    this.setVisible(false);
                    ch.setVisible(true);

                    ///JOptionPane.showMessageDialog(null,"Successful","LogIn Info",JOptionPane.INFORMATION_MESSAGE);

                    break;

                }

            }

            if(i==rowCount)
            {
                JOptionPane.showMessageDialog(null,"Invalid User","LogIn Info",JOptionPane.WARNING_MESSAGE);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logInButtonMouseClicked

    private void logInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseEntered
        logInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("./button Sign In.png")));
    }//GEN-LAST:event_logInButtonMouseEntered

    private void logInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseExited
        logInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("./button Sign In.png")));
    }//GEN-LAST:event_logInButtonMouseExited

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ob1 = new LogIn();
                ob1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logInButton;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel userIconRight;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JLabel userPassword;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mist_logo.png")));
    }
}
