/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.movil.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "automoviles")
public class Automovil implements Serializable {

    @Lob
    @Column(name = "foto")
    private byte[] foto;

    private static final long serialVersionUID = 1L;
    @Id
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
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "automovilId")
    private Collection<Viaje> viajesCollection;

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


    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Collection<Viaje> getViajesCollection() {
        return viajesCollection;
    }

    public void setViajesCollection(Collection<Viaje> viajesCollection) {
        this.viajesCollection = viajesCollection;
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
        return "com.mbn.movil.model.entities.Automoviles[ automovilId=" + automovilId + " ]";
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
}
