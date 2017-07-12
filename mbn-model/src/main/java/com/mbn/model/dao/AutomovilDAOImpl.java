/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.mbn.model.entities.Automovil;

/**
 *
 * @author MBN USER
 */
public class AutomovilDAOImpl extends GenericDAOImpl<Automovil, Integer> implements AutomovilDAO{

    @Override
    public boolean guardarAutomovil(Automovil automovil) {
        return save(automovil);
    }
    
}
