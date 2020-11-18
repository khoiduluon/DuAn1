/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.UI.QuanLy;
import com.entity.MucTieu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;
import util.MsgBox;

/**
 *
 * @author Rom
 */
public class MucTieuTietKiemDAO extends dadDAO<MucTieu, Integer>{
    String INSERT_SQL = "insert into MucTieuTietKiem(Username,tenMT,GiaTri,ThoiHan) values (?,?,?,?)";
    String UPDATE_SQL = "update MucTieuTietKiem set TenMT=?, GiaTri=?, ThoiHan=?, SoTienDaTK =? where IDMucTieu = ?";
    String DELETE_SQL = "delete from MucTieuTietKiem where IDMucTieu = ?";
    String SELECT_ALL_SQL = "select * from MucTieuTietKiem where username =?";
    String SELECT_BY_ID_SQL = "select * from MucTieuTietKiem where IDMucTieu = ? and username=?";
    
    @Override
    public void insert(MucTieu entity) {
        try {
            JDBC.update(INSERT_SQL,entity.getUsername(),entity.getTenMucTieu(),entity.getGiaTri(),entity.getThoiHan());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(MucTieu entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getTenMucTieu(),entity.getGiaTri(),entity.getThoiHan(),entity.getSoTienDaTK(),entity.getIdMucTieu());
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

    public MucTieu selectByid_MTTK(Integer id,String User) {
        List<MucTieu> list = this.selectBySql(SELECT_BY_ID_SQL,id,User);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

   
    public List<MucTieu> selectMTK(String id) {
        return this.selectBySql(SELECT_ALL_SQL,id);
    }

    @Override
    protected List<MucTieu> selectBySql(String sql, Object... args) {
        List<MucTieu> list = new ArrayList<MucTieu>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                MucTieu entity = new MucTieu();
                entity.setIdMucTieu(rs.getInt("IDMucTieu"));
                entity.setUsername(rs.getString("Username"));
                entity.setTenMucTieu(rs.getString("TenMT"));
                entity.setGiaTri(rs.getDouble("GiaTri"));
                entity.setThoiHan(rs.getInt("ThoiHan"));
                entity.setSoTienDaTK(rs.getDouble("SoTienDaTK"));
                entity.setNgayTao(rs.getString("NgayTao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MucTieu> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public MucTieu selectByid(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
