/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.EdificioDTO;
import com.mbn.model.dto.HabitacionDTO;
import com.mbn.model.dto.ReservaDTO;
import com.mbn.model.service.HabitacionService;
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
public class HabitacionWS {
    
     @Autowired
    private HabitacionService habitacionService;
     
    @RequestMapping(value = "/obtenerHabitaciones/", method = RequestMethod.GET)
    @ResponseBody
    public HabitacionDTO obtenerHabitaciones() {
       return habitacionService.obtenerHabitaciones();
    }
    @RequestMapping(value = "/obtenerHabitacionesFecha/", method = RequestMethod.POST)
    @ResponseBody
    public HabitacionDTO obtenerHabitacionesFecha(@RequestBody EdificioDTO reserva) {
       return habitacionService.obtenerHabitacionesFecha(reserva);
    }
    
}
