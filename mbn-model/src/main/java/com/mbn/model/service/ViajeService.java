/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.ViajeDTO;
import com.mbn.model.entities.Viaje;

/**
 *
 * @author MBN USER
 */
public interface ViajeService extends BaseService<Viaje, Integer>{
    ViajeDTO guardarViaje(ViajeDTO viajeDTO);
}
