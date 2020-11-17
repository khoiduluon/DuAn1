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
public class ThongKeChiTieu {
    private String username;
    private double TongThu;
    private double TongChi;
    private double SoDu;

    public ThongKeChiTieu() {
    }

    public ThongKeChiTieu(String username, double TongThu, double TongChi, double SoDu) {
        this.username = username;
        this.TongThu = TongThu;
        this.TongChi = TongChi;
        this.SoDu = SoDu;
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
     * @return the TongThu
     */
    public double getTongThu() {
        return TongThu;
    }

    /**
     * @param TongThu the TongThu to set
     */
    public void setTongThu(double TongThu) {
        this.TongThu = TongThu;
    }

    /**
     * @return the TongChi
     */
    public double getTongChi() {
        return TongChi;
    }

    /**
     * @param TongChi the TongChi to set
     */
    public void setTongChi(double TongChi) {
        this.TongChi = TongChi;
    }

    /**
     * @return the SoDu
     */
    public double getSoDu() {
        return SoDu;
    }

    /**
     * @param SoDu the SoDu to set
     */
    public void setSoDu(double SoDu) {
        this.SoDu = SoDu;
    }
    
}
