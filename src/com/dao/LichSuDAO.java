/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entity.LichSuTK;
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public LichSuTK selectByid(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LichSuTK> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<LichSuTK> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
