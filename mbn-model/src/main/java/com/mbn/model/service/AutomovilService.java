/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.AutomovilDTO;
import com.mbn.model.entities.Automovil;

/**
 *
 * @author MBN USER
 */
public interface AutomovilService extends BaseService<Automovil, Integer>{
    public AutomovilDTO guardarAutomovil(AutomovilDTO automovil);
}
