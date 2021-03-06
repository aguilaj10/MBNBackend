/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Annel
 */
public class GenericDTO {
    /**
     *  tipoMensaje almacena 1 para error, 2 para advertencia y 3 para información correcta
     *  codigoMensaje descripción del mensaje que se mostrará en pantalla
     */
    @Deprecated
    private int tipoMensaje;
    @Deprecated
    private String codigoMensaje;
    private int valor;
    private List<Error> errores;
    
    /**
     * @return the tipoMensaje
     */
    public int getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * @param tipoMensaje the tipoMensaje to set
     */
    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    /**
     * @return the codigoMensaje
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * @param codigoMensaje the codigoMensaje to set
     */
    public void setCodigoMensaje(String codigoMensaje) {
        this.codigoMensaje = codigoMensaje;
    }

    /**
     * @return the errores
     */
    public List<Error> getErrores() {
        if(errores == null)
            errores = new ArrayList<>();
        return errores;
    }

    /**
     * @param errores the errores to set
     */
    public void setErrores(List<Error> errores) {
        this.errores = errores;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    

}
