/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hall.dining.managemeent.system;

import com.mysql.cj.xdevapi.Statement;
import dao.DbOperations;
import dao.UserDao;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.sql.Connection;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author sami
 */
public class Signup extends javax.swing.JFrame {

    //public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
    public String mobileNumberPattern = "^[0-9]*$"; ///////////////
    public String rollPattern = "^[0-9]*$";
    public String boarderPattern = "^[0-9]*$";
    
    
    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        btnSave.setEnabled(false);
        eyeClose.setVisible(false);
    }
    
    public void clear() //////////////////////////////////////for clear text field 
    {
        txtName.setText("");
        txtEmail.setText("");
        txtRoll.setText("");
        txtBoarder.setText("");
        txtMobileNumber.setText("");
        //txtAddress.setText("");
        txtSecurityQuestion.setText("");
        txtAnswer.setText("");
        txtPassword.setText("");
        btnSave.setEnabled(false);
    }
    
    public void validateFields(){  // /////////////
        String name = txtName.getText();
        String email = txtEmail.getText();
        String roll =txtRoll.getText();
        String boarder =txtBoarder.getText();
        String mobileNumber = txtMobileNumber.getText();
        //String address =txtAddress.getText();
        String securityQuestion = txtSecurityQuestion.getText();
        String answer = txtAnswer.getText();
        String password = txtPassword.getText();
        //System.out.println(name);
        
        if(!name.equals("") && email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern) && roll.matches(rollPattern) && boarder.matches(boarderPattern)
               && !password.equals("") && !securityQuestion.equals("") && !answer.equals("") && mobileNumber.length()==11 && roll.length()==7)
        {
            btnSave.setEnabled(true);
        }
        
        else
        {
            btnSave.setEnabled(false);
        }
    }
    
    //check duplicate roll
    public boolean checkDuplicateEmail() //! this functuon is not working
    {
        String email = txtEmail.getText();
        boolean isExist =false;
        try
        {
            Class.forName("com.mysql.jbdc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dms","root","1234"); 
            PreparedStatement pst = con.prepareStatement("select *from user where email = '"+email+"'");
            //pst.setString(1,email);
            //Statement stmt = (Statement) con.createStatement();
            //String sq12 = "select *from user where email ="++" ";
            ResultSet rs = pst.executeQuery();
            
            //ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                isExist = true; 
            }
            else
            {
                isExist = false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return isExist;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBoarder = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtSecurityQuestion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        btnSave = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        jLabel12 = new javax.swing.JLabel();
        eyeOpen = new javax.swing.JLabel();
        eyeClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtName.setBackground(new java.awt.Color(102, 102, 255));
        txtName.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtName.setToolTipText("");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 215, -1));

        jLabel3.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 60, -1));

        txtEmail.setBackground(new java.awt.Color(102, 102, 255));
        txtEmail.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 215, -1));

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Roll No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Boarder No.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txtRoll.setBackground(new java.awt.Color(102, 102, 255));
        txtRoll.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtRoll.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtRoll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRollKeyReleased(evt);
            }
        });
        jPanel1.add(txtRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 215, -1));

        txtMobileNumber.setBackground(new java.awt.Color(102, 102, 255));
        txtMobileNumber.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtMobileNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 219, -1));

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact No.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtBoarder.setBackground(new java.awt.Color(102, 102, 255));
        txtBoarder.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtBoarder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtBoarder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBoarderKeyReleased(evt);
            }
        });
        jPanel1.add(txtBoarder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 219, -1));

        jLabel8.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Security Question");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, -1));

        jLabel9.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 219, -1));

        txtSecurityQuestion.setBackground(new java.awt.Color(102, 102, 255));
        txtSecurityQuestion.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtSecurityQuestion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityQuestionKeyReleased(evt);
            }
        });
        jPanel1.add(txtSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 219, -1));

        jLabel10.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Answer");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 70, -1));

        txtAnswer.setBackground(new java.awt.Color(102, 102, 255));
        txtAnswer.setFont(new java.awt.Font("URW Bookman L", 1, 20)); // NOI18N
        txtAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 219, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Create New Account Here");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        btnExit.setBackground(new java.awt.Color(102, 102, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle1.setText("FORGOT PASSWORD?");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 190, 60));

        btnSave.setBackground(new java.awt.Color(255, 51, 51));
        btnSave.setText("CREATE NEW ACCOUNT");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 210, 60));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle3.setText("LOGIN");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 170, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8-cross-30.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        eyeOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8-eye-25.png"))); // NOI18N
        eyeOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeOpenMouseClicked(evt);
            }
        });
        jPanel1.add(eyeOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        eyeClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/icons8-hide-25.png"))); // NOI18N
        eyeClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeCloseMouseClicked(evt);
            }
        });
        jPanel1.add(eyeClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 540, 760));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExtraIcon/00 Signup3.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
          System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setRoll(txtRoll.getText());
        user.setBoarder(txtBoarder.getText());
        user.setMobileNumber(txtMobileNumber.getText());
        //user.setAddress(txtAddress.getText());
        user.setSecurityQuestion(txtSecurityQuestion.getText());
        user.setAnswer(txtAnswer.getText());
        user.setPassword(txtPassword.getText());
        
        /*if(checkDuplicateEmail()==false)
        {
            System.out.println("check....................");
            UserDao.save(user);
        
            clear();
        }
        
        else 
        {
            JOptionPane.showMessageDialog(this,"This email already exist!");
            
        }*/
       
        Boolean emailFlag=false,rollFlag=false, boarderFlag=false; //
        
        String email = txtEmail.getText();
        User userCheckEmail = null;
        userCheckEmail = UserDao.getSecurityQuestion(email);
        
        if(userCheckEmail==null)
        {
           emailFlag = true; 
        }
        
        String roll = txtRoll.getText();
        User userCheckRoll = null;
        userCheckRoll = UserDao.getSecurityQuestionRoll(roll);
        
        if(userCheckRoll == null)
        {
            rollFlag = true;
        }
        
        String boarder = txtBoarder.getText();
        User userCheckBoarder = null;
        userCheckBoarder = UserDao.getSecurityQuestionBoarder(boarder);
        
        if(userCheckBoarder==null)
        {
            boarderFlag = true;
        }
        
        if(emailFlag==false)
        {
            JOptionPane.showMessageDialog(this,"This email is already exist!");
        }
        
        else if(rollFlag==false)
        {
           JOptionPane.showMessageDialog(this,"This roll is already exist!");
        }
        
        else if(boarderFlag==false)
        {
            JOptionPane.showMessageDialog(this,"This boarder is already exist!");
        }
        
        else 
        {
            UserDao.save(user);
           clear();
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtRollKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRollKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtRollKeyReleased

    private void txtBoarderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoarderKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtBoarderKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSecurityQuestionKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        /*if(checkDuplicateEmail()==true)
        {
            JOptionPane.showMessageDialog(this,"This email already exist!");
        }*/
    }//GEN-LAST:event_txtEmailFocusLost

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/popupicon/warning.png");

        //int a = JOptionPane.showConfirmDialog(null,"Do you really want to close application?","Select",JOptionPane.YES_NO_OPTION);
        int a = JOptionPane.showConfirmDialog(null,"<html> <b style=\"color:red\">Do you really want to close this application?</b></html>" , "Select", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE ,icon);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void eyeOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeOpenMouseClicked
        // TODO add your handling code here:
        eyeOpen.setVisible(false);
        eyeClose.setVisible(true);
        txtPassword.setEchoChar((char) 0);
        
    }//GEN-LAST:event_eyeOpenMouseClicked

    private void eyeCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeCloseMouseClicked
        // TODO add your handling code here:
        eyeOpen.setVisible(true);
        eyeClose.setVisible(false);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_eyeCloseMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private rojerusan.RSMaterialButtonCircle btnSave;
    private javax.swing.JLabel eyeClose;
    private javax.swing.JLabel eyeOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtBoarder;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRoll;
    private javax.swing.JTextField txtSecurityQuestion;
    // End of variables declaration//GEN-END:variables
}
