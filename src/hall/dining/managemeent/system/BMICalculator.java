/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hall.dining.managemeent.system;

import dao.AdminNoticeDao;
import dao.DbOperations;
import dao.ManagerNoticeDao;
import dao.UserDao;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.AdminNotice;
import model.ManagerNotice;
import model.User;

/**
 *
 * @author sami
 */
public class BMICalculator extends javax.swing.JFrame {

    //String month = txtMonth.getText();
    public String numPattern = "^[0-9]*$";
    public String numFloatingPattern = "^[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)$";
    public String userEmail;


    /**
     * Creates new form StudentProfile
     */
    public BMICalculator() {
        initComponents();
        //btnPost.setEnabled(false);
        //showNotice();
        displayIndicator();
        btnCalcualte.setEnabled(false);
        
    }

    public BMICalculator(String email) {
        initComponents();
        userEmail = email;
        //btnPost.setEnabled(false);
        //showNotice();
        displayIndicator();
        btnCalcualte.setEnabled(false);
    }
    
    public void displayIndicator()
    {
        tt1.setVisible(false);
        tt2.setVisible(false);
        tt3.setVisible(false);
        tt4.setVisible(false);
        tt5.setVisible(false);
        tt6.setVisible(false);
        
        
    }
    public void validateFields() {
       String feet = textFeet.getText();
       String inches = textInches.getText();
       String kgs = textkgs.getText();
       
       if(!feet.equals("") && feet.matches(numPattern) && !inches.equals("") && inches.matches(numPattern) && !kgs.equals("") && feet.matches(numFloatingPattern))
       {
           btnCalcualte.setEnabled(true);
       }
       else
       {
           btnCalcualte.setEnabled(false);
       }
    }
    
    public void calculateBMI()
    {
        float result ;
        float weight = Float.parseFloat(textkgs.getText());
        float height = (float) (Float.parseFloat(textFeet.getText()) *  0.3048  + Float.parseFloat(textInches.getText()) *  0.0254);
        float bmi = weight / (height*height);
        textLabel.setVisible(true);
        textLabel.setText(new DecimalFormat("##.#").format(bmi));
        
        float b = Float.parseFloat(new DecimalFormat("##.#").format(bmi));
        
        if(b<18.5)
        {
            tt1.setVisible(true);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
        }
        
        else if(b>=18.5 && b<=24.9)
        {
            tt1.setVisible(false);
            tt2.setVisible(true);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
        }
        
         else if(b>=25.0 && b<=29.9)
        {
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(true);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
        }
        
        else if(b>=30.0 && b<=34.9)
        {
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(true);
            tt5.setVisible(false);
            tt6.setVisible(false);
        }
        
        else if(b>=35.0 && b<=39.9)
        {
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(true);
            tt6.setVisible(false);
        }
        
        else if(b>40.0)
        {
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(true);
        }
    }
    
