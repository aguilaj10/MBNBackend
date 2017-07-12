/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.AlmacenUrls;

/**
 *
 * @author annelkaren
 */
public interface AlmacenDAO extends GenericDAO<AlmacenUrls, Integer>{
    
    boolean guardarAlmacen(AlmacenUrls almacen);
    
}
