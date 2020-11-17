/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.QuanLyChi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;

/**
 *
 * @author Rom
 */
public class QuanLyChiDAO extends dadDAO<QuanLyChi, Integer>{
    
    String INSERT_SQL = "insert into QuanLyChi(Username,LoaiGD,SoTien,NgayGD,nhomGD) values(?,?,?,?)";
    String UPDATE_SQL = "update QuanLyChi set LoaiGD=?, SoTien=?, NgayGD=?, nhomGD where IDChi = ?";
    String DELETE_SQL = "delete from QuanLyChi where IDChi=?";
    String SELECT_ALL_SQL = "select * from QuanLyChi";
    String SELECT_BY_ID_SQL = "select * from QuanLyChi where IDChi=?";
    
    @Override
    public void insert(QuanLyChi entity) {
        try {
            JDBC.update(INSERT_SQL,entity.getUsername(),entity.getLoaiGD(),entity.getSoTien(),entity.getNgayGD(),entity.getNhomGD());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(QuanLyChi entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getLoaiGD(),entity.getSoTien(),entity.getNgayGD(),entity.getIdChi(),entity.getNhomGD());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JDBC.update(DELETE_SQL,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public QuanLyChi selectByid(Integer id) {
        List<QuanLyChi> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<QuanLyChi> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<QuanLyChi> selectBySql(String sql, Object... args) {
        List<QuanLyChi> list = new ArrayList<QuanLyChi>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                QuanLyChi entity = new QuanLyChi();
                entity.setIdChi(rs.getInt("IDChi"));
                entity.setUsername(rs.getString("Username"));
                entity.setLoaiGD(rs.getString("LoaiGD"));
                entity.setSoTien(rs.getDouble("SoTien"));
                entity.setNgayGD(rs.getString("NgayGD"));
                entity.setNhomGD(rs.getString("nhomGD"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
