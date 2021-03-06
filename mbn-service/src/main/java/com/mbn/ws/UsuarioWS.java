/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.ws;

import com.mbn.model.dto.UsuarioDTO;
import com.mbn.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author annelkaren
 */
@RestController
@RequestMapping("/ws")
public class UsuarioWS {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/iniciarSesion/", method = RequestMethod.POST)
    @ResponseBody
    public UsuarioDTO iniciarSesion(@RequestBody UsuarioDTO datos) {
        return usuarioService.iniciarSesion(datos.getUsuario().getUsuario(), datos.getUsuario().getContrasena());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cambiarContrasena")
    @ResponseBody
    public UsuarioDTO cambiarContrasena(@RequestParam(value = "correo") String correo) {
        return usuarioService.cambiarContrasena(correo);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarUsuario")
    @ResponseBody
    public UsuarioDTO buscarUsuario(@RequestParam(value = "cadena") String cadena) {
        return usuarioService.buscarUsuario(cadena);
    }
    
    @RequestMapping(value = "/obtenerUsuarios/", method = RequestMethod.GET)
    @ResponseBody
    public UsuarioDTO buscarUsuarios() {
        return usuarioService.buscarUsuarios();
    }
    
}
