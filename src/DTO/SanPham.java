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
public class SanPham {
    private String msp, tensp, mncc, ncc, tendm;
    int sl, dongia, iddm;
    
    public SanPham(){}
    
    public SanPham(String tensp){
        this.tensp = tensp;
    }
    
    public SanPham(String msp, String tensp, int dongia){
        this.msp = msp;
        this.tensp = tensp;
        this.dongia = dongia;
    }
    
    public SanPham(String msp, String tensp, int iddm, int sl, int dongia, String mncc){
        this.msp = msp;
        this.tensp = tensp;
        this.iddm = iddm;
        this.sl = sl;
        this.dongia = dongia;
        this.mncc = mncc;
    }
    
    public SanPham(String msp, String tensp, int iddm, String tendm, int sl, int dongia, String mncc, String ncc){
        this.msp = msp;
        this.tensp = tensp;
        this.iddm = iddm;
        this.tendm = tendm;
        this.sl = sl;
        this.dongia = dongia;
        this.mncc = mncc;
        this.ncc = ncc;
    }
    
    public SanPham(String tensp, int iddm, int sl, int dongia, String mncc){
        this.tensp = tensp;
        this.iddm = iddm;
        this.sl = sl;
        this.dongia = dongia;
        this.mncc = mncc;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getTendm() {
        return tendm;
    }

    public void setTendm(String tendm) {
        this.tendm = tendm;
    }

    public int getIddm() {
        return iddm;
    }

    public void setIddm(int iddm) {
        this.iddm = iddm;
    }

    public String getMncc() {
        return mncc;
    }

    public void setMncc(String mncc) {
        this.mncc = mncc;
    }
    

    @Override
    public String toString() {
        return this.tensp;
    }
    
}
