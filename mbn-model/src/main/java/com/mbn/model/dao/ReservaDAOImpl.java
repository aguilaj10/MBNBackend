/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.mbn.model.entities.Reserva;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ReservaDAOImpl extends GenericDAOImpl<Reserva, Integer> implements ReservaDAO {

    @Override
    public List<Reserva> obtenerReservas() {
        return findAll();
    }

    @Override
    public boolean guardaReserva(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
