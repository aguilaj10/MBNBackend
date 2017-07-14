/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.mbn.model.entities.AutomovilUsuario;

/**
 *
 * @author MBN USER
 */
public class AutomovilUsuarioDAOImpl extends GenericDAOImpl<AutomovilUsuario, Integer> implements AutomovilUsuarioDAO{

    @Override
    public boolean guardarAutomovilUsuario(AutomovilUsuario automovilUsuario) {
        return save(automovilUsuario);
    }
    
}
