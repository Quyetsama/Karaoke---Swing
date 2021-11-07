/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.Phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanqu
 */
public class PhongDAO {
    public static List<Phong> getAll(){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<Phong> listP = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from Phong";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listP.add(new Phong(rs.getInt("ID"), rs.getString("TenPhong"), rs.getInt("TrangThai"), String.valueOf(rs.getTime("TG")), String.valueOf(rs.getTimestamp("TG"))));
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        return listP;
    }
    
    public static boolean startPhong(Phong p){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "update Phong set TrangThai = '"+ p.getTrangthai() +"', TG = '"+ p.getTimestamp() +"' where ID = '"+ p.getId() +"'";
            ps = conn.prepareStatement(sql);
            
            if (ps.executeUpdate() > 0) {
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
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return result;
    }
    
    public static boolean stopPhong(Phong p){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "update Phong set TrangThai = 0, TG = NULL where ID = '"+ p.getId() +"'";
            ps = conn.prepareStatement(sql);
            
            if (ps.executeUpdate() > 0) {
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
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return result;
    }
}
