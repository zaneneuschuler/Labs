/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7exercises;

/**
 *
 * @author legsl_000
 */
public class lab7Form extends javax.swing.JFrame {

    /**
     * Creates new form lab7Form
     */
    public lab7Form() {
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

        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSkills = new javax.swing.JTextField();
        txtYears = new javax.swing.JTextField();
        lstPeople = new java.awt.List();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFileExit = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuEditAddStudent = new javax.swing.JMenuItem();
        mnuEditAddEmployee = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));

        txtAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        txtAge.setBorder(javax.swing.BorderFactory.createTitledBorder("Age"));

        txtSkills.setBorder(javax.swing.BorderFactory.createTitledBorder("Skills/Major"));

        txtYears.setBorder(javax.swing.BorderFactory.createTitledBorder("Years Worked/ Credits"));

        mnuFile.setMnemonic('f');
        mnuFile.setText("File");

        mnuFileExit.setMnemonic('x');
        mnuFileExit.setText("Exit");
        mnuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileExit);

        jMenuBar1.add(mnuFile);

        mnuEdit.setMnemonic('e');
        mnuEdit.setText("Edit");

        mnuEditAddStudent.setMnemonic('s');
        mnuEditAddStudent.setText("Add Student");
        mnuEditAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditAddStudentActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuEditAddStudent);

        mnuEditAddEmployee.setMnemonic('e');
        mnuEditAddEmployee.setText("Add Employee");
        mnuEditAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditAddEmployeeActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuEditAddEmployee);

        jMenuBar1.add(mnuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lstPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(txtYears, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lstPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuFileExitActionPerformed

    private void mnuEditAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditAddStudentActionPerformed
        // TODO add your handling code here:
        String info = "";
        
        //create student
        student myStudent = new student();
        myStudent.setName(txtName.getText());
        myStudent.setAddress(txtAddress.getText());
        myStudent.setAge(Integer.parseInt(txtAge.getText()));
        myStudent.setMajor(txtSkills.getText());
        myStudent.setUnitsCompleted(Integer.parseInt(txtYears.getText()));
        
        info = myStudent.getInfo();
        lstPeople.add(info);
        
    }//GEN-LAST:event_mnuEditAddStudentActionPerformed

    private void mnuEditAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditAddEmployeeActionPerformed
        // TODO add your handling code here:
        //copy paste from student
                String info = "";
        
        //create student
        employee myEmployee = new employee();
        myEmployee.setName(txtName.getText());
        myEmployee.setAddress(txtAddress.getText());
        myEmployee.setAge(Integer.parseInt(txtAge.getText()));
        myEmployee.setJobSkills(txtSkills.getText());
        myEmployee.setYearsWorked(Integer.parseInt(txtYears.getText()));
        
        info = myEmployee.getInfo();
        lstPeople.add(info);
    }//GEN-LAST:event_mnuEditAddEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(lab7Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab7Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab7Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab7Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab7Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.List lstPeople;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenuItem mnuEditAddEmployee;
    private javax.swing.JMenuItem mnuEditAddStudent;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileExit;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSkills;
    private javax.swing.JTextField txtYears;
    // End of variables declaration//GEN-END:variables
}
