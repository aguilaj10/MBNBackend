/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.AlmacenUrls;

/**
 *
 * @author annelkaren
 */
public class AlmacenDAOImpl extends GenericDAOImpl<AlmacenUrls, Integer> implements AlmacenDAO {

    @Override
    public boolean guardarAlmacen(AlmacenUrls almacen) {
        Search sql = new Search();
        sql.addFilterEqual("usuarioId.usuarioId", almacen.getUsuarioId().getUsuarioId());
        try {
            if (almacen.getAlmacenId() != null && almacen.getAlmacenId() >0) {
                sql.addFilterNotEqual("almacenId", almacen.getAlmacenId());
            }
            if (searchUnique(sql) == null) {
                save(almacen);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
