/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.Reserva;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ReservaDAO extends GenericDAO<Reserva, Integer>{
    
    List<Reserva> obtenerReservas();
    boolean guardaReserva(Reserva reserva);
}
