/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author sami
 */
public class ManagerNoticeDao {
    
public static void deleteNotice(String date)
    {
        String query = "delete from managerNotice where date = '"+date+"'";
        DbOperations.setDataOrDelete(query, "Notice Deleted Successfully");
    }
 
 public static void updateNotice(String newDate,String newNotice)
    {
        String query = "update managerNotice set notice = '"+newNotice+"' where id ='7'";
        DbOperations.setDataOrDelete(query,"Notice Updated  Successfully");
        
        String anotherQuery = "update managerNotice set date = '"+newDate+"' where id ='7'";
        DbOperations.setDataOrDeleteWithoutMessage(anotherQuery);
    }
}