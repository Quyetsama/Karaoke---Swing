/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vanqu
 */
public class HoaDonDAO {
    public static String getMHD(){
        String mhd = "";

        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select MaHD from HoaDon ORDER BY MaHD DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                mhd = rs.getString("MaHD");
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
        
        return mhd;
    }
    
    public static boolean insertHoaDon(HoaDon hd){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into HoaDon (MaHD, IDPhong, TG, ThanhTien) values ('"+ hd.getMahd() +"', '"+ hd.getIdphong() +"', '"+ hd.getTg() +"', '"+ hd.getThanhtien() +"')";
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
