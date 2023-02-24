/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;
import model.UserFeedback;

/**
 *
 * @author sami
 */
public class UserDao {
    
     public static void save(User user)
    {
        
        String query = "insert into user(name,email,roll,boarder,mobileNumber,securityQuestion,answer,password,status)  values('"+user.getName()+"','"+user.getEmail()+"','"+user.getRoll()+"','"+user.getBoarder()+"','"+user.getMobileNumber()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','"+user.getPassword()+"','false')"; //will be same as tables.java
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval"); 
    }
     
    public static void saveFeedback(UserFeedback userFeedback)
    {
        String query = "insert into studentFeedback(email,date,time,rating,comment)  values('"+userFeedback.getEmail()+"','"+userFeedback.getDate()+"','"+userFeedback.getTime()+"','"+userFeedback.getRating()+"','"+userFeedback.getComment()+"')";
        DbOperations.setDataOrDelete(query, "Thanks! Your feedback posted successfully!"); 
    }   
     
     public static User login(String email,String password)
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"'and password='"+password+"'");
            while(rs.next())
            {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        return user; 
    }
     
      public static User getSecurityQuestion(String email) //for ForgotPassword page 
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where email = '"+email+"'");
            while(rs.next())
            {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
      
       public static User getSecurityQuestionRoll(String roll) //for ForgotPassword page 
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where roll = '"+roll+"'");
            while(rs.next())
            {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
    
        public static User getSecurityQuestionBoarder(String boarder) //for ForgotPassword page 
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where boarder = '"+boarder+"'");
            while(rs.next())
            {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
        
     
        public static UserFeedback getUserDate(String email) //for ForgotPassword page 
    {
        UserFeedback user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from studentFeedback where email = '"+email+"'");
            while(rs.next())
            {
                user = new UserFeedback();
                user.setDate(rs.getString("date"));
                //user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
        
        
      public static User getAllData(String email) //for student profile 
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where email = '"+email+"'");
            while(rs.next())
            {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setRoll(rs.getString("roll"));
                user.setBoarder(rs.getString("boarder"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
                
                user.setPassword(rs.getString("password"));
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return user;
    }
      
      
    public static void update(String email,String newPassword)
    {
        String query = "update user set password = '"+newPassword+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query,"Password Changed Successfully");
    }
    
    public static ArrayList<User> getAllRecord(String email) // get all records in table in verify user page 
    {
        ArrayList<User> arrayList = new ArrayList<>();
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where email like '%"+email+"%'");
            while(rs.next())
            {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setRoll(rs.getString("roll"));
                user.setBoarder(rs.getString("boarder"));
                
                user.setMobileNumber(rs.getString("mobileNumber"));
                //user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
        }
        return arrayList;
    }
    
    public static ArrayList<UserFeedback> getAllRecordFeedback(String date) // get all records in table in verify user page 
    {
        ArrayList<UserFeedback> arrayList = new ArrayList<>();
        try
        {
            ResultSet rs = DbOperations.getData("select *from studentFeedback where email like '%"+date+"%'");
            while(rs.next())
            {
                UserFeedback user = new UserFeedback();
                user.setId(rs.getInt("id"));
                //user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setDate(rs.getString("date"));
                user.setTime(rs.getString("time"));
                
                user.setRating(rs.getString("rating"));
                //user.setAddress(rs.getString("address"));
                user.setComment(rs.getString("comment"));
                //user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
        }
        return arrayList;
    }
    
    
    public static void changeStatus(String email,String status) // update user status 
    {
        String query = "update user set status='"+status+"' where email = '"+email+"'";
        DbOperations.setDataOrDelete(query,"Status Changed Successfully!");
    }
    
    public static void changePassword(String email,String oldPassword, String newPassword)
    {
        try
        {
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+oldPassword+"'");
            System.out.println(email);
            if(rs.next())
            {
                update(email,newPassword);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Old Password is Wrong!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
     public static void deleteAccount(String email)
    {
        String query = "delete from user where email = '"+email+"'";
        DbOperations.setDataOrDelete(query, "Account Deleted Successfully");
    }
    
   
}



