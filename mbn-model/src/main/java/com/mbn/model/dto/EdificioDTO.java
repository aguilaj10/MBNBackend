/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dto;

import com.mbn.model.entities.Edificio;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author usuario
 */
public class EdificioDTO implements Serializable{
    private Edificio edificio;
    private List<Edificio> edificios;

    /**
     * @return the edificio
     */
    public Edificio getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    /**
     * @return the edificios
     */
    public List<Edificio> getEdificios() {
        return edificios;
    }

    /**
     * @param edificios the edificios to set
     */
    public void setEdificios(List<Edificio> edificios) {
        this.edificios = edificios;
    }
}
