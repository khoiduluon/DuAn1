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
    String name;
    boolean genDer;

    public NguoiDung() {
    }

    public NguoiDung(String name, boolean genDer) {
        this.name = name;
        this.genDer = genDer;
    }

    public String getName() {
        return name;
    }

    public boolean isGenDer() {
        return genDer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenDer(boolean genDer) {
        this.genDer = genDer;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "name=" + name + ", genDer=" + genDer + '}';
    }
    
}
