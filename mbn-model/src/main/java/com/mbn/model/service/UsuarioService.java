/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dto.UsuarioDTO;
import com.mbn.model.entities.Usuario;

/**
 *
 * @author annelkaren
 */
public interface UsuarioService extends BaseService<Usuario, Integer>{
    
    UsuarioDTO iniciarSesion(String usuario, String contrasena);
}
