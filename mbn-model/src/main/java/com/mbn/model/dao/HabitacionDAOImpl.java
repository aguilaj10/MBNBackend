/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.Habitacion;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class HabitacionDAOImpl extends GenericDAOImpl<Habitacion, Integer> implements HabitacionDAO{



    @Override
    public List<Habitacion> obtenerHabitaciones() {
        return findAll();
        
      
        
    }

    @Override
    public boolean guardarHabitacion(Habitacion habitacion) {
        return save(habitacion);
        }
  
}
