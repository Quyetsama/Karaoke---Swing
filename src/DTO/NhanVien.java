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
public class NhanVien {
    private String mnv, hoten, diachi, sdt;
    private int gioitinh, tuoi;
    
    public NhanVien(){}
    
    public NhanVien(String mnv, String hoten, int gioitinh, int tuoi, String diachi, String sdt){
        this.mnv = mnv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    
    public NhanVien(String hoten, int gioitinh, int tuoi, String diachi, String sdt){
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return this.hoten;
    }
    
}
