/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.AutomovilDAO;
import com.mbn.model.dao.AutomovilUsuarioDAO;
import com.mbn.model.dto.AutomovilDTO;
import com.mbn.model.entities.Automovil;
import com.mbn.model.entities.AutomovilUsuario;
import com.mbn.model.entities.Usuario;
import com.mbn.model.util.StaticConstans;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MBN USER
 */
public class AutomovilServiceImpl extends BaseServiceImpl<Automovil, Integer> implements AutomovilService {

    private static final Logger LOG = Logger.getLogger(AutomovilServiceImpl.class.getSimpleName());
    @Autowired
    private AutomovilDAO automovilDAO; 
    @Autowired
    private AutomovilUsuarioDAO automovilUsuarioDAO;

    @Override
    @Transactional(readOnly = false)
    public AutomovilDTO guardarAutomovil(AutomovilDTO automovilDTO) {
        try {
            //Se decodifica la foto (String a byte[])
            byte[] fotoAutomovil = Base64.decode(automovilDTO.getFotoAutomovil());
            automovilDTO.getAutomovil().setFoto(fotoAutomovil);
            //Se guarda la entidad automovil
            boolean automovilGuardado = automovilDAO.guardarAutomovil(automovilDTO.getAutomovil());

            if (automovilGuardado) {
                //Se guarda la relación usuarios(conductores) - automóviles 
                AutomovilUsuario automovilUsuario;
                for (Usuario usuario : automovilDTO.getConductores()) {
                    automovilUsuario = new AutomovilUsuario();
                    automovilUsuario.setAutomovilId(automovilDTO.getAutomovil());
                    automovilUsuario.setUsuarioId(usuario);
                    automovilUsuarioDAO.guardarAutomovilUsuario(automovilUsuario);
                }

                automovilDTO.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
            } else {
                automovilDTO.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
                automovilDTO.setCodigoMensaje(StaticConstans.MENSJAE_ERROR_GUARDAR_AUTOMOVIL);
            }
        } catch (Base64DecodingException ex) {
            automovilDTO.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            automovilDTO.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_DECODIFICAR_FOTO_AUTO);
            LOG.log(Level.SEVERE, "Error decodificando la foto del automóvil. \nDESCRIPCIÓN DE ERROR:", ex);
        }
        return automovilDTO;
    }

}
