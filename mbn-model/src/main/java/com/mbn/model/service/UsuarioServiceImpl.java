/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.service;

import com.mbn.model.dao.AlmacenDAO;
import com.mbn.model.dao.UsuarioDAO;
import com.mbn.model.dto.UsuarioDTO;
import com.mbn.model.entities.AlmacenUrls;
import com.mbn.model.entities.Usuario;
import com.mbn.model.util.HashMD5;
import com.mbn.model.util.Hilo;
import com.mbn.model.util.StaticConstans;
import java.security.SecureRandom;
import java.util.Date;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author annelkaren
 */
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Integer> implements UsuarioService {

    private AlmacenDAO almacenDAO;
    private static Logger logger = Logger.getLogger(UsuarioServiceImpl.class.getName());

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

    @Override
    @Transactional(readOnly = false)
    public UsuarioDTO cambiarContrasena(String email) {
        UsuarioDTO dto = new UsuarioDTO();
        Usuario user = ((UsuarioDAO) getGenericDAO()).buscarUsuarioPorEmail(email);
        if (user != null) { //Si encuentra un usuario
            //Se crea un número aleatorio
            SecureRandom numeroAleatorio = new SecureRandom();
            byte bytes[] = new byte[32];
            numeroAleatorio.nextBytes(bytes);
            try {

                //Cifra cadena 
                String cadena = HashMD5.getMD5(numeroAleatorio.toString());

                //Fecha de expiración de URL
                Date fechaExpiracion = new Date();
                fechaExpiracion.setHours(fechaExpiracion.getHours() + StaticConstans.TIEMPO_URL);

                AlmacenUrls almacen = new AlmacenUrls();
                almacen.setUsuarioId(user);
                almacen.setCadena(cadena);
                almacen.setFechaExpiracion(fechaExpiracion);

                //Guarda el objeto almacen
                almacenDAO.guardarAlmacen(almacen);
                //Envia correo electrónico
                String contenido = "<p style=\"font-family: Helvetica,sans-serif; font-size:30px; color:#505050; padding:20px 20px 0px 20px\" >" + StaticConstans.MENSAJE_CORREO_ENCABEZADO + "</p>";
                contenido += "<p style=\"font-family: Helvetica,sans-serif; font-size: 13px; line-height: 150%; color: #505050; padding: 20px 20px 20px 20px;\">" + StaticConstans.MENSAJE_CORREO_CUERPO;
                contenido += "</br><br><a target=\"_blank\" href=\"http://www.mbn.com.mx/MBNMovil/cambiarContrasena/" + cadena + "\">" + "www.mbn.com.mx/MBNMovil/cambiarContrasena/" + cadena + "</a></br><br>";
                contenido += StaticConstans.MENSAJE_CORREO_PIE;
                String correo = user.getUsuario();
                Hilo hilo = new Hilo(correo, StaticConstans.ASUNTO, contenido);
                hilo.start();

                dto.setTipoMensaje(StaticConstans.MENSAJE_CORRECTO);
                dto.setCodigoMensaje(StaticConstans.MENSAJE_ENVIO_CORREO);

            } catch (Exception e) {
                dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
                dto.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_GENERAL);
            }
        } else {
            dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            dto.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_CONTRASENA);
        }

        return dto;
    }

    @Override
    public UsuarioDTO buscarUsuarios() {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setUsuarios(((UsuarioDAO)getGenericDAO()).buscarUsuarios());
        return dto;
    }
    
    @Override
    public UsuarioDTO buscarUsuario(String cadena) {
        UsuarioDTO dto = new UsuarioDTO();
        AlmacenUrls alm = (AlmacenUrls) almacenDAO.buscarAlmacen(cadena);
        
        try{if (alm != null) {
            if (alm.getFechaExpiracion().after(new Date())) {
                Usuario user = alm.getUsuarioId();
                dto.setUsuario(user);
            } else {
                dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
                dto.setCodigoMensaje(StaticConstans.MENSAJE_URL_EXPIRADA);
            }
        } else {
            dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            dto.setCodigoMensaje(StaticConstans.MENSAJE_URL_EXPIRADA);
        }}
        catch(Exception ex){
            ex.printStackTrace();
            dto.setTipoMensaje(StaticConstans.MENSAJE_ERROR);
            dto.setCodigoMensaje(StaticConstans.MENSAJE_ERROR_GENERAL);
        }
        return dto;
    }

    /**
     * @return the almacenDAO
     */
    public AlmacenDAO getAlmacenDAO() {
        return almacenDAO;
    }

    /**
     * @param almacenDAO the almacenDAO to set
     */
    public void setAlmacenDAO(AlmacenDAO almacenDAO) {
        this.almacenDAO = almacenDAO;
    }
}
