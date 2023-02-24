/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author sami
 */
public class AdminNoticeDao {
    
 public static void deleteNotice(String date)
    {
        String query = "delete from adminNotice where date = '"+date+"'";
        DbOperations.setDataOrDelete(query, "Notice Deleted Successfully");
    }
 
 public static void updateNotice(String newDate,String newNotice)
    {
        String query = "update adminNotice set notice = '"+newNotice+"' where id ='1'";
        DbOperations.setDataOrDelete(query,"Notice Updated  Successfully");
        
        String anotherQuery = "update adminNotice set date = '"+newDate+"' where id ='1'";
        DbOperations.setDataOrDeleteWithoutMessage(anotherQuery);
    }
}
