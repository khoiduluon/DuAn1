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
public class LichSuTK {
    private int idLichSu;
    private int idMucTieu;
    private double soTienTK;
    private String ngayTK;

    public LichSuTK() {
    }

    public LichSuTK(int idLichSu, int idMucTieu, double soTienTK, String ngayTK) {
        this.idLichSu = idLichSu;
        this.idMucTieu = idMucTieu;
        this.soTienTK = soTienTK;
        this.ngayTK = ngayTK;
    }

    /**
     * @return the idLichSu
     */
    public int getIdLichSu() {
        return idLichSu;
    }

    /**
     * @param idLichSu the idLichSu to set
     */
    public void setIdLichSu(int idLichSu) {
        this.idLichSu = idLichSu;
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
     * @return the soTienTK
     */
    public double getSoTienTK() {
        return soTienTK;
    }

    /**
     * @param soTienTK the soTienTK to set
     */
    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }

    /**
     * @return the ngayTK
     */
    public String getNgayTK() {
        return ngayTK;
    }

    /**
     * @param ngayTK the ngayTK to set
     */
    public void setNgayTK(String ngayTK) {
        this.ngayTK = ngayTK;
    }
    
}
