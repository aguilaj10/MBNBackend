/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.Edificio;
import com.mbn.model.entities.Habitacion;
import com.mbn.model.entities.Reserva;
import java.util.ArrayList;

import java.util.List;
import org.hibernate.Query;

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

    @Override
    public List<Habitacion> obtenerHabitacionesFecha(Edificio edificio, String fechaInicio, String fechaFin) {

 //      Search sql =  new Search();
//       sql.addFilterEqual("edificio_id", edificio.getEdificioId());
//       sql.addFilterLessOrEqual("fecha_inicio", fechaInicio);
//       sql.addFilterGreaterOrEqual("fecha_fin", fechaFin);
//       List<Habitacion> habitaciones = search(sql);
        
        Query sql = getSession().createSQLQuery(
                "select * from obtenerhabitaciones(?, ?, ?)")
                .setInteger(0, edificio.getEdificioId())              
                .setString(1, fechaInicio)
                .setString(2, fechaFin);
        List<Object[]> temp =sql.list();
        List<Habitacion> habitaciones =  new ArrayList<>();
        for(Object[] o : temp){
            Habitacion habitacion = new Habitacion();
            habitacion.setHabitacionId((int) o[0]);
            habitacion.setNombre((String) o[1]);
            habitacion.setDescripcion((String) o[2]);
            habitacion.setCapacidad((int) o[3]);
            habitacion.setInternet((boolean) o[4]);
            habitacion.setReuniones((boolean) o[5]);
            habitacion.setHabitable((boolean) o[6]);
            Edificio e = new Edificio();
            e.setEdificioId((int) o[7]);
            habitacion.setEdificioId(e);
            habitaciones.add(habitacion);
        }
        return (habitaciones);
    }

}
