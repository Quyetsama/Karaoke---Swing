/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaCCDAO;
import DTO.NhaCC;

/**
 *
 * @author vanqu
 */
public class NhaCCBUS {
    public static boolean insertNhaCC(NhaCC ncc){      
        String mncc = NhaCCDAO.getMNCC();
        String[] s = mncc.split("NCC");
        if(mncc.equals("")){
            ncc.setMncc("NCC001");
        }
        else if(Integer.parseInt(s[1]) + 1 < 10){
            ncc.setMncc("NCC00" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        else{
            ncc.setMncc("NCC0" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        return NhaCCDAO.insertNhaCC(ncc);
    }
    
    public static boolean updateNhaCC(NhaCC ncc){
        return NhaCCDAO.updateNhaCC(ncc);
    }
    
    public static boolean deleteNhaCC(String mncc){
        return NhaCCDAO.deleteNhanVien(mncc);
    }
}
