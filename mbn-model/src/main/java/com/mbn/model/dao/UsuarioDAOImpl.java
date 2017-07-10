/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.Usuario;

/**
 *
 * @author annelkaren
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO {

    @Override
    public Usuario iniciarSesion(String usuario, String contrasena) {
        Search sql = new Search();
        sql.addFilterEqual("usuario", usuario.toLowerCase());
        sql.addFilterEqual("contrasena", usuario);
        return (Usuario) searchUnique(sql);
    }

}
