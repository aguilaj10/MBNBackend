/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.mbn.model.entities.AlmacenUrls;
import java.util.logging.Logger;

/**
 *
 * @author annelkaren
 */
public class AlmacenDAOImpl extends GenericDAOImpl<AlmacenUrls, Integer> implements AlmacenDAO {

    private static Logger logger = Logger.getLogger(AlmacenDAOImpl.class.getName());

    @Override
    public boolean guardarAlmacen(AlmacenUrls almacen) {
        Search sql = new Search();
        sql.addFilterEqual("usuarioId.usuarioId", almacen.getUsuarioId().getUsuarioId());
        AlmacenUrls almacenUrl = (AlmacenUrls) searchUnique(sql);
        try {
            if (almacenUrl != null) {
                almacenUrl.setCadena(almacen.getCadena());
                almacenUrl.setFechaExpiracion(almacen.getFechaExpiracion());
                almacenUrl.setUsuarioId(almacen.getUsuarioId());
                save(almacenUrl);
            } else {
                save(almacen);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
