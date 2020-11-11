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
public class ThongKeTienDo {
    private int idMucTieu;
    private int tienDo;
    private int thoiGianConLai;

    public ThongKeTienDo() {
    }

    public ThongKeTienDo(int idMucTieu, int tienDo, int thoiGianConLai) {
        this.idMucTieu = idMucTieu;
        this.tienDo = tienDo;
        this.thoiGianConLai = thoiGianConLai;
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
     * @return the tienDo
     */
    public int getTienDo() {
        return tienDo;
    }

    /**
     * @param tienDo the tienDo to set
     */
    public void setTienDo(int tienDo) {
        this.tienDo = tienDo;
    }

    /**
     * @return the thoiGianConLai
     */
    public int getThoiGianConLai() {
        return thoiGianConLai;
    }

    /**
     * @param thoiGianConLai the thoiGianConLai to set
     */
    public void setThoiGianConLai(int thoiGianConLai) {
        this.thoiGianConLai = thoiGianConLai;
    }
    
}
