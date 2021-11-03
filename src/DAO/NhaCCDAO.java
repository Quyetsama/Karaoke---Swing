/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.NhaCC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanqu
 */
public class NhaCCDAO {
    public static List<NhaCC> getAll(){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<NhaCC> listNCC = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from NhaCC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listNCC.add(new NhaCC(rs.getString("MaNCC"), rs.getString("TenNCC"), rs.getString("SDT"), rs.getString("DiaChi")));
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
        
        return listNCC;
    }
    
    public static String getMNCC(){
        String mncc = "";

        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select MaNCC from NhaCC ORDER BY MaNCC DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                mncc = rs.getString("MaNCC");
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
        
        return mncc;
    }
    
    public static boolean insertNhaCC(NhaCC ncc){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into NhaCC (MaNCC, TenNCC, SDT, DiaChi) values ('"+ ncc.getMncc() +"', '"+ ncc.getTenncc() +"', '"+ ncc.getSdt() +"', '"+ ncc.getDiachi() +"')";
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
    
    public static boolean updateNhaCC(NhaCC ncc){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "update NhaCC set TenNCC = '"+ ncc.getTenncc() +"', SDT = '"+ ncc.getSdt() +"', DiaChi = '"+ ncc.getDiachi() +"' where MaNCC = '"+ ncc.getMncc() +"'";
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
    
    public static boolean deleteNhanVien(String mncc){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "delete from NhaCC where MaNCC = '"+ mncc +"'";
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
    
    public static List<NhaCC> searchNhaCC(String tenncc){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<NhaCC> listNCC = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from NhaCC where TenNCC like N'%"+ tenncc +"%'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listNCC.add(new NhaCC(rs.getString("MaNCC"), rs.getString("TenNCC"), rs.getString("SDT"), rs.getString("DiaChi")));
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
        
        return listNCC;
    }
}
