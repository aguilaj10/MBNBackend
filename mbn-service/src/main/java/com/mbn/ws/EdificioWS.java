/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.entities.Edificio;
import com.mbn.model.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */
@RestController
@RequestMapping("/ws")
public class EdificioWS {
    
    @Autowired 
    EdificioService edificioService;
    
    @RequestMapping(value = "/obtenerEdificios/", method = RequestMethod.GET)
    @ResponseBody
    public EdificioDTO obtenerEdificios(){
        return edificioService.obtenerEdificios();
    };
    
    /**
     *
     * @param edificio
     * @return
     */
    @RequestMapping(value = "/guardarEdificio", method = RequestMethod.POST)
    @ResponseBody
    public EdificioDTO guardarEdificio(@RequestBody EdificioDTO edificio){
        return edificioService.guardarEdificio(edificio);
    }
}
