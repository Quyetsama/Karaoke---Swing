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
public class Phong {
    public static final int MoneyPerMinute = 1000;
    private int id, trangthai;
    private String tenphong, tg, timestamp;
    
    public Phong(){}
    
    public Phong(int id, String tenphong, int trangthai, String tg, String timestamp){
        this.id = id;
        this.tenphong = tenphong;
        this.trangthai = trangthai;
        this.tg = tg;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        if(this.trangthai == 1){
            return this.tenphong + " - Đang sử dụng - " + this.tg;
        }
        return this.tenphong + " - Chưa sử dụng";
    }
}
