/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ReservaWS {
    
    @Autowired
    private ReservaService reservaService;
    
    @RequestMapping(value= "/obtenerReservas/", method = RequestMethod.GET)
    @ResponseBody
    public ReservaDTO obtenerReservas(){
    return reservaService.obtenerReservaciones();
    }
}
