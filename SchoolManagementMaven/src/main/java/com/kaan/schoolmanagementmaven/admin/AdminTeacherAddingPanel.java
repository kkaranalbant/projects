/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kaan.schoolmanagementmaven.admin;

import java.io.IOException;
import com.kaan.schoolmanagementmaven.dataaccess.query.LessonFetchingQuery;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import com.kaan.schoolmanagementmaven.exception.InvalidBoundAndOriginPairException;
import com.kaan.schoolmanagementmaven.exception.NotUniqueNameAndLastnameException;
import com.kaan.schoolmanagementmaven.dataaccess.query.ILessonFetchingQuery;
import com.kaan.schoolmanagementmaven.exception.BoundAndOriginRangeSmallerThanRowNumberException;
import com.kaan.schoolmanagementmaven.exception.IntersectingUIDRangeException;
import com.kaan.schoolmanagementmaven.exception.InvalidBalanceException;
import com.kaan.schoolmanagementmaven.exception.InvalidBranchException;
import com.kaan.schoolmanagementmaven.exception.InvalidPhoneCountryCodeException;
import com.kaan.schoolmanagementmaven.exception.InvalidPhoneNumberLengthException;
import com.kaan.schoolmanagementmaven.exception.InvalidSalaryException;
import com.kaan.schoolmanagementmaven.exception.NotUniquePhoneNumberException;

/**
 *
 * @author kaan
 *
 */
public class AdminTeacherAddingPanel extends javax.swing.JFrame {

    private ILessonFetchingQuery lessonCreatingQuery;
    private Admin admin;

