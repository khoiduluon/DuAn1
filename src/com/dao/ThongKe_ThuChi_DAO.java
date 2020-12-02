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
public class ThongKe_ThuChi_DAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getThu(String User) {
        String sql = "{CALL TongThu(?)}";
        String[] cols = {"Thang", "TongThu"};
        return this.getListOfArray(sql, cols, User);
    }

    public List<Object[]> getChi(String User) {
        String sql = "{CALL TongChi(?)}";
        String[] cols = {"Thang", "TongChi"};
        return this.getListOfArray(sql, cols, User);
    }

    public List<Object[]> LichSu_ThuChi(String User) {
        String sql = "{CALL LichSu_ThuChi(?)}";
        String[] cols = {"ID","TenGD", "NgayGD", "SoTien", "LoaiGD"};
        return this.getListOfArray(sql, cols, User);
    }
    public List<Object[]> getLichSu(String User){
        String sql="{CALL LichSuMTK(?)}";
        String[] cols={"IDLichSu","TenMT","NgayTK","SoTienTK"};
        return this.getListOfArray(sql, cols, User);
    }
    public List<Object[]> getLichSu1(String User,String TenMTK){
        String sql="{CALL LichSuMTK2(?,?)}";
        String[] cols={"IDLichSu","TenMT","NgayTK","SoTienTK"};
        return this.getListOfArray(sql, cols, User,TenMTK);
    }
}
