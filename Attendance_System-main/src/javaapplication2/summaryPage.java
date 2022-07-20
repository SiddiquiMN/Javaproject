
package javaapplication2;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class summaryPage extends javax.swing.JFrame {
    DefaultTableModel model;
    int pr,ab,roww=-1;
    String course,dat;
    public summaryPage() {
        initComponents();
        setIcon();
    }
    public summaryPage(String cou,String da,int p, int a) {
        initComponents();
        setIcon();
        pr=p;
        ab=a;
        course=cou;
        dat=da;
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,24));
       jTable1.getTableHeader().setOpaque(false);
        showSummary();
        
         
    }
    void showSummary()
    {
        dateLabel.setText(dat);
        presentCnt.setText(Integer.toString(pr)); 
        absCnt.setText(Integer.toString(ab));
       
       if(course.equals("JAVA"))
        {
       
        model=(DefaultTableModel) jTable1.getModel();
        try {
            Workbook workbook=new XSSFWorkbook(new FileInputStream("javaSummary.xlsx"));
            Sheet sheet=workbook.getSheetAt(0);
            int rowCount= sheet.getPhysicalNumberOfRows();
            int columCount=sheet.getRow(0).getLastCellNum();
            for(int i=1;i<rowCount;i++)
            {
                XSSFRow rowl=(XSSFRow) sheet.getRow(i);
               String date =rowl.getCell(0).toString();
                String present=rowl.getCell(1).toString();
                 String absent=rowl.getCell(2).toString();
              model.insertRow(model.getRowCount(),new Object[]{date,present,absent});
               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         catch (NullPointerException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       else if(course.equals("DiscreteMath"))
        {
              model=(DefaultTableModel) jTable1.getModel();
        try {
            Workbook workbook=new XSSFWorkbook(new FileInputStream("discreteSummary.xlsx"));
            Sheet sheet=workbook.getSheetAt(0);
            int rowCount= sheet.getPhysicalNumberOfRows();
            int columCount=sheet.getRow(0).getLastCellNum();
            for(int i=1;i<rowCount;i++)
            {
                XSSFRow rowl=(XSSFRow) sheet.getRow(i);
               String date =rowl.getCell(0).toString();
                String present=rowl.getCell(1).toString();
                 String absent=rowl.getCell(2).toString();
              model.insertRow(model.getRowCount(),new Object[]{date,present,absent});
               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         catch (NullPointerException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if(course.equals("DS AlGO"))
        {
            
              model=(DefaultTableModel) jTable1.getModel();
        try {
            Workbook workbook=new XSSFWorkbook(new FileInputStream("dsSummary.xlsx"));
            Sheet sheet=workbook.getSheetAt(0);
            int rowCount= sheet.getPhysicalNumberOfRows();
            int columCount=sheet.getRow(0).getLastCellNum();
            for(int i=1;i<rowCount;i++)
            {
                XSSFRow rowl=(XSSFRow) sheet.getRow(i);
               String date =rowl.getCell(0).toString();
                String present=rowl.getCell(1).toString();
                 String absent=rowl.getCell(2).toString();
              model.insertRow(model.getRowCount(),new Object[]{date,present,absent});
               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         catch (NullPointerException ex) {
            Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        presentStudentLabel = new javax.swing.JLabel();
        absentStudentLabel = new javax.swing.JLabel();
        headline = new javax.swing.JLabel();
        presentCnt = new javax.swing.JLabel();
        absCnt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(677, 379));

        jPanel1.setLayout(null);

        presentStudentLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        presentStudentLabel.setForeground(new java.awt.Color(255, 255, 255));
        presentStudentLabel.setText("Present Student    :");
        jPanel1.add(presentStudentLabel);
        presentStudentLabel.setBounds(110, 310, 220, 32);

        absentStudentLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        absentStudentLabel.setForeground(new java.awt.Color(255, 255, 255));
        absentStudentLabel.setText("Absent Student    :");
        jPanel1.add(absentStudentLabel);
        absentStudentLabel.setBounds(110, 370, 220, 30);

        headline.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headline.setForeground(new java.awt.Color(255, 255, 255));
        headline.setText("Attendance Date");
        jPanel1.add(headline);
        headline.setBounds(120, 230, 210, 40);

        presentCnt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        presentCnt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(presentCnt);
        presentCnt.setBounds(380, 310, 140, 30);

        absCnt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        absCnt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(absCnt);
        absCnt.setBounds(360, 380, 90, 30);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Present", "Absent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 480, 690, 300);

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateLabel);
        dateLabel.setBounds(370, 230, 150, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Previous Attendance Summary");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 420, 350, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/button Sign Out.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(730, 10, 150, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/MIST_Logo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 0, 220, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 230, 230, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 300, 230, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 300, 210, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 360, 230, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(350, 360, 210, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 420, 370, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/blue (2).jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(350, 230, 210, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/BG2.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-10, 0, 900, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        if(course.equals("JAVA"))
        { Workbook workbook;
       
          try {
              workbook = new XSSFWorkbook(new FileInputStream("javaSummary.xlsx"));
              
              Sheet sheet=workbook.getSheetAt(0);
               int rowCount= sheet.getPhysicalNumberOfRows();
                String prSt,abSt;
               prSt=Integer.toString(pr);
               abSt=Integer.toString(ab);
               for(int i=1;i<rowCount;i++)
               {
                   String checkDate=sheet.getRow(i).getCell(0).toString();
                   if(dat.equals(checkDate))
                   {
                       roww=i;
                       break;
                   }
               }
               if(roww!=-1)
               {
                    
                   sheet.getRow(roww).getCell(1).setCellValue(prSt);
                   sheet.getRow(roww).getCell(2).setCellValue(abSt);
               }
               else{
                    Row row=sheet.createRow(rowCount);
               Cell cellDate=row.createCell(0);
               cellDate.setCellValue(dat);
               
              
               Cell cellPr=row.createCell(1);
               cellPr.setCellValue(prSt);
               Cell cellAb=row.createCell(2);
               cellAb.setCellValue(abSt);
               }
               FileOutputStream out= new FileOutputStream(new File("javaSummary.xlsx"));
               workbook.write(out);
               out.close();              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);    
          }
    }
        else if(course.equals("DiscreteMath"))
        {
            Workbook workbook;
       
          try {
              workbook = new XSSFWorkbook(new FileInputStream("discreteSummary.xlsx"));
              
              Sheet sheet=workbook.getSheetAt(0);
               int rowCount= sheet.getPhysicalNumberOfRows();
                String prSt,abSt;
               prSt=Integer.toString(pr);
               abSt=Integer.toString(ab);
               for(int i=1;i<rowCount;i++)
               {
                   String checkDate=sheet.getRow(i).getCell(0).toString();
                   if(dat.equals(checkDate))
                   {
                       roww=i;
                       break;
                   }
               }
               if(roww!=-1)
               {
                    
                   sheet.getRow(roww).getCell(1).setCellValue(prSt);
                   sheet.getRow(roww).getCell(2).setCellValue(abSt);
               }
               else{
                    Row row=sheet.createRow(rowCount);
               Cell cellDate=row.createCell(0);
               cellDate.setCellValue(dat);
               
              
               Cell cellPr=row.createCell(1);
               cellPr.setCellValue(prSt);
               Cell cellAb=row.createCell(2);
               cellAb.setCellValue(abSt);
               }
               FileOutputStream out= new FileOutputStream(new File("discreteSummary.xlsx"));
               workbook.write(out);
               out.close();              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);    
          }
        }
         else if(course.equals("DS AlGO"))
        {
             Workbook workbook;
       
          try {
              workbook = new XSSFWorkbook(new FileInputStream("dsSummary.xlsx"));
              
              Sheet sheet=workbook.getSheetAt(0);
               int rowCount= sheet.getPhysicalNumberOfRows();
                String prSt,abSt;
               prSt=Integer.toString(pr);
               abSt=Integer.toString(ab);
               for(int i=1;i<rowCount;i++)
               {
                   String checkDate=sheet.getRow(i).getCell(0).toString();
                   if(dat.equals(checkDate))
                   {
                       roww=i;
                       break;
                   }
               }
               if(roww!=-1)
               {
                    
                   sheet.getRow(roww).getCell(1).setCellValue(prSt);
                   sheet.getRow(roww).getCell(2).setCellValue(abSt);
               }
               else{
                    Row row=sheet.createRow(rowCount);
               Cell cellDate=row.createCell(0);
               cellDate.setCellValue(dat);
               
              
               Cell cellPr=row.createCell(1);
               cellPr.setCellValue(prSt);
               Cell cellAb=row.createCell(2);
               cellAb.setCellValue(abSt);
               }
               FileOutputStream out= new FileOutputStream(new File("dsSummary.xlsx"));
               workbook.write(out);
               out.close();              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(summaryPage.class.getName()).log(Level.SEVERE, null, ex);    
          }
        }
          LogIn ln=new LogIn();
          this.setVisible(false);
          ln.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(summaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(summaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(summaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(summaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new summaryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absCnt;
    private javax.swing.JLabel absentStudentLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel headline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel presentCnt;
    private javax.swing.JLabel presentStudentLabel;
    // End of variables declaration//GEN-END:variables

     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mist_logo.png")));
    }
}