    /**
     * Creates new form AdminTeacherAddingPanel
     *
     * @throws java.sql.SQLException
     */
    public AdminTeacherAddingPanel(AdminPanel adminPanel, Admin admin) throws SQLException {
        initComponents();
        lessonCreatingQuery = LessonFetchingQuery.getInstance();
        this.admin = admin;
        lessonList.removeAllItems();
        List<String> lessonList = lessonCreatingQuery.getAllLessonNames();
        for (String lessonName : lessonList) {
            this.lessonList.addItem(lessonName);
        }
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
        teacherName = new javax.swing.JTextField();
        teacherLastName = new javax.swing.JTextField();
        teacherAddingButton = new javax.swing.JButton();
        lessonList = new javax.swing.JComboBox<>();
        teacherSalary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        teacherUIDOriginTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teacherUIDBoundTextField = new javax.swing.JTextField();
        teacherUIDOriginButton = new javax.swing.JButton();
        teacherUIDBoundButton = new javax.swing.JButton();
        phoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        defaultBalanceChangingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        teacherName.setText("Name");

        teacherLastName.setText("Lastname");

        teacherAddingButton.setText("ADD");
        teacherAddingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAddingButtonActionPerformed(evt);
            }
        });

        lessonList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lessonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonListActionPerformed(evt);
            }
        });

        teacherSalary.setText("Salary");

        jLabel1.setText("Teacher Adding Panel");

        jLabel2.setText("Teacher UID Origin");

        jLabel3.setText("Teacher UID Bound");

        teacherUIDOriginButton.setText("change");
        teacherUIDOriginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherUIDOriginButtonActionPerformed(evt);
            }
        });

        teacherUIDBoundButton.setText("change");
        teacherUIDBoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherUIDBoundButtonActionPerformed(evt);
            }
        });

        phoneNumber.setText("Phone Number");

        jLabel4.setText("Default Balance");

        defaultBalanceChangingButton.setText("change");
        defaultBalanceChangingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBalanceChangingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(teacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(teacherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(teacherSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lessonList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherUIDBoundTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(teacherUIDOriginTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(136, 136, 136))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4)
                        .addGap(407, 407, 407)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(teacherAddingButton)
                        .addComponent(teacherUIDOriginButton))
                    .addComponent(teacherUIDBoundButton)
                    .addComponent(defaultBalanceChangingButton))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherAddingButton)
                    .addComponent(teacherSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessonList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherUIDOriginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(teacherUIDOriginButton))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(teacherUIDBoundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherUIDBoundButton))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defaultBalanceChangingButton)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lessonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonListActionPerformed

    private void teacherAddingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAddingButtonActionPerformed
        String name = teacherName.getText();
        String lastName = teacherLastName.getText();
        String branchName = (String) lessonList.getSelectedItem();
        String phone = phoneNumber.getText();
        int salary = 0;
        try {
            salary = Integer.parseInt(teacherSalary.getText());
            Map<String, String> userNameAndPass = admin.getAdminAddingManager().addTeacher(name, lastName, branchName, salary, phone);
            String userName = null;
            String pass = null;
            for (Entry<String, String> entry : userNameAndPass.entrySet()) {
                userName = entry.getKey();
                pass = entry.getValue();
            }
            JOptionPane.showMessageDialog(null, "Successful.\nUsername : " + userName + "\nPassword : " + pass);
            if (Admin.getLogManager() != null) {
                Admin.getLogManager().saveMessage("Teacher added : " + name + "  " + lastName);
            }
        } catch (NumberFormatException | InputMismatchException | NotUniqueNameAndLastnameException | SQLException | IOException | InvalidPhoneNumberLengthException | InvalidPhoneCountryCodeException | NotUniquePhoneNumberException | InvalidBranchException | InvalidSalaryException | IntersectingUIDRangeException ex) {
            showErrorMessage(ex);
        }
    }//GEN-LAST:event_teacherAddingButtonActionPerformed

    private void teacherUIDOriginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherUIDOriginButtonActionPerformed
        String originText = teacherUIDOriginTextField.getText();
        try {
            int origin = Integer.parseInt(originText);
            System.out.println("Girilen deger" + origin);
            admin.getAdminDefaultTeacherProcessesObject().setTeacherUIDOrigin(origin);
            JOptionPane.showMessageDialog(null, "Successful");
            if (Admin.getLogManager() != null) {
                Admin.getLogManager().saveMessage("Teacher UID origin value changed . New value : " + origin);
            }
        } catch (NumberFormatException | InputMismatchException | SQLException | InvalidBoundAndOriginPairException | IOException | BoundAndOriginRangeSmallerThanRowNumberException ex) {
            showErrorMessage(ex);
        }
    }//GEN-LAST:event_teacherUIDOriginButtonActionPerformed

    private void teacherUIDBoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherUIDBoundButtonActionPerformed
        String boundText = teacherUIDBoundTextField.getText();
        try {
            int bound = Integer.parseInt(boundText);
            admin.getAdminDefaultTeacherProcessesObject().setTeacherUIDBound(bound);
            JOptionPane.showMessageDialog(null, "Successful");
            if (Admin.getLogManager() != null) {
                Admin.getLogManager().saveMessage("Teacher UID bound value changed . New value : " + bound);
            }
        } catch (NumberFormatException | InputMismatchException | SQLException | InvalidBoundAndOriginPairException | IOException | BoundAndOriginRangeSmallerThanRowNumberException ex) {
            showErrorMessage(ex);
        }
    }//GEN-LAST:event_teacherUIDBoundButtonActionPerformed

    private void defaultBalanceChangingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultBalanceChangingButtonActionPerformed
        String balanceText = defaultBalanceChangingButton.getText();
        try {
            int balanceValue = Integer.parseInt(balanceText);
            admin.getAdminDefaultTeacherProcessesObject().setDefaultBalance(balanceValue);
            if (Admin.getLogManager() != null) {
                Admin.getLogManager().saveMessage("Default balance value changed . New value : " + balanceValue);
            }
        } catch (InvalidBalanceException | SQLException | IOException ex) {
            showErrorMessage(ex);
        }
    }//GEN-LAST:event_defaultBalanceChangingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTeacherAddingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTeacherAddingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTeacherAddingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTeacherAddingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    private void showErrorMessage(Exception ex) {
        if (ex instanceof NumberFormatException || ex instanceof InputMismatchException) {
            JOptionPane.showMessageDialog(null, "Invalid number format.");
        } else {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton defaultBalanceChangingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> lessonList;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton teacherAddingButton;
    private javax.swing.JTextField teacherLastName;
    private javax.swing.JTextField teacherName;
    private javax.swing.JTextField teacherSalary;
    private javax.swing.JButton teacherUIDBoundButton;
    private javax.swing.JTextField teacherUIDBoundTextField;
    private javax.swing.JButton teacherUIDOriginButton;
    private javax.swing.JTextField teacherUIDOriginTextField;
    // End of variables declaration//GEN-END:variables
}
