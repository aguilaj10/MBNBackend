/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.UsuarioDAO;
import com.mbn.model.dto.UsuarioDTO;
import com.mbn.model.entities.Usuario;
import com.mbn.model.util.StaticConstans;

/**
 *
 * @author annelkaren
 */
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Integer> implements UsuarioService {

    @Override
    public UsuarioDTO iniciarSesion(String usuario, String contrasena) {
        UsuarioDTO dto = new UsuarioDTO();
        try {
            Usuario user = ((UsuarioDAO) getGenericDAO()).iniciarSesion(usuario, contrasena);
            if (user != null) {
                dto.setUsuario(user);
            } else {
                dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
                dto.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_SESION);
            }
            dto.setUsuario(user);
        } catch (Exception ex) {
            dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            dto.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_GENERAL);
        }
        return dto;
    }

}
