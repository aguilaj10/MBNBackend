/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.EdificioDAO;
import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.entities.Edificio;
import com.mbn.model.util.StaticConstans;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = false)
    public EdificioDTO guardarEdificio(EdificioDTO edificio) {
        EdificioDTO dto = new EdificioDTO();
        if(((EdificioDAO) getGenericDAO()).guardarEdificio(edificio.getEdificio())){
            dto.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
        }else{
             dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
        }
        return dto;
    }
    
}
