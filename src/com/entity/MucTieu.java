/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.Date;

/**
 *
 * @author trantrung
 */
public class MucTieu {
    private String tenMucTieu;
    private double giaTri;
    private double soTienDaTK;
    private int thoiHan;
    private Date ngayTao;
    private int idMucTieu;
    private String username;

    public MucTieu() {
    }

    public MucTieu(String tenMucTieu, double giaTri, double soTienDaTK, int thoiHan, Date ngayTao, int idMucTieu, String username) {
        this.tenMucTieu = tenMucTieu;
        this.giaTri = giaTri;
        this.soTienDaTK = soTienDaTK;
        this.thoiHan = thoiHan;
        this.ngayTao = ngayTao;
        this.idMucTieu = idMucTieu;
        this.username = username;
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
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the idMucTieu
     */
    public int getIdMucTieu() {
        return idMucTieu;
    }

    /**
     * @param idMucTieu the idMucTieu to set
     */
    public void setIdMucTieu(int idMucTieu) {
        this.idMucTieu = idMucTieu;
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

    @Override
    public String toString() {
        return tenMucTieu;
    }
    
}
