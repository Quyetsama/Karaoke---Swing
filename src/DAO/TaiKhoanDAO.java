/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vanqu
 */
public class TaiKhoanDAO {
    public static boolean Login(String username, String password){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from TaiKhoan where username = '"+ username +"' and password = '"+ password +"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                result = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(ps != null){
                ps.close();
                }
                if(rs != null){
                    rs.close();
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        return result;
    }
}
