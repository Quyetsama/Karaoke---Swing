/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DanhMucDAO;
import DTO.DanhMuc;

/**
 *
 * @author vanqu
 */
public class DanhMucBUS {
    public static boolean insertDanhMuc(String tendm){
        return DanhMucDAO.insertDanhMuc(tendm);
    }
    
    public static boolean updateDanhMuc(DanhMuc dm){
        return DanhMucDAO.updateDanhMuc(dm);
    }
    
    public static boolean deleteDanhMuc(String mdm){
        return DanhMucDAO.deleteDanhMuc(mdm);
    }
}
