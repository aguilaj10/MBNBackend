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
 * @author usuario
 */
public class EdificioServiceImpl extends BaseServiceImpl<Edificio, Integer> implements EdificioService{
        
    @Override
    public EdificioDTO obtenerEdificioPorId(Integer id){
        EdificioDTO dto = new EdificioDTO();
        dto.setEdificio(((EdificioDAO) getGenericDAO()).obtenerEdificioPorId(id));
        if(dto.getEdificio().getEdificioId() == null || dto.getEdificio().getEdificioId() < 1){
            System.out.println("No se encontro Edificio" + dto.getEdificio().getEdificioId());
        }else{
            System.out.println("Se encontro edificio" + dto.getEdificio().getEdificioId());
        }        
        return dto;
    }
}
