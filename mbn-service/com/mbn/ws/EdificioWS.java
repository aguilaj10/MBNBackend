package com.mbn.ws;

import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.service.EdificioService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charlie
 */
@RestController
@RequestMapping("/ws")
public class EdificioWS implements Serializable{
    @Autowired
    private EdificioService edificioService;
    
    @RequestMapping(value = "/obtenerEdificio", method = RequestMethod.GET)
    @ResponseBody
    public EdificioDTO iniciarSesion(@RequestParam(value = "id") Integer id) {
        return edificioService.obtenerEdificioPorId(id);
    }
    
}
