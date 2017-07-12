/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.EdificioDAO;
import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.entities.Edificio;

/**
 *
 * @author lenovo
 */
public class EdificioServiceImpl extends BaseServiceImpl<Edificio, Integer> implements EdificioService{

    @Override
    public EdificioDTO obtenerEdificios() {
        EdificioDTO dto = new EdificioDTO();
        dto.setEdificios(((EdificioDAO) getGenericDAO()).obtenerEdificios());       
        return dto;
    }

    @Override
    public EdificioDTO guardarEdificio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
