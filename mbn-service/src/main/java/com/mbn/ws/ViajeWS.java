/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.ViajeDTO;
import com.mbn.model.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MBN USER
 */
@RestController
@RequestMapping("/ws")
public class ViajeWS {
    
    @Autowired
    private ViajeService viajeService;
    
    @RequestMapping(value = "/guardarViaje/", method = RequestMethod.POST)
    @ResponseBody
    public ViajeDTO guardarViaje(@RequestBody ViajeDTO viajeDTO){
        return viajeService.guardarViaje(viajeDTO);
    }
}
