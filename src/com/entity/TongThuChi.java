
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
public class TongThuChi {
    private int thangThu;
    private int thangChi;
    private double tongthu;
    private double tongchi;

    public TongThuChi(int thangThu, int thangChi, double tongthu, double tongchi) {
        this.thangThu = thangThu;
        this.thangChi = thangChi;
        this.tongthu = tongthu;
        this.tongchi = tongchi;
    }

    public TongThuChi() {
    }

    /**
     * @return the thangThu
     */
    public int getThangThu() {
        return thangThu;
    }

    /**
     * @param thangThu the thangThu to set
     */
    public void setThangThu(int thangThu) {
        this.thangThu = thangThu;
    }

    /**
     * @return the thangChi
     */
    public int getThangChi() {
        return thangChi;
    }

    /**
     * @param thangChi the thangChi to set
     */
    public void setThangChi(int thangChi) {
        this.thangChi = thangChi;
    }

    /**
     * @return the tongthu
     */
    public double getTongthu() {
        return tongthu;
    }

    /**
     * @param tongthu the tongthu to set
     */
    public void setTongthu(double tongthu) {
        this.tongthu = tongthu;
    }

    /**
     * @return the tongchi
     */
    public double getTongchi() {
        return tongchi;
    }

    /**
     * @param tongchi the tongchi to set
     */
    public void setTongchi(double tongchi) {
        this.tongchi = tongchi;
    }
    
}
