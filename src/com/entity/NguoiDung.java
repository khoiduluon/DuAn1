/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author trantrung
 */
public class NguoiDung {
    private String user;
    private String tenND;
    private String matKhau;
    private boolean gioiTinh;
    private double soDu;

    public NguoiDung() {
    }

    public NguoiDung(String user, String tenND, String matKhau, boolean gioiTinh, double soDu) {
        this.user = user;
        this.tenND = tenND;
        this.matKhau = matKhau;
        this.gioiTinh = gioiTinh;
        this.soDu = soDu;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the tenND
     */
    public String getTenND() {
        return tenND;
    }

    /**
     * @param tenND the tenND to set
     */
    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the gioiTinh
     */
    public boolean isGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the soDu
     */
    public double getSoDu() {
        return soDu;
    }

    /**
     * @param soDu the soDu to set
     */
    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
}