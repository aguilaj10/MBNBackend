/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.dto.HabitacionDTO;
import com.mbn.model.entities.Habitacion;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface HabitacionDAO extends GenericDAO<Habitacion, Integer>{
    
    List<Habitacion> obtenerHabitaciones();
    
  
    
    boolean guardarHabitacion(Habitacion habitacion);
    
}
