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
import util.JDBC;

/**
 *
 * @author trantrung
 */
public class NguoiDungDAO extends dadDAO<NguoiDung, String> {

    String INSERT_SQL = "insert into NguoiDung(idND, tenND, gioitinh, matKhau, soDu) values(?,?,?,?,?)";
    String UPDATE_SQL = "update NhanVien set tenND=?, gioitinh=?, matkhau=?, soDu = ?, where idND = ?";
    String DELETE_SQL = "delete from NguoiDung where idND=?";
    String SELECT_ALL_SQL = "select * from NguoiDung";
    String SELECT_BY_ID_SQL = "select * from NguoiDung where idND=?";

    @Override
    public void insert(NguoiDung entity) {
        JDBC.update(INSERT_SQL, entity.getUser(), entity.getTenND(), entity.isGioiTinh(), entity.getMatKhau(), entity.getSoDu());
    }

    @Override
    public void update(NguoiDung entity) {
        JDBC.update(UPDATE_SQL, entity.getTenND(), entity.isGioiTinh(), entity.getMatKhau(), entity.getSoDu(), entity.getUser());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
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
                entity.setUser(rs.getString(1));
                entity.setTenND(rs.getString(2));
                entity.setGioiTinh(rs.getBoolean(3));
                entity.setMatKhau(rs.getString(4));
                entity.setSoDu(rs.getDouble(5));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}