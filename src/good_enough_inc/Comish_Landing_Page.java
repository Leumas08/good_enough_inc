/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package good_enough_inc;

import javax.swing.JFrame;

/**
 *
 * @author Francesco_Cassarino
 */
public class Comish_Landing_Page extends javax.swing.JFrame {

    /**
     * Creates new form Comish_Landing_Page
     */
    public Comish_Landing_Page() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        setSize(1000, 600);
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
        jLabel5 = new javax.swing.JLabel();
        Enter_Student = new javax.swing.JButton();
        Enter_Com = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Role");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 83, 980, 39);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/good_enough_inc/L1.JPG"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 179, 80);

        Enter_Student.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Enter_Student.setText("Student");
        Enter_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Enter_Student);
        Enter_Student.setBounds(350, 200, 290, 91);

        Enter_Com.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Enter_Com.setText("Election Commissioner");
        Enter_Com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_ComActionPerformed(evt);
            }
        });
        getContentPane().add(Enter_Com);
        Enter_Com.setBounds(350, 310, 290, 91);

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/good_enough_inc/Wildcat.png"))); // NOI18N
        getContentPane().add(jLabel75);
        jLabel75.setBounds(0, 0, 960, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enter_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_StudentActionPerformed
        // TODO add your handling code here:
        JFrame Stu=new Student();
        Stu.setSize(1000, 600);
        Stu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Enter_StudentActionPerformed

    private void Enter_ComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_ComActionPerformed
        // TODO add your handling code here:
        JFrame Com=new Commission_Frame();
        Com.setSize(1000, 600);
        Com.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Enter_ComActionPerformed

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
            java.util.logging.Logger.getLogger(Comish_Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comish_Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comish_Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comish_Landing_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comish_Landing_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter_Com;
    private javax.swing.JButton Enter_Student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel75;
    // End of variables declaration//GEN-END:variables
}
