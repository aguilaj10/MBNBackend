/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao; 

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.Usuario;
import java.util.List;

/**
 *
 * @author annelkaren
 */
public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
     /**
     * Método que valida que el usuario que intenta acceder a la aplicación se
     * encuentre registrado y con estatus activo.
     * 
     * @param usuario nombre de usuario
     * @param contrasena contrasena del usuario
     * @return
     */
    Usuario iniciarSesion(String usuario, String contrasena);

    /**
     * Método que busca a un usuario por medio de un correo electrónico
     *
     * @param correo
     * @return
     */
    Usuario buscarUsuarioPorEmail(String correo);
    
    /**
     * Método utilizado para obtener a los usuarios disponibles para ser conductores
     * 
     * @param usuario_maestro_id
     * @return 
     */
    List<Usuario> buscarConductores(int usuario_maestro_id);
    
}
