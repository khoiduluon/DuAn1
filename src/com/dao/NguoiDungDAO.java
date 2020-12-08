/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.NguoiDung;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.JDBC;

/**
 *
 * @author trantrung
 */
public class NguoiDungDAO extends dadDAO<NguoiDung, String> {

    String INSERT_SQL = "insert into NguoiDung(Username, tenND, gioitinh, pass, soDu) values(?,?,?,?,?)";
    String UPDATE_SQL = "update NguoiDung set soDu = ? where Username = ?";
    String UPDATE_SQL1 = "update NguoiDung set tenND = ?, gioitinh = ?,pass = ?, soDu = ? where Username = ?";
    String DELETE_SQL = "delete from NguoiDung where Username=?";
    String SELECT_ALL_SQL = "select * from NguoiDung";
    String SELECT_BY_ID_SQL = "select * from NguoiDung where Username=?";

    @Override
    public void insert(NguoiDung entity) {
        try {
            JDBC.update(INSERT_SQL, entity.getUser(), entity.getTenND(), entity.isGioiTinh(), entity.getMatKhau(), entity.getSoDu());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(NguoiDung entity) {
        try {
            JDBC.update(UPDATE_SQL, entity.getSoDu(), entity.getUser());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public void update1(NguoiDung entity) {
        try {
            JDBC.update(UPDATE_SQL1, entity.getTenND(), entity.isGioiTinh(), entity.getMatKhau(), entity.getSoDu(),entity.getUser());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void delete(String id) {
        try {
            JDBC.update(DELETE_SQL, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public NguoiDung selectByid(String id) {
        List<NguoiDung> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiDung> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<NguoiDung>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                NguoiDung entity = new NguoiDung();
                entity.setUser(rs.getString("Username"));
                entity.setTenND(rs.getString("TenND"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setMatKhau(rs.getString("Pass"));
                entity.setSoDu(rs.getDouble("SoDu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
