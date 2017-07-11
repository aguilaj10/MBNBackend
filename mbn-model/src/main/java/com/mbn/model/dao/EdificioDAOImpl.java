/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.Edificio;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Charlie
 */
public class EdificioDAOImpl extends GenericDAOImpl<Edificio , Integer> implements EdificioDAO{

    @Override
    public List<Edificio> obtenerEdificios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void eliminarEdificioPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void guardarEdificio(Edificio edificio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificio obtenerEdificioPorId(Integer id) {
        Search sql = new Search();
        sql.addFilterEqual("edificio_id", id);
        return (Edificio)searchUnique(sql);
    }




    
}
