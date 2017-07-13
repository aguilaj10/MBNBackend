/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.HabitacionDTO;
import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.entities.Habitacion;

/**
 *
 * @author lenovo
 */
public interface HabitacionService extends BaseService<Habitacion, Integer>{
    
    HabitacionDTO obtenerHabitaciones();
    
    HabitacionDTO guardarHabitacion(HabitacionDTO habitacion);
    
    HabitacionDTO obtenerHabitacionesFecha(ReservaDTO reservaDTO);
}
