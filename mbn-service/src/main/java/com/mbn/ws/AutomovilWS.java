/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.AutomovilDTO;
import com.mbn.model.service.AutomovilService;
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
public class AutomovilWS {
    
    @Autowired
    private AutomovilService automovilService;
    
    @RequestMapping(value = "/guardarAutomovil/", method = RequestMethod.POST)
    @ResponseBody
    public AutomovilDTO guardarAutomovil(@RequestBody AutomovilDTO automovilDTO){
        return automovilService.guardarAutomovil(automovilDTO);
    }
}
