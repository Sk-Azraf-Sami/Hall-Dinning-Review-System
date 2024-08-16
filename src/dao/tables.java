/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author sami
 */
public class tables {

    public static void main(String args[]) {

        try {
            // add QUERY 

/*** USER TABLE ***/
            
            // CREATING USER TABLE
            String userTable = "create table user (id int primary key AUTO_INCREMENT,name varchar(200),email varchar(200),roll varchar(200),boarder varchar(200),mobileNumber varchar(11),securityQuestion varchar(200),answer varchar(200),password varchar(200),status varchar(20),UNIQUE (email),UNIQUE (roll),UNIQUE (boarder))";
             DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
             
            // ADD ADMIN DETAILS TO USER TABLE
            String adminDetails = "insert into user(name,email,roll,boarder,mobileNumber,securityQuestion,answer,password,status) values('Admin','admin@gmail.com','0000001','0001','01715216477','who are you?','sami','admin','true')";
             DbOperations.setDataOrDelete(adminDetails,"Admin Details Added Successfully");
            
              
            // ADD MANAGER DETAILS TO USER TABLE
            String managerDetails = "insert into user(name,email,roll,boarder,mobileNumber,securityQuestion,answer,password,status) values('Manager','manager@gmail.com','000002','0002','01521503837','who are you?','sami','manager','true')";
            DbOperations.setDataOrDelete(managerDetails,"Manager Details Added Successfully");
           
        
/*** MANAGER NOTICE TABLE ***/

            String managerNoticeTable = "create table managerNotice(id int AUTO_INCREMENT primary key,date varchar(200),notice varchar(9000))";
            DbOperations.setDataOrDelete(managerNoticeTable,"Manager Notice Table Created Successfully");
            
/*** ADMIN NOTICE TABLE ***/

            String adminNoticeTable = "create table adminNotice(id int AUTO_INCREMENT primary key,date varchar(200),notice varchar(9000))";
            DbOperations.setDataOrDelete(adminNoticeTable,"Admin Notice Table Created Successfully");
            String adminDefaultNotice = "insert into adminNotice(date,notice) values('No Information is available','Keep eyes here for updated notice (:')";
            DbOperations.setDataOrDelete(adminDefaultNotice,"Admin Notice Details Added Successfully");
            
/*** STUDENT FEEDBACK TABLE ***/

            String studentFeedbackTable = "create table studentFeedback(id int AUTO_INCREMENT primary key,email varchar(200),date varchar(200),time varchar(100), rating varchar(200), comment varchar(200))";
            DbOperations.setDataOrDelete(studentFeedbackTable,"studentFeedback Table Created Successfully");
            
            
           /*String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
           DbOperations.setDataOrDelete(productTable,"Product Table Created Successfully!"); */
            

        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
