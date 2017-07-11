/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dto;

import com.mbn.model.entities.Reserva;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ReservaDTO extends GenericDTO implements Serializable {
    private Reserva reserva;
    private List<Reserva> reservas;

    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    /**
     * @return the reservas
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
