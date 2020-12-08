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

    String INSERT_INTO_SQL="insert into LichSu(IDMucTieu,SoTienTK) values(?,?)";
    
    @Override
    public void insert(LichSuTK entity) {
        try {
            JDBC.update(INSERT_INTO_SQL, entity.getIdMucTieu(),entity.getSoTienTK());
        } catch (Exception e) {
        }
    }

    @Override
    public void update(LichSuTK entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
