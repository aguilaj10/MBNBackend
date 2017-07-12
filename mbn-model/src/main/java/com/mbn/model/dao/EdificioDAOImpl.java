package com.mbn.model.dao;
import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.mbn.model.dao.EdificioDAO;
import com.mbn.model.entities.Edificio;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class EdificioDAOImpl extends GenericDAOImpl<Edificio, Integer> implements EdificioDAO{

    @Override
    public List<Edificio> obtenerEdificios() {
        return findAll();
    }

    @Override
    public boolean guardarEdificio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
