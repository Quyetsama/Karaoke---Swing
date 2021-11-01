/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVien;
import karaoke.frmQLNV;

/**
 *
 * @author vanqu
 */
public class NhanVienBUS {
    public static boolean insertSinhVien(NhanVien nv){      
        String mnv = NhanVienDAO.getMNV();
        String[] s = mnv.split("NV");
        if(mnv.equals("")){
            nv.setMnv("NV001");
        }
        else if(Integer.parseInt(s[1]) + 1 < 10){
            nv.setMnv("NV00" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        else{
            nv.setMnv("NV0" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        return NhanVienDAO.insertNhanVien(nv);
    }
    
    public static boolean updateNhanVien(NhanVien nv){
        if(!NhanVienDAO.checkMNV(nv.getMnv())){
            return NhanVienDAO.updateNhanVien(nv);
        }
        frmQLNV.message = "Mã nhân viên không tồn tại!";
        return false;
    }
    
    public static boolean deleteNhanVien(String mnv){
        if(!NhanVienDAO.checkMNV(mnv)){
            return NhanVienDAO.deleteNhanVien(mnv);
        }
        frmQLNV.message = "Mã nhân viên không tồn tại!";
        return false;
    }
}
