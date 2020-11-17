/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entity.LichSuTK;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.JDBC;
/**
 *
 * @author Rom
 */

public class LichSuDAO {
<<<<<<< HEAD
    String INSERT_SQL = "insert into LichSu(IDMucTieu,NgayTK,SoTienTK) values(?,?,?)";
    String UPDATE_SQL = "update LichSu set IDMucTieu=?, NgayTK=?, SoTienTK=? where IDLichSu = ?";
    String DELETE_SQL = "delete from LichSu where IDLichSu = ?";
    String SELECT_ALL_SQL = "select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu";
    String SELECT_BY_ID_SQL = "select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu where IDLichSu=?";
    
   
    public void insert(LichSuTK entity) {
        try {
            JDBC.update(INSERT_SQL,entity.getIdMucTieu(),entity.getNgayTK(),entity.getNgayTK(),entity.getSoTienTK());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void update(LichSuTK entity) {
        try {
            JDBC.update(UPDATE_SQL,entity.getIdMucTieu(),entity.getNgayTK(),entity.getNgayTK(),entity.getSoTienTK(),entity.getIdLichSu());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void delete(Integer id) {
        try {
            JDBC.update(DELETE_SQL,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
        List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {

        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for(int i=0;i<cols.length;i++){
=======
    private List<Object[]> getListOfArray(String sql,String[] cols,Object...args){
        try {
            List<Object[]> list= new ArrayList<>();
            ResultSet rs=JDBC.query(sql, args);
            while(rs.next()){
                Object[] vals=new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
>>>>>>> 6fe4eebd6700ca6c27e72e681988ea9201e2c935
                    vals[i]=rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
<<<<<<< HEAD
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        public List<Object[]> getListLichSu() {
        String sql = "{call LichSuMTK}";
        String[] cols = {"IDLicSu", "TenMT", "NgayTK", "SoTienTK"};
        return this.getListOfArray(sql, cols);
=======
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Object[]> getLichSu(String User){
        String sql="{CALL LichSuMTK(?)}";
        String[] cols={"IDLichSu","TenMucTieu","NgayTietKiem"};
        return this.getListOfArray(sql, cols, User);
    }
    public List<Object[]> getLichSu1(String TenMTK,String User){
        String sql="{CALL LichSuMTK2(?,?)}";
        String[] cols={"IDLichSu","TenMucTieu","NgayTietKiem"};
        return this.getListOfArray(sql, cols, TenMTK,User);
>>>>>>> 6fe4eebd6700ca6c27e72e681988ea9201e2c935
    }
}
