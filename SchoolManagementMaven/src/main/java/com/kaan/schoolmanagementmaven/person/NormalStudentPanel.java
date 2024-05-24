/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kaan.schoolmanagementmaven.person;

import java.io.IOException;
import com.kaan.schoolmanagementmaven.SchoolManagementGUI;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import com.kaan.schoolmanagementmaven.dataaccess.query.ExamNoteQueries;
import com.kaan.schoolmanagementmaven.dataaccess.query.IExamNoteAddingQueries;
import com.kaan.schoolmanagementmaven.dataaccess.query.ILessonFetchingQuery;
import com.kaan.schoolmanagementmaven.dataaccess.query.IPersonFetchingQueries;
import com.kaan.schoolmanagementmaven.dataaccess.query.ITeacherInformationQueries;
import com.kaan.schoolmanagementmaven.dataaccess.query.LessonFetchingQuery;
import com.kaan.schoolmanagementmaven.dataaccess.query.PersonFetchingQueries;
import com.kaan.schoolmanagementmaven.dataaccess.query.PersonInformationQuery;
import com.kaan.schoolmanagementmaven.exception.NotSufficentCreditException;
import com.kaan.schoolmanagementmaven.exception.ReachedMaximumRowNumberException;
import com.kaan.schoolmanagementmaven.factory.ILessonFactory;
import com.kaan.schoolmanagementmaven.factory.LessonFactory;
import com.kaan.schoolmanagementmaven.lesson.Lesson;

/**
 *
 * @author kaan
 *
 */
public class NormalStudentPanel extends javax.swing.JFrame {

    private Student student;
    private SchoolManagementGUI mainPanel;
    private ILessonFetchingQuery lessonFetchingQuery;
    private IPersonFetchingQueries personFetcher;
    private ILessonFactory lessonFactory;
    private ITeacherInformationQueries teacherInfo;

