/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.ReservaDAO;
import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.entities.Reserva;
import com.mbn.model.util.StaticConstans;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lenovo
 */
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Integer> implements ReservaService {

    @Override
    public ReservaDTO obtenerReservaciones() {
        ReservaDTO dto = new ReservaDTO();
        dto.setReservas(((ReservaDAO) getGenericDAO()).obtenerReservas());
        return dto;
    }

    @Override
    @Transactional(readOnly = false)
    public ReservaDTO guardarReserva(ReservaDTO reserva) {
        ReservaDTO dto = new ReservaDTO();
        if (((ReservaDAO) getGenericDAO()).guardaReserva(reserva.getReserva())) {
            dto.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
        } else {
            dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
        }
        return dto;
    }

}
