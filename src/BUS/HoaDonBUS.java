/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDon;

/**
 *
 * @author vanqu
 */
public class HoaDonBUS {
    public static String insertHoaDon(HoaDon hd){      
        String mhd = HoaDonDAO.getMHD();
        String[] s = mhd.split("HD");
        if(mhd.equals("")){
            hd.setMahd("HD001");
        }
        else if(Integer.parseInt(s[1]) + 1 < 10){
            hd.setMahd("HD00" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        else{
            hd.setMahd("HD0" + String.valueOf(Integer.parseInt(s[1]) + 1));
        }
        if(HoaDonDAO.insertHoaDon(hd)){
            return hd.getMahd();
        }
        return null;
    }
}
