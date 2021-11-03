/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.DanhMuc;
import DTO.NhaCC;
import DTO.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanqu
 */
public class SanPhamDAO {
    public static List<SanPham> getAll(){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<SanPham> listSP = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT sp.MaSanPham, sp.TenSanPham, dm.ID,dm.TenDanhMuc, sp.SoLuong, sp.DonGia, ncc.MaNCC, ncc.TenNCC as NCC FROM SanPham as sp, DanhMuc as dm, NhaCC as ncc WHERE sp.DanhMuc = dm.ID AND sp.NCC = ncc.MaNCC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listSP.add(new SanPham(rs.getString("MaSanPham"), rs.getString("TenSanPham"), rs.getInt("ID"), rs.getString("TenDanhMuc"), rs.getInt("SoLuong"), rs.getInt("DonGia"), rs.getString("MaNCC"), rs.getString("NCC")));
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
        
        return listSP;
    }
    
    public static List<SanPham> getByDanhMuc(DanhMuc dm){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<SanPham> listSP = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT sp.MaSanPham, sp.TenSanPham, dm.ID,dm.TenDanhMuc, sp.SoLuong, sp.DonGia, ncc.MaNCC, ncc.TenNCC as NCC FROM SanPham as sp, DanhMuc as dm, NhaCC as ncc WHERE sp.DanhMuc = dm.ID AND ncc.MaNCC = sp.NCC AND dm.ID = '"+ dm.getId() +"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listSP.add(new SanPham(rs.getString("MaSanPham"), rs.getString("TenSanPham"), rs.getInt("ID"), rs.getString("TenDanhMuc"), rs.getInt("SoLuong"), rs.getInt("DonGia"), rs.getString("MaNCC"), rs.getString("NCC")));
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
        
        return listSP;
    }
    
    public static List<SanPham> getByNCC(String mncc){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<SanPham> listSP = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT sp.TenSanPham FROM SanPham as sp, DanhMuc as dm, NhaCC as ncc WHERE sp.DanhMuc = dm.ID AND ncc.MaNCC = sp.NCC AND sp.NCC = '"+ mncc +"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listSP.add(new SanPham(rs.getString("TenSanPham")));
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
        
        return listSP;
    }
    
    public static String getMSP(){
        String msp = "";
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select MaSanPham from SanPham ORDER BY MaSanPham DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                msp = rs.getString("MaSanPham");
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
        
        return msp;
    }
    
    public static boolean insertSanPham(SanPham sp){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into SanPham (MaSanPham, TenSanPham, DanhMuc, SoLuong, DonGia, NCC) values ('"+ sp.getMsp() +"', '"+ sp.getTensp() +"', '"+ sp.getIddm() +"', '"+ sp.getSl()+"', '"+ sp.getDongia() +"', '"+ sp.getMncc()+"')";
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
    
    public static boolean updateSanPham(SanPham sp){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "update SanPham set TenSanPham = '"+ sp.getTensp() +"', DanhMuc = '"+ sp.getIddm() +"', SoLuong = '"+ sp.getSl() +"', DonGia = '"+ sp.getDongia() +"', NCC = '"+ sp.getMncc() +"' where MaSanPham = '"+ sp.getMsp() +"'";
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
    
    public static boolean deleteSanPham(String msp){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "delete from SanPham where MaSanPham = '"+ msp +"'";
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
    
    public static List<SanPham> searchSanPham(String tensp){
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        List<SanPham> listSP = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT sp.MaSanPham, sp.TenSanPham, dm.ID,dm.TenDanhMuc, sp.SoLuong, sp.DonGia, ncc.MaNCC, ncc.TenNCC as NCC FROM SanPham as sp, DanhMuc as dm, NhaCC as ncc WHERE sp.DanhMuc = dm.ID AND ncc.MaNCC = sp.NCC AND TenSanPham like N'%"+ tensp +"%'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                listSP.add(new SanPham(rs.getString("MaSanPham"), rs.getString("TenSanPham"), rs.getInt("ID"), rs.getString("TenDanhMuc"), rs.getInt("SoLuong"), rs.getInt("DonGia"), rs.getString("MaNCC"), rs.getString("NCC")));
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
        
        return listSP;
    }
}
