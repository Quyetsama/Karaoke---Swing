/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.DoanhThu;
import DTO.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
    public static List<DoanhThu> getDoanhThu(int slNgay){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<DoanhThu> listDT = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT DATE(TG) AS NG, SUM(ThanhTien) AS DT FROM HoaDon GROUP BY NG ORDER BY NG DESC LIMIT " + slNgay;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listDT.add(new DoanhThu(rs.getDate("NG").toString(), rs.getInt("DT")));
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
        
        return listDT;
    }
    
    public static int getDoanhThuHomNay(){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT SUM(ThanhTien) as DT FROM HoaDon WHERE DATE(TG) = current_date()";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if(rs.next()){
                return rs.getInt("DT");
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
        
        return 0;
    }
}
