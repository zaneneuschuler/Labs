/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.text.DecimalFormat;
/**
 *
 * @author zane
 */
public class Lab5Form extends javax.swing.JFrame {

    /**
     * Creates new form Lab5Form
     */
    public Lab5Form() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtAmount = new javax.swing.JTextField();
        lblTwenties = new javax.swing.JLabel();
        lblTens = new javax.swing.JLabel();
        lblFives = new javax.swing.JLabel();
        lblOnes = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCommish = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        txtSales = new javax.swing.JTextField();
        btnKill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAmount.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Amount"));

        lblTwenties.setBorder(javax.swing.BorderFactory.createTitledBorder("Twenties"));

        lblTens.setBorder(javax.swing.BorderFactory.createTitledBorder("Tens"));

        lblFives.setBorder(javax.swing.BorderFactory.createTitledBorder("Fives"));

        lblOnes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ones"));

        btnCalc.setText("Calculate");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTens, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTwenties, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(btnCalc)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOnes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFives, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnCalc)))
                .addGap(18, 18, 18)
                .addComponent(lblTwenties, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblTens, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOnes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("Exercise 1", jPanel1);

        lblCommish.setBorder(javax.swing.BorderFactory.createTitledBorder("Commission"));

        lblTax.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales Tax"));

        lblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Grand Total"));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtSales.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales Amount"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(btnCalculate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCommish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSales, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCommish, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCalculate)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Exercise 2", jPanel2);

        btnKill.setText("Exit");
        btnKill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKillActionPerformed(evt);
            }
        });

        jLabel1.setText("CS-119 Lab 5");

        jLabel2.setText("Zane Neuschuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKill)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnKill))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKillActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKillActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        //declare variables
        int Money = 0;
        int Twenties = 0;
        int Tens = 0;
        int Fives = 0;
        int Ones = 0;
        
        //time to do things
        Money = Integer.parseInt(txtAmount.getText());
        
        Twenties = Money / 20;
        Money = Money - (Twenties * 20);
        Tens = Money / 10;
        Money = Money - (Tens * 10);
        Fives = Money / 5;
        Money = Money - (Fives * 5);
        Ones = Money;
        
        //print to labels
        lblTwenties.setText(Integer.toString(Twenties));
        lblTens.setText(Integer.toString(Tens));
        lblFives.setText(Integer.toString(Fives));
        lblOnes.setText(Integer.toString(Ones));
        
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        //declare stuff
        //i declare that peeps are gross, why do people like them
        //i declare that i will come to class every day ( wait i already do that)
        /**
         * i declare that
         * The fact that so many books still name the Beatles as "the greatest 
         * or most significant or most influential" rock band ever only tells you how far 
         * rock music still is from becoming a serious art. Jazz critics have long recognized that
         * the greatest jazz musicians of all times are Duke Ellington and John Coltrane, who were
         * not the most famous or richest or best sellers of their times, let alone of all times. 
         * Classical critics rank the highly controversial Beethoven over classical musicians who were
         * highly popular in courts around Europe. Rock critics are still blinded by commercial success.
         * The Beatles sold more than anyone else (not true, by the way), therefore they must have been
         * the greatest. Jazz critics grow up listening to a lot of jazz music of the past, classical
         * critics grow up listening to a lot of classical music of the past. Rock critics are often
         * totally ignorant of the rock music of the past, they barely know the best sellers.
         * No wonder they will think that the Beatles did anything worthy of being saved.
         **/
        //anyways back on track
        float commish = 0;
        float tax = 0;
        float cash = 0;
        float total = 0;
        String fmt = "$0.00";
        DecimalFormat df = new DecimalFormat(fmt);//gonna format to make it look pretty
        String txtCommish = "";
        String txtTax = "";
        String txtTotal = "";
        
        //do werk
        cash = Float.parseFloat(txtSales.getText() ); //don't do tostring, just gettext, always
        commish = calcCommish(cash);
        tax = calcTax(cash);
        total = calcFinal(cash, tax);
        
        //format
        txtCommish = df.format(commish);
        txtTax = df.format(tax);
        txtTotal = df.format(total);
        //display
        
        lblCommish.setText(txtCommish);
        lblTax.setText(txtTax);
        lblTotal.setText(txtTotal);
        
        
        
    }//GEN-LAST:event_btnCalculateActionPerformed
   private float calcCommish(float cash){
        float commish;
        commish = 0.00f;
        
        if(cash <= 200){
            commish = cash * 0.02f;
        }
        else if(cash <=499){
            commish = cash * 0.05f;
        }
        else if(cash <= 999){
            commish = cash * 0.08f;
        }
        else{
            commish = cash * 0.1f;
        }
        return commish;
    }
private float calcTax(float cash){
    float SalesTax = 0.075f;
    return cash * 0.075f;
}
private float calcFinal(float cash, float tax){
    return cash + tax;
}
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
            java.util.logging.Logger.getLogger(Lab5Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5Form().setVisible(true);
            }
        });
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnKill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCommish;
    private javax.swing.JLabel lblFives;
    private javax.swing.JLabel lblOnes;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTens;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTwenties;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtSales;
    // End of variables declaration//GEN-END:variables
}