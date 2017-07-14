/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dto;

import com.mbn.model.entities.Habitacion;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class HabitacionDTO extends GenericDTO implements Serializable{
    
    private Habitacion habitacion;
    private List<Habitacion> habitaciones;

    /**
     * @return the habitacion
     */
    public Habitacion getHabitacion() {
        return habitacion;
    }

    /**
     * @param habitacion the habitacion to set
     */
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    /**
     * @return the habitaciones
     */
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
}
