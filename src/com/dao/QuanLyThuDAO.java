/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.QuanLyThu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;

/**
 *
 * @author Rom
 */
public class QuanLyThuDAO extends dadDAO<QuanLyThu, Integer>{
    
    String INSERT_SQL = "insert into QuanLyThu(Username,LoaiGD,SoTien,NgayGD) values(?,?,?,?)";
    String UPDATE_SQL = "update QuanLyThu set LoaiGD=?, SoTien=?, NgayGD=? where IDThu = ?";
    String DELETE_SQL = "delete from QuanLyThu where IDThu=?";
    String SELECT_ALL_SQL = "select * from QuanLyThu";
    String SELECT_BY_ID_SQL = "select * from QuanLyThu where IDThu=?";
    
    @Override
    public void insert(QuanLyThu entity) {
        try {
            JDBC.update(INSERT_SQL,entity.getUsername(),entity.getLoaiGD(),entity.getSoTien(),entity.getNgayGD());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(QuanLyThu entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getLoaiGD(),entity.getSoTien(),entity.getNgayGD(),entity.getIdThu());
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
    public QuanLyThu selectByid(Integer id) {
        List<QuanLyThu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<QuanLyThu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<QuanLyThu> selectBySql(String sql, Object... args) {
        List<QuanLyThu> list = new ArrayList<QuanLyThu>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                QuanLyThu entity = new QuanLyThu();
                entity.setIdThu(rs.getInt("IDThu"));
                entity.setUsername(rs.getString("Username"));
                entity.setLoaiGD(rs.getString("LoaiGD"));
                entity.setSoTien(rs.getDouble("SoTien"));
                entity.setNgayGD(rs.getString("NgayGD"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
