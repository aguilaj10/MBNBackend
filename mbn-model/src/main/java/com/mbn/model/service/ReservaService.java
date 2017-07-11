/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.entities.Reserva;

/**
 *
 * @author lenovo
 */
public interface ReservaService extends BaseService<Reserva, Integer>{
    
    ReservaDTO obtenerReservaciones();
    ReservaDTO guardarReserva(ReservaDTO reserva);
}
