/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.mbn.model.entities.Viaje;

/**
 *
 * @author MBN USER
 */
public class ViajeDAOImpl extends GenericDAOImpl<Viaje, Integer> implements ViajeDAO{

    @Override
    public boolean guardarViaje(Viaje viaje) {
        return save(viaje);
    }

 
}
