<<<<<<< HEAD
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
public class HabitacionDAOImpl extends GenericDAOImpl<Habitacion, Integer> implements HabitacionDAO {

    @Override
    public List<Habitacion> obtenerHabitaciones() {
        return findAll();

    }

    @Override
    public boolean guardarHabitacion(Habitacion habitacion) {
        return save(habitacion);
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.Habitacion;
import com.mbn.model.entities.Reserva;

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

    @Override
    public List<Habitacion> obtenerHabitacionesFecha(Reserva reserva) {
        
       Search sql =  new Search();
       sql.addFilterLessOrEqual("fecha_inicio", reserva.getFechaInicio());
       sql.addFilterGreaterOrEqual("fecha_fin", reserva.getFechaFin());
       List<Habitacion> habitaciones = search(sql);
       return (habitaciones);
        }
  
}
>>>>>>> ececc3deaf1a833095ad04bc38bed8e0e653de21
