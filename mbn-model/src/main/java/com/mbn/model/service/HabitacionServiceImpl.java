/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.HabitacionDAO;
import com.mbn.model.dto.HabitacionDTO;
import com.mbn.model.entities.Habitacion;
import com.mbn.model.util.StaticConstans;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lenovo
 */
public class HabitacionServiceImpl extends BaseServiceImpl<Habitacion, Integer> implements HabitacionService{

    @Override
    public HabitacionDTO obtenerHabitaciones() {
        HabitacionDTO dto = new HabitacionDTO();
        dto.setHabitaciones(((HabitacionDAO) getGenericDAO()).obtenerHabitaciones());       
        return dto;
        }

    @Override
    @Transactional(readOnly = false)
    public HabitacionDTO guardarHabitacion(HabitacionDTO habitacion) {
        HabitacionDTO dto = new HabitacionDTO();
        if(((HabitacionDAO) getGenericDAO()).guardarHabitacion(habitacion.getHabitacion())){
            dto.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
        }else{
             dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
        }
        return dto;
    }
    
    
    
}
