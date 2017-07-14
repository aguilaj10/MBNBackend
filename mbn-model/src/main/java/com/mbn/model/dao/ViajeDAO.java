/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.Viaje;

/**
 *
 * @author MBN USER
 */
public interface ViajeDAO extends GenericDAO<Viaje, Integer>{
    boolean guardarViaje(Viaje viaje);
}
