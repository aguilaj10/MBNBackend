/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.entities.Edificio;

/**
 *
 * @author usuario
 */
public interface EdificioService extends BaseService<Edificio,Integer>{
    EdificioDTO obtenerEdificioPorId(Integer id);
}
