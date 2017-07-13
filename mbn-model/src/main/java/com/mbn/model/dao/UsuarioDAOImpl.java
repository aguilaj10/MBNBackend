/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.AlmacenUrls;
import com.mbn.model.entities.Usuario;
import com.mbn.model.util.StaticConstans;
import java.util.List;

/**
 *
 * @author annelkaren
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO {

    @Override
    public Usuario iniciarSesion(String usuario, String contrasena) {
        Search sql = new Search();
        sql.addFilterEqual("usuario", usuario.toLowerCase());
        sql.addFilterEqual("contrasena", contrasena);
        sql.addFilterEqual("estado", StaticConstans.HABILITADO);
        return (Usuario) searchUnique(sql);
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String correo) {
        Search sql = new Search();
        sql.addFilterEqual("usuario", correo);
        sql.addFilterEqual("estado", StaticConstans.HABILITADO);
        return (Usuario) searchUnique(sql);
    }
    
    @Override
    public boolean guardarUsuario(Usuario usuario) {
        Search sql = new Search();
        sql.addFilterEqual("usuario", usuario.getUsuario());
        List <Usuario> usuarios = search(sql);
        try {        
        if(usuarios.size() == 0){
                save(usuario);
                return true;
            } else {
            return false;
        }}
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
}