    public void clear()
    {
        textFeet.setText("");
        textInches.setText("");
        textkgs.setText("");
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
            textLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        jCTextField5 = new app.bolivia.swing.JCTextField();
        jCTextField16 = new app.bolivia.swing.JCTextField();
        popupMenu1 = new java.awt.PopupMenu();
        verticalLayout1 = new org.jfree.ui.tabbedui.VerticalLayout();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        textBox1 = new org.jfree.text.TextBox();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBack = new javax.swing.JLabel();
        btnCalcualte = new rojerusan.RSMaterialButtonRectangle();
        btnClear = new rojerusan.RSMaterialButtonRectangle();
        textInches = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFeet = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textkgs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tt2 = new javax.swing.JLabel();
        tt1 = new javax.swing.JLabel();
        tt3 = new javax.swing.JLabel();
        tt4 = new javax.swing.JLabel();
        tt5 = new javax.swing.JLabel();
        tt6 = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel12.setText("jLabel7");

        jLabel14.setText("jLabel7");

        jCTextField2.setText("jCTextField1");

        jCTextField5.setText("jCTextField1");

        jCTextField16.setText("jCTextField1");

        popupMenu1.setLabel("popupMenu1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(956, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dyuthi", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidebarIcon/icons8-fat-man-cry-50.png"))); // NOI18N
        jLabel9.setText("BMI Calcualtor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBack.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8_Rewind_48px.png"))); // NOI18N
        jBack.setText("Back");
        jBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBackMouseClicked(evt);
            }
        });
        jPanel2.add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 790));

        btnCalcualte.setBackground(new java.awt.Color(255, 51, 51));
        btnCalcualte.setText("Calculate");
        btnCalcualte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcualteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcualte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 150, 51));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 51));

        textInches.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textInches.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        textInches.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textInchesKeyReleased(evt);
            }
        });
        jPanel1.add(textInches, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 80, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Inches");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        textFeet.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textFeet.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        textFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFeetActionPerformed(evt);
            }
        });
        textFeet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFeetKeyReleased(evt);
            }
        });
        jPanel1.add(textFeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Feets");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/BMI-images.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 120, -1));

        textkgs.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textkgs.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        textkgs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textkgsKeyReleased(evt);
            }
        });
        jPanel1.add(textkgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 70, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Kgs.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/new_BMI_BODY_ILLUSTRATION .png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 690, 350));

        tt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, -1, -1));

        tt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, -1));

        tt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 670, -1, -1));

        tt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, -1, -1));

        tt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, -1, -1));

        tt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/donald_Trump.png"))); // NOI18N
        jPanel1.add(tt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, -1, -1));

        textLabel.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        textLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(textLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8-cross-30.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcualteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcualteActionPerformed
       
        calculateBMI();
        //setVisible(false);
        //new BMICalcualtor().setVisible(true);
    }//GEN-LAST:event_btnCalcualteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
       clear();
       
    }//GEN-LAST:event_btnClearActionPerformed

    /*public void showData()
    {
        User user = null;
        user = UserDao.getAllData(userEmail);
        lb_name.setText(user.getName());
        lb_roll.setText(user.getRoll());
        lb_boarder.setText(user.getBoarder());
        lb_email.setText(userEmail);
        lb_mobileNumber.setText(user.getMobileNumber());
        lb_securityQuestion.setText(user.getSecurityQuestion());
    }*/

    private void jBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBackMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new StudentHome(userEmail).setVisible(true);
    }//GEN-LAST:event_jBackMouseClicked

    private void textFeetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFeetKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textFeetKeyReleased

    private void textInchesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textInchesKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textInchesKeyReleased

    private void textkgsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textkgsKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textkgsKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"<html> <b style=\\\"color:red\\\">Incorrect Username or Password</b></html>","Confirm Dialog Box",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/popupicon/warning.png");

        //int a = JOptionPane.showConfirmDialog(null,"Do you really want to close application?","Select",JOptionPane.YES_NO_OPTION);
        int a = JOptionPane.showConfirmDialog(null,"<html> <b style=\"color:red\">Do you really want close application?</b></html>" , "Select", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE ,icon);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void textFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFeetActionPerformed

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
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMICalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnCalcualte;
    private rojerusan.RSMaterialButtonRectangle btnClear;
    private javax.swing.JLabel jBack;
    private javax.swing.JButton jButton5;
    private app.bolivia.swing.JCTextField jCTextField16;
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.PopupMenu popupMenu1;
    private org.jfree.text.TextBox textBox1;
    private javax.swing.JTextField textFeet;
    private javax.swing.JTextField textInches;
    private javax.swing.JLabel textLabel;
    private javax.swing.JTextField textkgs;
    private javax.swing.JLabel tt1;
    private javax.swing.JLabel tt2;
    private javax.swing.JLabel tt3;
    private javax.swing.JLabel tt4;
    private javax.swing.JLabel tt5;
    private javax.swing.JLabel tt6;
    private org.jfree.ui.tabbedui.VerticalLayout verticalLayout1;
    // End of variables declaration//GEN-END:variables
}
