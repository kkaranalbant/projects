/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kaan.schoolmanagementmaven.admin;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.kaan.schoolmanagementmaven.person.Student;
import com.kaan.schoolmanagementmaven.person.Teacher;
import com.kaan.schoolmanagementmaven.person.WorkingStudent;

/**
 *
 * @author kaan
 * 
 */
public class AdminLogFileProcessPanel extends javax.swing.JFrame {
    private File file ;
    /**
     * Creates new form AdminLogFileProcessPanel
     */
    public AdminLogFileProcessPanel(AdminPanel adminPanel) {
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                adminPanel.setVisible(true); // İkinci JFrame kapatıldığında ilk JFrame'i görünür yap
            }
        });
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
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        adminLogFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentLogFileButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        teacherLogFileButton = new javax.swing.JButton();
        workingStudentLogFileButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Admin Log File");

        adminLogFileButton.setText("Choose File");
        adminLogFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Log File");

        studentLogFileButton.setText("Choose File");
        studentLogFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLogFileButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Teacher Log File");

        teacherLogFileButton.setText("Choose File");
        teacherLogFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLogFileButtonActionPerformed(evt);
            }
        });

        workingStudentLogFileButton.setText("Choose File");
        workingStudentLogFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingStudentLogFileButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Working Student Log File");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherLogFileButton)
                            .addComponent(studentLogFileButton)
                            .addComponent(workingStudentLogFileButton)
                            .addComponent(adminLogFileButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adminLogFileButton))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentLogFileButton))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(workingStudentLogFileButton))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(teacherLogFileButton))
                .addGap(50, 50, 50)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        file = jFileChooser1.getSelectedFile() ;
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void adminLogFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogFileButtonActionPerformed
        if (file == null) return ;
        try {
            Admin.setLogManager(file);
            jFileChooser1.setCurrentDirectory(null);
            JOptionPane.showMessageDialog(null, "Successful.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_adminLogFileButtonActionPerformed

    private void studentLogFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLogFileButtonActionPerformed
        if (file == null) return ;
        try {
            Student.setLogManager(file);
            jFileChooser1.setCurrentDirectory(null);
            JOptionPane.showMessageDialog(null, "Successful.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_studentLogFileButtonActionPerformed

    private void teacherLogFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLogFileButtonActionPerformed
        if (file == null) return ;
        try {
            Teacher.setLogManager(file);
            jFileChooser1.setCurrentDirectory(null);
            JOptionPane.showMessageDialog(null, "Successful.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_teacherLogFileButtonActionPerformed

    private void workingStudentLogFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingStudentLogFileButtonActionPerformed
        if (file == null) return ;
        try {
            WorkingStudent.setLogManager(file);
            jFileChooser1.setCurrentDirectory(null);
            JOptionPane.showMessageDialog(null, "Successful.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_workingStudentLogFileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogFileProcessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogFileProcessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogFileProcessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogFileProcessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLogFileButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton studentLogFileButton;
    private javax.swing.JButton teacherLogFileButton;
    private javax.swing.JButton workingStudentLogFileButton;
    // End of variables declaration//GEN-END:variables
}
