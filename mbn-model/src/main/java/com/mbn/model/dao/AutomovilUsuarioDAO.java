/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.AutomovilUsuario;

/**
 *
 * @author MBN USER
 */
public interface AutomovilUsuarioDAO extends GenericDAO<AutomovilUsuario, Integer>{
    boolean guardarAutomovilUsuario(AutomovilUsuario automovilUsuario);
}
