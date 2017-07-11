/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dao;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.mbn.model.entities.Edificio;
import java.util.List;
/**
 *
 * @author Charlie
 */
public interface EdificioDAO extends GenericDAO<Edificio , Integer>{
    List<Edificio> obtenerEdificios();
    void eliminarEdificioPorId(Integer id);
    void guardarEdificio(Edificio edificio);
    Edificio obtenerEdificioPorId(Integer id);
}
