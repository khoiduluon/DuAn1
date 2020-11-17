/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.ThongKeChiTieu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;

/**
 *
 * @author Rom
 */
public class ThongKeChiTieuDAO extends dadDAO<ThongKeChiTieu, Integer>{
    String INSERT_SQL = "insert into ThongKeChiTieu(Username,TongThu,TongChi,SoDu) values(?,?,?,?)";
    String UPDATE_SQL = "update ThongKeChiTieu set TongThu=?, TongChi=?, SoDu=? where Username = ?";
    String DELETE_SQL = "delete from ThongKeChiTieu where Username=?";
    String SELECT_ALL_SQL = "select * from ThongKeChiTieu";
    String SELECT_BY_ID_SQL = "select * from ThongKeChiTieu where Username=?";
    
    @Override
    public void insert(ThongKeChiTieu entity) {
        try {
            JDBC.update(INSERT_SQL, entity.getUsername(),entity.getTongThu(),entity.getTongChi(),entity.getSoDu());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ThongKeChiTieu entity) {
        try {
            JDBC.update(UPDATE_SQL, entity.getTongThu(),entity.getTongChi(),entity.getSoDu(),entity.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JDBC.update(DELETE_SQL, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ThongKeChiTieu selectByid(Integer id) {
       List<ThongKeChiTieu> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ThongKeChiTieu> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ThongKeChiTieu> selectBySql(String sql, Object... args) {
        List<ThongKeChiTieu> list = new ArrayList<ThongKeChiTieu>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                ThongKeChiTieu entity = new ThongKeChiTieu();
                entity.setUsername(rs.getString("Username"));
                entity.setTongThu(rs.getDouble("TongThu"));
                entity.setTongChi(rs.getDouble("TongChi"));
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
