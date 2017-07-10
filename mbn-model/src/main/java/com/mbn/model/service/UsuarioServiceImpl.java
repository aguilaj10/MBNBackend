/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.UsuarioDAO;
import com.mbn.model.dto.UsuarioDTO;
import com.mbn.model.entities.Usuario;

/**
 *
 * @author annelkaren
 */
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Integer> implements UsuarioService {

    @Override
    public UsuarioDTO iniciarSesion(String usuario, String contrasena) {
        UsuarioDTO dto = new UsuarioDTO();
        Usuario user = ((UsuarioDAO) getGenericDAO()).iniciarSesion(usuario, contrasena);
        dto.setUsuario(user);
        return dto;
    }

}
