/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPham;

/**
 *
 * @author vanqu
 */
public class SanPhamBUS {
    public static boolean insertSanPham(SanPham sp){      
        String msp = SanPhamDAO.getMSP();
        String[] s = msp.split("SP");
        if(msp.equals("")){
            sp.setMsp("SP001");
        }
        else if(Integer.parseInt(s[1]) + 1 < 10){
            sp.setMsp("SP00" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        else{
            sp.setMsp("SP0" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        return SanPhamDAO.insertSanPham(sp);
    }
    
    public static boolean updateSanPham(SanPham sp){
        return SanPhamDAO.updateSanPham(sp);
    }
    
    public static boolean deleteSanPham(String msp){
        return SanPhamDAO.deleteSanPham(msp);
    }
}
