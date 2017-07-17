/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.Automovil;

/**
 *
 * @author MBN USER
 */
public interface AutomovilDAO extends GenericDAO<Automovil, Integer>{
    boolean guardarAutomovil(Automovil automovil);
    Automovil buscarAutomovilPorId(int automovil_id);
}
