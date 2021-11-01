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
public class DanhMuc {
    private int id;
    private String tendm;
    
    public DanhMuc(){}
    
    public DanhMuc(int id, String tendm){
        this.id = id;
        this.tendm = tendm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendm() {
        return tendm;
    }

    public void setTendm(String tendm) {
        this.tendm = tendm;
    }

    @Override
    public String toString() {
        return this.tendm;
    }
}
