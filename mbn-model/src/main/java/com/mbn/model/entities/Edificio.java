/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "edificios")

public class Edificio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "edificio_id")
    private Integer edificioId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estacionamiento")
    private Boolean estacionamiento;
    @OneToMany(mappedBy = "edificioId")
    private Collection<Habitacion> habitacionesCollection;

    public Edificio() {
    }

    public Edificio(Integer edificioId) {
        this.edificioId = edificioId;
    }

    public Edificio(Integer edificioId, String nombre) {
        this.edificioId = edificioId;
        this.nombre = nombre;
    }

    public Integer getEdificioId() {
        return edificioId;
    }

    public void setEdificioId(Integer edificioId) {
        this.edificioId = edificioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Collection<Habitacion> getHabitacionesCollection() {
        return habitacionesCollection;
    }

    public void setHabitacionesCollection(Collection<Habitacion> habitacionesCollection) {
        this.habitacionesCollection = habitacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (edificioId != null ? edificioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Edificio)) {
            return false;
        }
        Edificio other = (Edificio) object;
        if ((this.edificioId == null && other.edificioId != null) || (this.edificioId != null && !this.edificioId.equals(other.edificioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.movil.model.entities.Edificios[ edificioId=" + edificioId + " ]";
    }
    
}
