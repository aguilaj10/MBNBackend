/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MBN USER
 */
@Entity
@Table(name = "automoviles")
public class Automovil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "automovil_id")
    private Integer automovilId;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "placas")
    private String placas;
    @Basic(optional = false)
    @Column(name = "capacidad")
    private int capacidad;
    //@Lob
    @Column(name = "foto")
    private byte[] foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "automovilId")
    private Collection<AutomovilUsuario> automovilesUsuariosCollection;

    public Automovil() {
    }

    public Automovil(Integer automovilId) {
        this.automovilId = automovilId;
    }

    public Automovil(Integer automovilId, int capacidad) {
        this.automovilId = automovilId;
        this.capacidad = capacidad;
    }

    public Integer getAutomovilId() {
        return automovilId;
    }

    public void setAutomovilId(Integer automovilId) {
        this.automovilId = automovilId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @XmlTransient @JsonIgnore
    public Collection<AutomovilUsuario> getAutomovilesUsuariosCollection() {
        return automovilesUsuariosCollection;
    }

    public void setAutomovilesUsuariosCollection(Collection<AutomovilUsuario> automovilesUsuariosCollection) {
        this.automovilesUsuariosCollection = automovilesUsuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (automovilId != null ? automovilId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Automovil)) {
            return false;
        }
        Automovil other = (Automovil) object;
        if ((this.automovilId == null && other.automovilId != null) || (this.automovilId != null && !this.automovilId.equals(other.automovilId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.Automoviles[ automovilId=" + automovilId + " ]";
    }
    
}
