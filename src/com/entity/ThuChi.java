/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Rom
 */
public class ThuChi {
    private int id;
    private String username;
    private String loaiGD;
    private String ngayGD;
    private double soTien;
    private String tenGD;

    public ThuChi() {
    }

    public ThuChi(int idThu, String username, String loaiGD, String ngayGD, double soTien, String tenGD) {
        this.id = idThu;
        this.username = username;
        this.loaiGD = loaiGD;
        this.ngayGD = ngayGD;
        this.soTien = soTien;
        this.tenGD = tenGD;
    }

    /**
     * @return the idThu
     */
    public int getId() {
        return id;
    }

    /**
     * @param idThu the idThu to set
     */
    public void setId(int idThu) {
        this.id = idThu;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the loaiGD
     */
    public String getLoaiGD() {
        return loaiGD;
    }

    /**
     * @param loaiGD the loaiGD to set
     */
    public void setLoaiGD(String loaiGD) {
        this.loaiGD = loaiGD;
    }

    /**
     * @return the ngayGD
     */
    public String getNgayGD() {
        return ngayGD;
    }

    /**
     * @param ngayGD the ngayGD to set
     */
    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the tenGD
     */
    public String getTenGD() {
        return tenGD;
    }

    /**
     * @param tenGD the tenGD to set
     */
    public void setTenGD(String tenGD) {
        this.tenGD = tenGD;
    }
    
}
