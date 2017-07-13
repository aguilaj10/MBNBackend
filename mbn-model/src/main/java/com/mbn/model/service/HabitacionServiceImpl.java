/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.HabitacionDAO;
import com.mbn.model.dto.HabitacionDTO;
import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.entities.Habitacion;
import com.mbn.model.util.StaticConstans;

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
    public HabitacionDTO guardarHabitacion(HabitacionDTO habitacion) {
        HabitacionDTO dto = new HabitacionDTO();
        if(((HabitacionDAO) getGenericDAO()).guardarHabitacion(habitacion.getHabitacion())){
            dto.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
        }else{
             dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
        }
        return dto;
    }

    @Override
    public HabitacionDTO obtenerHabitacionesFecha(ReservaDTO reservaDTO) {
        HabitacionDTO dto =  new HabitacionDTO();
        dto.setHabitaciones(((HabitacionDAO) getGenericDAO()).obtenerHabitacionesFecha(reservaDTO.getReserva())); 
        return dto;
    }
    
    
    
}
>>>>>>> ececc3deaf1a833095ad04bc38bed8e0e653de21
