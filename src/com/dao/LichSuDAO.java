/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entity.LichSuTK;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;
/**
 *
 * @author Rom
 */

public class LichSuDAO extends dadDAO<LichSuTK, Integer>{
    String INSERT_SQL = "insert into LichSu(IDMucTieu,NgayTK,SoTienTK) values(?,?,?)";
    String UPDATE_SQL = "update LichSu set IDMucTieu=?, NgayTK=?, SoTienTK=? where IDLichSu = ?";
    String DELETE_SQL = "delete from LichSu where IDLichSu = ?";
    String SELECT_ALL_SQL = "select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu";
    String SELECT_BY_ID_SQL = "select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu where IDLichSu=?";
    
    @Override
    public void insert(LichSuTK entity) {
        try {
            JDBC.update(INSERT_SQL,entity.getIdMucTieu(),entity.getNgayTK(),entity.getNgayTK(),entity.getSoTienTK());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(LichSuTK entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getIdMucTieu(),entity.getNgayTK(),entity.getNgayTK(),entity.getSoTienTK(),entity.getIdLichSu());
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
    public LichSuTK selectByid(Integer id) {
        List<LichSuTK> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LichSuTK> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LichSuTK> selectBySql(String sql, Object... args) {
        List<LichSuTK> list = new ArrayList<LichSuTK>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                LichSuTK entity = new LichSuTK();
                entity.setIdLichSu(rs.getInt("IDLichSu"));
                entity.setIdMucTieu(rs.getInt("IDMucTieu"));
                entity.setNgayTK(rs.getString("NgayTK"));
                entity.setSoTienTK(rs.getDouble("SoTienTK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
