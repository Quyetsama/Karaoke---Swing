/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.PhongDAO;
import DTO.Phong;

/**
 *
 * @author vanqu
 */
public class PhongBUS {
    public static boolean startPhong(Phong p){
        return PhongDAO.startPhong(p);
    }
    
    public static boolean stopPhong(Phong p){
        return PhongDAO.stopPhong(p);
    }
    
    public static boolean insertPhong(String tenp){
        return PhongDAO.insertPhong(tenp);
    }
    
    public static boolean updatePhong(Phong p){
        return PhongDAO.updatePhong(p);
    }
    
    public static boolean deletePhong(String id){
        return PhongDAO.deletePhong(id);
    }
}
