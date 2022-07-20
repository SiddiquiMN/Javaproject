
package javaapplication2;

import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame {

    private static NewJFrame ob1;
    public NewJFrame() {
        initComponents();
        setIcon();
    }
    

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        enter_button = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/mist_large.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendence System");
        setIconImages(null);
        setLocation(new java.awt.Point(0, 10));
        setPreferredSize(new java.awt.Dimension(900, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1990, 0, 0, 0);

        enter_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button click here.png"))); // NOI18N
        enter_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(enter_button);
        enter_button.setBounds(410, 430, 170, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/MIST_Logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 60, 230, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/BG1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1670, 850));
        jLabel1.setMinimumSize(new java.awt.Dimension(1670, 850));
        jLabel1.setPreferredSize(new java.awt.Dimension(1670, 850));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1670, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enter_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_buttonMouseClicked
        LogIn log=new LogIn();
        ob1.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_enter_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ob1 = new NewJFrame();
                ob1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enter_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mist_logo.png")));
    }
}
