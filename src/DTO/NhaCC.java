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
public class NhaCC {
    private String mncc, tenncc, sdt, diachi;
    
    public NhaCC(){}
    
    public NhaCC(String mncc, String tenncc, String sdt, String diachi){
        this.mncc = mncc;
        this.tenncc = tenncc;
        this.sdt = sdt;
        this.diachi = diachi;
    }
    
    public NhaCC(String mncc, String tenncc){
        this.mncc = mncc;
        this.tenncc = tenncc;
    }

    public String getMncc() {
        return mncc;
    }

    public void setMncc(String mncc) {
        this.mncc = mncc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return this.tenncc;
    }
}
