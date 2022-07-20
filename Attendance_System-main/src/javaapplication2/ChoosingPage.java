
package javaapplication2;

import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ChoosingPage extends javax.swing.JFrame {

    SimpleDateFormat format1;
    Workbook wb;
    Sheet sh;
    int localrow;
    String selectedCourse;
    String intdate;
    public ChoosingPage() {
        initComponents();
        setIcon();
    }
    
    // Parameterized constructor
    public ChoosingPage(int row) throws IOException {
        setIcon();
        ///System.out.println(row);
        
        initComponents();
         localrow=row;

        showLoginName(localrow);
       /// System.out.println("local row:"+localrow);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChoosingPanel = new javax.swing.JPanel();
        teacherNameLabel = new javax.swing.JLabel();
        DeptChooseLabel = new javax.swing.JLabel();
        CoarseChooseLabel = new javax.swing.JLabel();
        TimeChooseLabel = new javax.swing.JLabel();
        deptComboBox = new javax.swing.JComboBox<>();
        coarseComboBox = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        attendanceMouse = new javax.swing.JLabel();
        studentReport = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChoosingPanel.setBackground(new java.awt.Color(118, 194, 175));
        ChoosingPanel.setPreferredSize(new java.awt.Dimension(952, 784));
        ChoosingPanel.setLayout(null);

        teacherNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        teacherNameLabel.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        teacherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChoosingPanel.add(teacherNameLabel);
        teacherNameLabel.setBounds(270, 220, 310, 50);

        DeptChooseLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        DeptChooseLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeptChooseLabel.setText("DEPT");
        ChoosingPanel.add(DeptChooseLabel);
        DeptChooseLabel.setBounds(240, 300, 60, 30);

        CoarseChooseLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CoarseChooseLabel.setForeground(new java.awt.Color(255, 255, 255));
        CoarseChooseLabel.setText("COURSE");
        ChoosingPanel.add(CoarseChooseLabel);
        CoarseChooseLabel.setBounds(230, 370, 90, 50);

        TimeChooseLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TimeChooseLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeChooseLabel.setText("DATE");
        ChoosingPanel.add(TimeChooseLabel);
        TimeChooseLabel.setBounds(240, 450, 60, 40);

        deptComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        deptComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EECE", "NSE", "BME", "PME", "EWCE", "ARCHI" }));
        deptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptComboBoxActionPerformed(evt);
            }
        });
        ChoosingPanel.add(deptComboBox);
        deptComboBox.setBounds(400, 300, 210, 30);

        coarseComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        coarseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coarseComboBoxActionPerformed(evt);
            }
        });
        ChoosingPanel.add(coarseComboBox);
        coarseComboBox.setBounds(400, 370, 210, 30);
        ChoosingPanel.add(jDateChooser);
        jDateChooser.setBounds(400, 450, 210, 30);

        attendanceMouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button attendance.png"))); // NOI18N
        attendanceMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseMouseClicked(evt);
            }
        });
        ChoosingPanel.add(attendanceMouse);
        attendanceMouse.setBounds(400, 540, 170, 60);

        studentReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button.png"))); // NOI18N
        studentReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentReportMouseClicked(evt);
            }
        });
        ChoosingPanel.add(studentReport);
        studentReport.setBounds(380, 620, 200, 50);

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button Sign Out.png"))); // NOI18N
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        ChoosingPanel.add(logoutButton);
        logoutButton.setBounds(630, 10, 150, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/MIST_Logo.png"))); // NOI18N
        ChoosingPanel.add(jLabel1);
        jLabel1.setBounds(320, 0, 220, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        ChoosingPanel.add(jLabel3);
        jLabel3.setBounds(220, 290, 100, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        ChoosingPanel.add(jLabel4);
        jLabel4.setBounds(220, 370, 100, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        ChoosingPanel.add(jLabel5);
        jLabel5.setBounds(220, 440, 100, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        ChoosingPanel.add(jLabel6);
        jLabel6.setBounds(220, 210, 390, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/BG2.jpg"))); // NOI18N
        ChoosingPanel.add(jLabel2);
        jLabel2.setBounds(-30, 0, 990, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoosingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoosingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptComboBoxActionPerformed
  
    }//GEN-LAST:event_deptComboBoxActionPerformed

    private void coarseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coarseComboBoxActionPerformed
        selectedCourse=coarseComboBox.getSelectedItem().toString();
    }//GEN-LAST:event_coarseComboBoxActionPerformed

    private void attendanceMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseMouseClicked
        Date date=null;
        date = jDateChooser.getDate();
        
        format1=new SimpleDateFormat("MMM dd,yyyy");
        
        try{
            //convert date to string
            intdate=format1.format(date);
            //System.out.println(intdate);              
        }
        catch(Exception e)
        {
            System.out.println("Exception Called");
        }              
            this.setVisible(false);
            attendanceSheet as;
            as=new attendanceSheet(selectedCourse,intdate);
            as.setVisible(true);
    }//GEN-LAST:event_attendanceMouseMouseClicked

    private void studentReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentReportMouseClicked
        studentReport st=new studentReport(selectedCourse,localrow);
        this.setVisible(false);
        st.setVisible(true);
    }//GEN-LAST:event_studentReportMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
       this.setVisible(false);
       LogIn ln=new LogIn();
       ln.setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void showLoginName(int lrow) throws FileNotFoundException, IOException
    {
        /* To show Teacher's name +add course item in Combo Box  */
        wb=new XSSFWorkbook(new FileInputStream("teacherInfo.xlsx"));
        sh=wb.getSheetAt(0);
        Cell name=sh.getRow(lrow).getCell(0);
        String nm=name.getRichStringCellValue().toString();
        
        
        teacherNameLabel.setText(nm);
        
        
        int columCount=sh.getRow(lrow).getLastCellNum();
           ///System.out.println(columCount);
           int j=0;
           for(int i=3;i<columCount;i++)
           {
               Cell nam=sh.getRow(lrow).getCell(i);
               String s;
               
             
               s = nam.getRichStringCellValue().toString();
              // System.out.println(s);

                coarseComboBox.addItem(s);
              
           }
           
           
           
           ///For date
       
        
        Date todaysdate =new Date();
        jDateChooser.setDate(todaysdate);  

        
    }
    
  

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
            java.util.logging.Logger.getLogger(ChoosingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChoosingPanel;
    private javax.swing.JLabel CoarseChooseLabel;
    private javax.swing.JLabel DeptChooseLabel;
    private javax.swing.JLabel TimeChooseLabel;
    private javax.swing.JLabel attendanceMouse;
    private javax.swing.JComboBox<String> coarseComboBox;
    private javax.swing.JComboBox<String> deptComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel studentReport;
    private javax.swing.JLabel teacherNameLabel;
    // End of variables declaration//GEN-END:variables

     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mist_logo.png")));
    }
}
