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
      /**
     * Método que valida que el usuario que intenta acceder a la aplicación se
     * encuentre registrado y con estatus activo.
     *
     * @param usuario nombre de usuario
     * @param contrasena contrasena del usuario
     * @return
     */
    UsuarioDTO iniciarSesion(String usuario, String contrasena);

    /**
     * Método utilizado para el envio de correo electrónico en el caso de que un
     * usuario desee cambiar su contraseña
     *
     * @param email
     * @return
     */
    UsuarioDTO cambiarContrasena(String email);
    
    /**
     * Método utilizado para obtener todos los usuarios registrados
     * 
     * @return 
     */
    UsuarioDTO buscarUsuarios();
}