    /**
     * Creates new form StudentPanel
     *
     * @param mainPanel
     * @param student
     */
    public NormalStudentPanel(SchoolManagementGUI mainPanel, Student student) throws SQLException {
        initComponents();
        this.student = student;
        this.mainPanel = mainPanel;
        lessonFetchingQuery = LessonFetchingQuery.getInstance();
        teacherInfo = PersonInformationQuery.getInstanceForTeacher();
        personFetcher = PersonFetchingQueries.getInstance();
        lessonListForAdding.removeAllItems();
        lessonListForRemove.removeAllItems();
        int uid = personFetcher.getPersonUIDByNameAndLastname(student.getName(), student.getLastName());
        List<String> studentLessonList = lessonFetchingQuery.getNormalStudentLessonNames(uid);
        List<String> allLessonNames = lessonFetchingQuery.getAllLessonNames();
        for (String currentLessonName : allLessonNames) {
            if (studentLessonList.contains(currentLessonName)) {
                lessonListForRemove.addItem(currentLessonName);
            } else {
                lessonListForAdding.addItem(currentLessonName);
            }
        }
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                mainPanel.setVisible(true); // İkinci JFrame kapatıldığında ilk JFrame'i görünür yap
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

        jLabel1 = new javax.swing.JLabel();
        showExamButton = new javax.swing.JButton();
        lessonListForAdding = new javax.swing.JComboBox<>();
        addLessonButton = new javax.swing.JButton();
        lessonListForRemove = new javax.swing.JComboBox<>();
        removeLessonButton = new javax.swing.JButton();
        beWorkingStudentButton = new javax.swing.JButton();
        teacherList = new javax.swing.JComboBox<>();
        accountSettingsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Normal Student Panel");

        showExamButton.setText("Show Exam Informations");
        showExamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showExamButtonActionPerformed(evt);
            }
        });

        lessonListForAdding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lessonListForAdding.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lessonListForAddingItemStateChanged(evt);
            }
        });
        lessonListForAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonListForAddingActionPerformed(evt);
            }
        });

        addLessonButton.setText("Add");
        addLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLessonButtonActionPerformed(evt);
            }
        });

        lessonListForRemove.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeLessonButton.setText("Remove");
        removeLessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLessonButtonActionPerformed(evt);
            }
        });

        beWorkingStudentButton.setText("Become Working Student");
        beWorkingStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beWorkingStudentButtonActionPerformed(evt);
            }
        });

        teacherList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teacherList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListActionPerformed(evt);
            }
        });

        accountSettingsButton.setText("Account Settings");
        accountSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lessonListForRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessonListForAdding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(teacherList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeLessonButton)
                    .addComponent(addLessonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(accountSettingsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beWorkingStudentButton)
                            .addComponent(showExamButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(showExamButton)
                .addGap(56, 56, 56)
                .addComponent(beWorkingStudentButton)
                .addGap(52, 52, 52)
                .addComponent(accountSettingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLessonButton)
                    .addComponent(teacherList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessonListForAdding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeLessonButton)
                    .addComponent(lessonListForRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showExamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showExamButtonActionPerformed
        try {
            JOptionPane.showMessageDialog(null, student.showExamInfo());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showExamButtonActionPerformed

    private void beWorkingStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beWorkingStudentButtonActionPerformed
        try {
            String name = student.getName();
            String lastName = student.getLastName();
            int oldStudentUID = personFetcher.getPersonUIDByNameAndLastname(name, lastName);
            student.beWorkingStudent();
            JOptionPane.showMessageDialog(null, "Successful");
            int newUID = personFetcher.getPersonUIDByNameAndLastname(name, lastName);
            if (Student.getLogManager() != null) {
                Student.getLogManager().saveMessage(oldStudentUID + " UID numbered normal student converted to working student . New UID number : " + newUID);

            }
            mainPanel.setVisible(true);
            student = null;
            this.dispose();
        } catch (SQLException | IOException | ReachedMaximumRowNumberException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_beWorkingStudentButtonActionPerformed

    private void addLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLessonButtonActionPerformed
        if (lessonListForAdding.getSelectedItem() == null) {
            return ;
        }
        try {
            lessonFactory = LessonFactory.getInstance();
            int lessonIndex = lessonListForAdding.getSelectedIndex();
            String name = (String) lessonListForAdding.getSelectedItem();
            int lessonUID = lessonFetchingQuery.getLessonUIDByLessonName(name);
            Lesson lesson = lessonFactory.createLessonWhichExistInDb(lessonUID);
            String teacherNameAndLastname = (String) teacherList.getSelectedItem();
            if (teacherNameAndLastname == null) {
                JOptionPane.showMessageDialog(null, "You cant choose this lesson.");
                return;
            }
            String[] nameAndLastname = teacherNameAndLastname.split(" ");
            int teacherUID = personFetcher.getPersonUIDByNameAndLastname(nameAndLastname[0], nameAndLastname[1]);
            student.addLesson(lesson, teacherUID);
            int studentUID = personFetcher.getPersonUIDByNameAndLastname(student.getName(), student.getLastName());
            lessonListForAdding.removeItemAt(lessonIndex);
            lessonListForRemove.addItem(name);
            JOptionPane.showMessageDialog(null, "Successful.");
            if (Student.getLogManager() != null) {
                Student.getLogManager().saveMessage(studentUID + " UID numbered student added " + lessonUID + " UID numbered lesson.");

            }
        } catch (SQLException | IOException ex) {
            if (ex instanceof IOException) {
                JOptionPane.showMessageDialog(null, "An error occured while writing to log file.");
            } else {
                ex.printStackTrace();
            }
        } catch (NotSufficentCreditException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        /*
        try {
            lessonFactory = LessonFactory.getInstance();
            int lessonIndex = lessonListForAdding.getSelectedIndex();
            String name = (String) lessonListForAdding.getSelectedItem();
            int lessonUID = lessonFetchingQuery.getLessonUIDByLessonName(name);
            Lesson lesson = lessonFactory.createLessonWhichExistInDb(lessonUID);
            if (teacherList.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "You cant choose this lesson.");
                return;
            }
            String teacherNameAndLastname = (String) teacherList.getSelectedItem();
            String[] nameAndLastname = teacherNameAndLastname.split(" ");
            int teacherUID = personFetcher.getPersonUIDByNameAndLastname(nameAndLastname[0], nameAndLastname[1]);
            workingStudent.addLesson(lesson, teacherUID);
            int studentUID = personFetcher.getPersonUIDByNameAndLastname(workingStudent.getName(), workingStudent.getLastName());
            examTableAdder.addWorkingStudentToExamNoteTable(studentUID, lessonUID);
            lessonListForAdding.removeItemAt(lessonIndex);
            lessonListForRemove.addItem(name);
            JOptionPane.showMessageDialog(null, "Successful.");
            if (WorkingStudent.getLogManager() != null) {
                WorkingStudent.getLogManager().saveMessage(studentUID + " UID numbered student added " + lessonUID + " UID numbered lesson.");
            }
        } catch (SQLException | IOException ex) {
            if (ex instanceof IOException) {
                JOptionPane.showMessageDialog(null, "An error occured while writing to log file.");
            } else {
                ex.printStackTrace();
            }
        } catch (NotSufficentCreditException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        */
    }//GEN-LAST:event_addLessonButtonActionPerformed

    private void lessonListForAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonListForAddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonListForAddingActionPerformed

    private void removeLessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLessonButtonActionPerformed
        if (lessonListForRemove.getSelectedItem() == null) {
            return ;
        }
        try {
            lessonFactory = LessonFactory.getInstance();
            int lessonIndex = lessonListForRemove.getSelectedIndex();
            String name = (String) lessonListForRemove.getSelectedItem();
            int lessonUID = lessonFetchingQuery.getLessonUIDByLessonName(name);
            Lesson lesson = lessonFactory.createLessonWhichExistInDb(lessonUID);
            student.removeLesson(lesson);
            lessonListForRemove.removeItemAt(lessonIndex);
            lessonListForAdding.addItem(name);
            JOptionPane.showMessageDialog(null, "Successful.");
            int studentUID = personFetcher.getPersonUIDByNameAndLastname(student.getName(), student.getLastName());
            if (Student.getLogManager() != null) {
                Student.getLogManager().saveMessage(studentUID + " UID numbered student removed " + lessonUID + " UID numbered lesson.");
            }
        } catch (SQLException | IOException ex) {
            if (ex instanceof IOException) {
                JOptionPane.showMessageDialog(null, "An error occured while writing to log file.");
            } else {
                ex.printStackTrace();
            }
        } catch (NotSufficentCreditException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_removeLessonButtonActionPerformed

    private void teacherListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherListActionPerformed

    private void lessonListForAddingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lessonListForAddingItemStateChanged
        teacherList.removeAllItems();
        if (lessonListForAdding.getSelectedItem() != null) {
            try {
                lessonFetchingQuery = LessonFetchingQuery.getInstance();
                teacherInfo = PersonInformationQuery.getInstanceForTeacher();
                String lessonName = (String) lessonListForAdding.getSelectedItem();
                if (lessonName == null) {
                    teacherList.removeAllItems();
                    return;
                }
                int branchUID = lessonFetchingQuery.getLessonUIDByLessonName(lessonName);
                List<String> teacherNameList = teacherInfo.getAllTeacherNameWith(branchUID);
                List<String> teacherLastnameList = teacherInfo.getAllTeacherLastnameWith(branchUID);
                for (int i = 0; i < teacherNameList.size(); i++) {
                    teacherList.addItem(teacherNameList.get(i) + " " + teacherLastnameList.get(i));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_lessonListForAddingItemStateChanged

    private void accountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsButtonActionPerformed
        try {
            new NormalStudentAccountSettingsPanel(student, this).setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_accountSettingsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NormalStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountSettingsButton;
    private javax.swing.JButton addLessonButton;
    private javax.swing.JButton beWorkingStudentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> lessonListForAdding;
    private javax.swing.JComboBox<String> lessonListForRemove;
    private javax.swing.JButton removeLessonButton;
    private javax.swing.JButton showExamButton;
    private javax.swing.JComboBox<String> teacherList;
    // End of variables declaration//GEN-END:variables
}