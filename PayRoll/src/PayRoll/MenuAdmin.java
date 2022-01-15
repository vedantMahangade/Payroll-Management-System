/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRoll;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Vedant
 */
public class MenuAdmin extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form MainMenu
     */
    public MenuAdmin() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        conn = con_class.java_con();
        lbl_emp.setText(String.valueOf(Emp.empID));  
        selfDet();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout_but = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_cont = new javax.swing.JLabel();
        lbl_doj = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        EmpRp = new javax.swing.JMenuItem();
        EmpAlrp = new javax.swing.JMenuItem();
        EmpDrp = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Logged in as : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 100, 30);

        lbl_emp.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbl_emp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emp.setText("ID");
        getContentPane().add(lbl_emp);
        lbl_emp.setBounds(120, 0, 60, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 40, 630, 10);

        logout_but.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        logout_but.setForeground(new java.awt.Color(0, 152, 153));
        logout_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        logout_but.setFocusTraversalPolicyProvider(true);
        logout_but.setHideActionText(true);
        logout_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_butActionPerformed(evt);
            }
        });
        getContentPane().add(logout_but);
        logout_but.setBounds(600, 0, 50, 40);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(64, 67, 40, 30);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 170, 90, 30);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(62, 117, 50, 30);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contact");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 220, 50, 30);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 320, 60, 30);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hire Date");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 270, 70, 30);

        lbl_name.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_name);
        lbl_name.setBounds(170, 70, 130, 30);

        lbl_lname.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_lname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_lname);
        lbl_lname.setBounds(300, 70, 130, 30);

        lbl_gender.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_gender.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_gender);
        lbl_gender.setBounds(170, 120, 260, 30);

        lbl_cont.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_cont.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_cont);
        lbl_cont.setBounds(170, 220, 260, 30);

        lbl_doj.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_doj.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_doj);
        lbl_doj.setBounds(170, 270, 260, 30);

        lbl_dob.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_dob.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_dob);
        lbl_dob.setBounds(170, 170, 260, 30);

        lbl_email.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_email);
        lbl_email.setBounds(170, 320, 260, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, -20, 1366, 768);

        jMenu1.setText("Employee");

        jMenuItem4.setText("View Employee");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Add/Update/Delete Employee");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        EmpRp.setText("Employee's Report");
        EmpRp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpRpActionPerformed(evt);
            }
        });
        jMenu2.add(EmpRp);

        EmpAlrp.setText("Employee Allowance Report");
        EmpAlrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpAlrpActionPerformed(evt);
            }
        });
        jMenu2.add(EmpAlrp);

        EmpDrp.setText("Employee Deduction Report");
        EmpDrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDrpActionPerformed(evt);
            }
        });
        jMenu2.add(EmpDrp);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Payment");

        jMenuItem6.setText("Update Allowance");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Deductions");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Pay Salary");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Past Payments");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Audit");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("All Logins");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Other");

        jMenuItem14.setText("Change Password");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Add Admin");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(671, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    public void selfDet(){
        try{
            String id = lbl_emp.getText().toString();
            String sql ="select First_Name,Last_Name,DateOfBirth,Gender,Contact,DateOfJoining,Email from Administration where Admin_ID=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,id);
            rs=pst.executeQuery();
            if(rs.next()){
                                
                String add1 =rs.getString("First_Name");
                lbl_name.setText(add1);

                String add3 =rs.getString("Last_Name");
                lbl_lname.setText(add3);

                String add4 =rs.getString("DateOfBirth");
                lbl_dob.setText(add4);
                
                String add7 =rs.getString("Gender");
                lbl_gender.setText(add7);
                
                String add8 =rs.getString("DateOfJoining");
                lbl_doj.setText(add8);
               
                String add10 =rs.getString("Email");
                lbl_email.setText(add10);
               
                String add11 =rs.getString("Contact");
                lbl_cont.setText(add11);
                
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(SQLException e){

            }
        }

    }
    
    private void EmpRpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpRpActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            try {
                String sql ="select * from employee";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(13);
                myDocument.open();
                float[] columnWidths = new float[] {5,7,7,7,6,7,9,8,9,7,5,6,7};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); //set table width to 100%
                myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Middle Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Last Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date Of Birth",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Contact",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                // table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                // table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Designation",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date Hired",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Grade",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("AddedBy",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                while(rs.next()){
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    
                }
                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();  
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
            }
            catch(DocumentException | HeadlessException | FileNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
            finally {
                try{
                    rs.close();
                    pst.close();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }

    }//GEN-LAST:event_EmpRpActionPerformed

    private void EmpAlrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpAlrpActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Allowance Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            try {
                String sql ="select *from allowance";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(12);
                myDocument.open();
                float[] columnWidths = new float[] {3,3,8,8,5,4,4,4,5,4,5,5};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); //set table width to 100%
                myDocument.add(new Paragraph("Employees Allowance List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                 table.addCell(new PdfPCell(new Paragraph("Emp_ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Overtime",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Bonus",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Other",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Rate",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Allowance",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("AddedBy",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                while(rs.next())
                {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                }
                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();  
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
            }
            catch(DocumentException | HeadlessException | FileNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            }   
            finally {
                try{
                    rs.close();
                    pst.close();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
    }//GEN-LAST:event_EmpAlrpActionPerformed

    private void EmpDrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDrpActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Deduction Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            try {
                String sql ="select *from deductions";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(8);
                myDocument.open();
                float[] columnWidths = new float[] {7,3,7,7,5,5,9,5};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); //set table width to 100%
                myDocument.add(new Paragraph("Employees Deduction List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("Deduction ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Last Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Amount",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Reason",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Made By",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                while(rs.next())
                {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                }
                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();  
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
            }
            catch(DocumentException | HeadlessException | FileNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
            finally {
                try{
                    rs.close();
                    pst.close();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }

    }//GEN-LAST:event_EmpDrpActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         ViewAllEmp vae = new ViewAllEmp();
        vae.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        UpdateEmp ue = new UpdateEmp();
        ue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Allowance af = new Allowance();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        deduction df = new deduction();
        df.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Payslip ps = new Payslip();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Audit adf = new Audit();
        adf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        passupdate pu = new passupdate();
        pu.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Add_Admin ad= new Add_Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        AllPayments ap = new AllPayments();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void logout_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_butActionPerformed
        // TODO add your handling code here:
        LogIn x = new LogIn();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_butActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JMenuItem EmpAlrp;
    private javax.swing.JMenuItem EmpDrp;
    private javax.swing.JMenuItem EmpRp;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_cont;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_doj;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JButton logout_but;
    // End of variables declaration//GEN-END:variables
}