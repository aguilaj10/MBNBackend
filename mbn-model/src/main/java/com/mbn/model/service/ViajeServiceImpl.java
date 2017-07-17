/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.AutomovilDAO;
import com.mbn.model.dto.ViajeDTO;
import com.mbn.model.entities.Viaje;
import com.mbn.model.dao.ViajeDAO;
import com.mbn.model.entities.Automovil;
import com.mbn.model.util.StaticConstans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MBN USER
 */
public class ViajeServiceImpl extends BaseServiceImpl<Viaje, Integer> implements ViajeService {

    @Autowired
    private AutomovilDAO automovilDAO;    
    
    @Override
    @Transactional(readOnly = false)
    public ViajeDTO guardarViaje(ViajeDTO viajeDTO) {
        //Se obtiene el automóvil a usar en el viaje
        Automovil automovil = automovilDAO.buscarAutomovilPorId(viajeDTO.getViaje().getAutomovilId().getAutomovilId());
        //Se establecen los lugares disponibles de acuerdo a los lugares del automóvil
        viajeDTO.getViaje().setLugaresDisponibles(automovil.getCapacidad() - 1);
        
        boolean viajeGuardado = ((ViajeDAO) getGenericDAO()).guardarViaje(viajeDTO.getViaje());
        if (viajeGuardado) {
            viajeDTO.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
        } else {
            viajeDTO.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            viajeDTO.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_GUARDAR_VIAJE);
        }
        return viajeDTO;
    }
    
}
