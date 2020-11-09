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
public class MucTieu {
    private String tenMucTieu;
    private double giaTri;
    private double soTienDaTK;
    private int thoiHan;
    private String ngayTao;

    public MucTieu() {
    }

    public MucTieu(String tenMucTieu, double giaTri, double soTienDaTK, int thoiHan, String ngayTao) {
        this.tenMucTieu = tenMucTieu;
        this.giaTri = giaTri;
        this.soTienDaTK = soTienDaTK;
        this.thoiHan = thoiHan;
        this.ngayTao = ngayTao;
    }

    /**
     * @return the tenMucTieu
     */
    public String getTenMucTieu() {
        return tenMucTieu;
    }

    /**
     * @param tenMucTieu the tenMucTieu to set
     */
    public void setTenMucTieu(String tenMucTieu) {
        this.tenMucTieu = tenMucTieu;
    }

    /**
     * @return the giaTri
     */
    public double getGiaTri() {
        return giaTri;
    }

    /**
     * @param giaTri the giaTri to set
     */
    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    /**
     * @return the soTienDaTK
     */
    public double getSoTienDaTK() {
        return soTienDaTK;
    }

    /**
     * @param soTienDaTK the soTienDaTK to set
     */
    public void setSoTienDaTK(double soTienDaTK) {
        this.soTienDaTK = soTienDaTK;
    }

    /**
     * @return the thoiHan
     */
    public int getThoiHan() {
        return thoiHan;
    }

    /**
     * @param thoiHan the thoiHan to set
     */
    public void setThoiHan(int thoiHan) {
        this.thoiHan = thoiHan;
    }

    /**
     * @return the ngayTao
     */
    public String getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
