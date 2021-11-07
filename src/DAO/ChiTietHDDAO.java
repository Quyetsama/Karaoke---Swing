/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.ChiTietHD;
import DTO.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanqu
 */
public class ChiTietHDDAO {
    public static boolean insertChiTietHD(List<ChiTietHD> listCTHD){
        boolean result = false;
        
        ConnectDB myConnection = ConnectDB.getInstance();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into ChiTietHD (ID, MaHD, MaSP, SL) values ";
            for(int i = 0; i < listCTHD.size(); i++){
                if(i == listCTHD.size() - 1){
                    sql = sql + "(null, '"+ listCTHD.get(i).getMahd() +"', '"+ listCTHD.get(i).getMasp() +"', '"+ listCTHD.get(i).getSl() +"')";
                }
                else{
                    sql = sql + "(null, '"+ listCTHD.get(i).getMahd() +"', '"+ listCTHD.get(i).getMasp() +"', '"+ listCTHD.get(i).getSl() +"'), ";
                }
            }
            
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
