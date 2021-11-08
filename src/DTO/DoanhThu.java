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
public class DoanhThu {
    private String ngay;
    private int doanhthu;
    
    public DoanhThu(){}
    
    public DoanhThu(String ngay, int doanhthu){
        this.ngay = ngay;
        this.doanhthu = doanhthu;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }    
}
