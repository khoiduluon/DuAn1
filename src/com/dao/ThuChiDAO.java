/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.ThuChi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;

/**
 *
 * @author Rom
 */
public class ThuChiDAO extends dadDAO<ThuChi, Integer>{
    String INSERT_SQL = "insert into QuanLyThuChi(Username,TenGD,SoTien,NgayGD,LoaiGD) values(?,?,?,?,?)";
    String UPDATE_SQL = "update QuanLyThuChi set TenGD=?, SoTien=?, NgayGD=?, LoaiGD=? where ID = ?";
    String DELETE_SQL = "delete from QuanLyThuChi where ID=?";
    String SELECT_ALL_SQL = "select * from QuanLyThuChi";
    String SELECT_BY_ID_SQL = "select * from QuanLyThuChi where ID=?";

    @Override
    public void insert(ThuChi entity) {
        try {
            JDBC.update(INSERT_SQL, entity.getUsername(),entity.getTenGD(),entity.getSoTien(),entity.getNgayGD(),entity.getLoaiGD());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ThuChi entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getTenGD(),entity.getSoTien(),entity.getNgayGD(),entity.getLoaiGD(),entity.getId());
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
    public ThuChi selectByid(Integer id) {
        List<ThuChi> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ThuChi> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ThuChi> selectBySql(String sql, Object... args) {
        List<ThuChi> list = new ArrayList<ThuChi>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                ThuChi entity = new ThuChi();
                entity.setId(rs.getInt("ID"));
                entity.setUsername(rs.getString("Username"));
                entity.setTenGD(rs.getString("TenGD"));
                entity.setSoTien(rs.getDouble("SoTien"));
                entity.setNgayGD(rs.getString("NgayGD"));
                entity.setLoaiGD(rs.getString("LoaiGD"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
