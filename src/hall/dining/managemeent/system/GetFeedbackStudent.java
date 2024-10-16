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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.AdminNotice;
import model.ManagerNotice;
import model.User;
import model.UserFeedback;

/**
 *
 * @author sami
 */
public class GetFeedbackStudent extends javax.swing.JFrame {

    //String month = txtMonth.getText();
    public String numPattern = "^[0-9]*$";
    public String userEmail;
    public String reaction = null; 
    

    /**
     * Creates new form StudentProfile
     */
    public GetFeedbackStudent() {
        initComponents();
        //btnPost.setEnabled(false);
       
        finger_func();
        
    }

    public GetFeedbackStudent(String email) {
        initComponents();
        userEmail = email;
        //btnPost.setEnabled(false);
       
        finger_func();
    }
    
    public void finger_func()
    {
        // TODO add your handling code here:
        fingerAngry.setVisible(false);
        fingerSad.setVisible(false);
        fingerGood.setVisible(false);
        fingerAusume.setVisible(false);
    }
    
    public void clear()
    {
        fingerAngry.setVisible(false);
        fingerSad.setVisible(false);
        fingerGood.setVisible(false);
        fingerAusume.setVisible(false);
        textComment.setText("");
        
    }
    public void validateFields() {
       
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
        roboto1 = new efectos.Roboto();
        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        rSPasswordTextPlaceHolderBeanInfo1 = new rojerusan.RSPasswordTextPlaceHolderBeanInfo();
        rSPasswordTextPlaceHolderBeanInfo2 = new rojerusan.RSPasswordTextPlaceHolderBeanInfo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBack = new javax.swing.JLabel();
        btnPost = new rojerusan.RSMaterialButtonRectangle();
        btnClear = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fingerAngry = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fingerSad = new javax.swing.JLabel();
        fingerGood = new javax.swing.JLabel();
        fingerAusume = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textComment = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel12.setText("jLabel7");

        jLabel14.setText("jLabel7");

        jCTextField2.setText("jCTextField1");

        jCTextField5.setText("jCTextField1");

        jCTextField16.setText("jCTextField1");

        popupMenu1.setLabel("popupMenu1");

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel7.setText("jLabel7");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dyuthi", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sidebarIcon/icons8-trust-50.png"))); // NOI18N
        jLabel9.setText("   My Feedback");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 306, 926));

        btnPost.setBackground(new java.awt.Color(255, 51, 51));
        btnPost.setText("SEND");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });
        jPanel1.add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 800, 150, 51));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 800, 150, 51));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Today My Reation After Dining:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/good.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/ausume.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/angry.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        fingerAngry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/finger.png"))); // NOI18N
        jPanel1.add(fingerAngry, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/sad.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        fingerSad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/finger.png"))); // NOI18N
        jPanel1.add(fingerSad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        fingerGood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/finger.png"))); // NOI18N
        jPanel1.add(fingerGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        fingerAusume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/finger.png"))); // NOI18N
        jPanel1.add(fingerAusume, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 61, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Serif", 1, 20)); // NOI18N
        jLabel11.setText("ANGRY");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 61, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Serif", 1, 20)); // NOI18N
        jLabel13.setText("SAD");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 90, 5));

        jLabel15.setFont(new java.awt.Font("Liberation Serif", 1, 20)); // NOI18N
        jLabel15.setText("AWESOME");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 61, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Serif", 1, 20)); // NOI18N
        jLabel16.setText("GOOD");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        textComment.setColumns(20);
        textComment.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        textComment.setRows(5);
        textComment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(textComment);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 360, 100));

        jPanel8.setBackground(new java.awt.Color(255, 0, 51));
        jPanel8.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 70, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 240, 5));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 370, 5));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/comment3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel8.setText("My Comment:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        jLabel10.setText("* less than 70 characters");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 720, -1, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8-cross-30.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        
        String comment = textComment.getText();
        if(reaction==null)
        {
            JOptionPane.showMessageDialog(this, "Please, Give Your Reaction!");
        }
        
        else if(comment.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please, Write Your Comment!");
        }
        
        else if(comment.length()>71)
        {
            JOptionPane.showMessageDialog(this, "Please, write your comment between 70 characters!");
        }
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentDateTime = dtf.format(now);*/
        else
        {
            UserFeedback userFeedback = new UserFeedback();
            userFeedback.setEmail(userEmail);
        
            LocalDate date = LocalDate.now();
            userFeedback.setDate(date.toString());
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US);
            LocalTime time = LocalTime.now();
            String f = formatter.format(time);
            //LocalTime time = LocalTime.now();
            
            userFeedback.setTime(f);
            userFeedback.setRating(reaction);
            userFeedback.setComment(textComment.getText());
            
            String today =date.toString();
            UserFeedback userCheckDate = null;
            userCheckDate = UserDao.getUserDate(userEmail);
            
            //System.out.println(userCheckDate.getDate());
            //System.out.println(today);
        
        if(userCheckDate == null || userCheckDate.getDate().equals(today)==false)
        {
             UserDao.saveFeedback(userFeedback);
             clear();
        }
        
        else
        {
            JOptionPane.showMessageDialog(this,"You can't send feedback twitch in a day!");
        }
        
           
     }

        //clear();
        //setVisible(false);
        //new GetFeedbackStudent().setVisible(true);
    }//GEN-LAST:event_btnPostActionPerformed

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        reaction = "Angry";
        fingerAngry.setVisible(true);
        fingerSad.setVisible(false);
        fingerGood.setVisible(false);
        fingerAusume.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        reaction = "Sad";
        fingerAngry.setVisible(false);
        fingerSad.setVisible(true);
        fingerGood.setVisible(false);
        fingerAusume.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        reaction = "Good"; 
        fingerAngry.setVisible(false);
        fingerSad.setVisible(false);
        fingerGood.setVisible(true);
        fingerAusume.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        reaction = "Awesome"; 
        fingerAngry.setVisible(false);
        fingerSad.setVisible(false);
        fingerGood.setVisible(false);
        fingerAusume.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/popupicon/warning.png");

        //int a = JOptionPane.showConfirmDialog(null,"Do you really want to close application?","Select",JOptionPane.YES_NO_OPTION);
        int a = JOptionPane.showConfirmDialog(null,"<html> <b style=\"color:red\">Do you really want to close this application?</b></html>" , "Select", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE ,icon);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(GetFeedbackStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetFeedbackStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetFeedbackStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetFeedbackStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GetFeedbackStudent().setVisible(true);
                // TODO add your handling code here:
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnClear;
    private rojerusan.RSMaterialButtonRectangle btnPost;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel fingerAngry;
    private javax.swing.JLabel fingerAusume;
    private javax.swing.JLabel fingerGood;
    private javax.swing.JLabel fingerSad;
    private javax.swing.JLabel jBack;
    private app.bolivia.swing.JCTextField jCTextField16;
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.PopupMenu popupMenu1;
    private rojerusan.RSPasswordTextPlaceHolderBeanInfo rSPasswordTextPlaceHolderBeanInfo1;
    private rojerusan.RSPasswordTextPlaceHolderBeanInfo rSPasswordTextPlaceHolderBeanInfo2;
    private efectos.Roboto roboto1;
    private javax.swing.JTextArea textComment;
    // End of variables declaration//GEN-END:variables
}
