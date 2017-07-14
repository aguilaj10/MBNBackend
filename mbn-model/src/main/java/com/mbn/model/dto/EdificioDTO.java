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
 * @author lenovo
 */
public class EdificioDTO extends GenericDTO implements Serializable {
    private List<Edificio> edificios;
    private Edificio edificio;
    private String fechaInicio;
    private String fechaFin;

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
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
