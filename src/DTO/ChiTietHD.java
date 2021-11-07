/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author vanqu
 */
public class ChiTietHD {
    private int id, sl;
    private String mahd, masp;
    
    public ChiTietHD(){}
    
    public ChiTietHD(int id, String mahd, String masp, int sl){
        this.id = id;
        this.mahd = mahd;
        this.masp = masp;
        this.sl = sl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    @Override
    public String toString() {
        return this.id + "";
    }
}
