/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dto;

import com.mbn.model.entities.Automovil;
import com.mbn.model.entities.Usuario;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MBN USER
 */
public class AutomovilDTO extends GenericDTO implements Serializable{
    private Automovil automovil;
    private String fotoAutomovil;
    private List<Usuario> conductores;

    /**
     * @return the automovil
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * @param automovil the automovil to set
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    /**
     * @return the fotoAutomovil
     */
    public String getFotoAutomovil() {
        return fotoAutomovil;
    }

    /**
     * @param fotoAutomovil the fotoAutomovil to set
     */
    public void setFotoAutomovil(String fotoAutomovil) {
        this.fotoAutomovil = fotoAutomovil;
    }

    /**
     * @return the conductores
     */
    public List<Usuario> getConductores() {
        return conductores;
    }

    /**
     * @param conductores the conductores to set
     */
    public void setConductores(List<Usuario> conductores) {
        this.conductores = conductores;
    }
}
